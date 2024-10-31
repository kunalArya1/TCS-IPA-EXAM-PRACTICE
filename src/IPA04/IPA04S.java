package IPA04;

import java.util.Scanner;

public class IPA04S {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Inventory [] arr = new Inventory[4];
        for (int i = 0; i < arr.length; i++) {
            String inventoryId = sc.nextLine();
            int maximumQuantity = sc.nextInt();
            sc.nextLine();
            int currentQuantity = sc.nextInt();
            sc.nextLine();
            int threshold = sc.nextInt();
            sc.nextLine();

            arr[i] = new Inventory(inventoryId,maximumQuantity,currentQuantity,threshold);
        }

        int limit = sc.nextInt();
        sc.nextLine();

        Inventory [] arr2 = Replenish(arr,limit);

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i].getThreshold() > 75 ){
                System.out.println(arr2[i].getThreshold() + "Critical Filling");
            }else if(arr2[i].getThreshold() > 50 && arr2[i].getThreshold() < 70 ){
                System.out.println(arr2[i].getThreshold()+"Moderate Filling");
            }else{
                System.out.println(arr2[i].getThreshold() + "Non-Critical Filling");
            }
        }
    }
    public static Inventory[] Replenish(Inventory [] inventory ,int limit ){
        Inventory [] arr = new Inventory[4];
        for (int i = 0; i < inventory.length; i++) {
            if(limit >= inventory[i].getThreshold()){
                arr[i] = inventory[i];
            }
        }
        return arr;
    }

}

class Inventory{
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    public String getInventoryId(){
        return inventoryId;
    }
    public int getMaximumQuantity(){
        return maximumQuantity;
    }
    public int getCurrentQuantity(){
        return currentQuantity;
    }
    public int getThreshold(){
        return threshold;
    }

    public Inventory(String inventoryId,int maximumQuantity,int currentQuantity,int threshold){
        this.inventoryId = inventoryId;
        this.maximumQuantity= maximumQuantity;
        this.currentQuantity= currentQuantity;
        this.threshold= threshold;
    }
}