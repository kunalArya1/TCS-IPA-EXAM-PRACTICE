package IPA02;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class IPA02S {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Phone [] arr = new Phone[4];

        for (int i = 0; i < arr.length; i++) {
            int phoneId = sc.nextInt();sc.nextLine();
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            arr[i] = new Phone(phoneId,os,brand,price);
        }
        String brand = sc.nextLine();
        String os = sc.nextLine();
        int price = findPriceForGivenBrand(arr,brand);
        if(price > 0 ){

            System.out.println(price);
        }else{
            System.out.println("The given Brand is not available");
        }
        Phone result = getPhoneIdBasedOnOs(os,arr);
        if(result == null){
            System.out.println("No phones are available with specified os and price range");
        }else{
            System.out.println(result.getPhoneId());
        }
    }
    public static int findPriceForGivenBrand(Phone[] phones ,String brand) {
        int sum = 0;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getBrand().equalsIgnoreCase(brand)) {
                sum += phones[i].getPrice();
            }

        }
        if (sum < 0) {

            return 0;
        }
        return sum;
    }
    public static Phone getPhoneIdBasedOnOs(String os,Phone[] phones){
        for (int i = 0; i < phones.length; i++) {
            if(phones[i].getOs().equalsIgnoreCase(os)){
                if(phones[i].getPrice() >= 50000){
                    return phones[i];
                }
            }
        }
        return null;
    }
}

class Phone {
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public int getPhoneId(){
        return phoneId;
    }
    public String getOs(){
        return os;
    }
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }

    public Phone(int phoneId,String os,String brand,int price){
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
}
