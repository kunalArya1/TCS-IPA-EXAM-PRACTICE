package IPA18;

import java.util.Arrays;
import java.util.Scanner;

public class IPA18S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine [] arr = new Medicine[4];
        for (int i = 0; i < arr.length; i++) {
            String medicineName = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();sc.nextLine();

            arr[i] = new Medicine(medicineName,batch,disease,price);
        }

        String disease = sc.nextLine();
        int [] arr3 = getPriceByDisease(arr,disease);

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
    public static int[] getPriceByDisease(Medicine[] medicines, String disease){
        int [] arr2 = new int[0];
        for (int i = 0; i < medicines.length; i++) {
            if (medicines[i].getDisease().equalsIgnoreCase(disease)){
                arr2 = Arrays.copyOf(arr2,arr2.length + 1);
                arr2[arr2.length - 1] = medicines[i].getPrice();
            }
        }
        Arrays.sort(arr2);
        return arr2;
    }
}

class Medicine {
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public String getDisease() {
        return disease;
    }

    public int getPrice() {
        return price;
    }
}
