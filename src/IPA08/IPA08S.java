package IPA08;

import java.util.Arrays;
import java.util.Scanner;

public class IPA08S {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        FootWear [] arr = new FootWear[5];
        for (int i = 0; i < arr.length; i++) {
            int footwearId = sc.nextInt();sc.nextLine();
            String footwearName = sc.nextLine();
            String footwearType = sc.nextLine();
            int price = sc.nextInt();sc.nextLine();

            arr[i] = new FootWear(footwearId,footwearName,footwearType,price);
        }

        String footwearType = sc.nextLine();
        String footwearName = sc.nextLine();

        int footwearCount = getCountByType(arr,footwearType);

        if(footwearCount > 0){
            System.out.println(footwearCount);
        }else{
            System.out.println("Footwear not available");
        }

        FootWear result = getSecondHighestPriceByBrand(arr,footwearName);
        if(result != null){
            System.out.println(result.getFootWearId());
            System.out.println(result.getFootWearName());
            System.out.println(result.getPrice());
        }else {
            System.out.println("Brand not available");
        }

    }

    public static int getCountByType( FootWear [] footwear , String footwearType){
        int count = 0;
        for (int i = 0; i < footwear.length; i++) {
            if(footwear[i].getFootWearType().equalsIgnoreCase(footwearType)){
                count++;
            }
        }
        if (count > 0){
            return count;
        }else {
            return 0;
        }
    }

    public static FootWear getSecondHighestPriceByBrand(FootWear [] footWears , String footwearName){
        FootWear [] arr2 = new FootWear[0];
        for (int i = 0; i < footWears.length; i++) {
            if(footWears[i].getFootWearName().equals(footwearName)){
                arr2 = Arrays.copyOf(arr2,arr2.length + 1);
                arr2[arr2.length -1 ] = footWears[i];
            }
        }
        FootWear temp;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1 ; j < arr2.length; j++) {
                if(arr2[i].getPrice() > arr2[j].getPrice()){
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        if(arr2.length < 2 ){
            return null;
        }else {
            return arr2[arr2.length - 2 ];
        }
    }
}


class FootWear {
    private int footWearId;
    private String footWearName;
    private String footWearType;
    private int price;

    public FootWear(int footWearId,String footWearName,String footWearType,int price){
        this.footWearId = footWearId;
        this.footWearName = footWearName;
        this.footWearType = footWearType;
        this.price = price;
    }

    public int getFootWearId() {
        return footWearId;
    }

    public String getFootWearName() {
        return footWearName;
    }

    public String getFootWearType() {
        return footWearType;
    }

    public int getPrice() {
        return price;
    }
}