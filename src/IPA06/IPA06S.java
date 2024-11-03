package IPA06;

import java.util.Arrays;
import java.util.Scanner;

public class IPA06S {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Medicine [] arr = new Medicine[4];
        for (int i = 0; i < arr.length; i++) {
            String MedicineName = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();sc.nextLine();

            arr[i] = new Medicine(MedicineName,batch,disease,price);
        }
        String disease = sc.nextLine();

        int [] result = getPriceByDisease(arr,disease);
        if(result != null){
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }else{
            System.out.println("No Medicine Found");
        }


     }
    public static int[] getPriceByDisease( Medicine [] medicine, String disease){

        int [] arr2 = new int[0];

        for (int i = 0; i < medicine.length; i++) {
            if(medicine[i].getDisease().equalsIgnoreCase(disease)){
                arr2 = Arrays.copyOf(arr2 ,arr2.length + 1);
                arr2[arr2.length - 1] = medicine[i].getPrice();

            }
        }
        Arrays.sort(arr2);
        if(arr2.length > 0){
            return arr2;
        }
        else{
            return null;
        }
    }
}

class Medicine {
    private String MedicineName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String MedicineName, String batch,String disease,int price){
        this.MedicineName = MedicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName() {
        return MedicineName;
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