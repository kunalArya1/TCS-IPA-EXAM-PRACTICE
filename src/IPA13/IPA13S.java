package IPA13;

import java.util.Arrays;
import java.util.Scanner;

public class IPA13S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim [] arr = new Sim[5];

        for (int i = 0; i < arr.length; i++) {
            int simId = sc.nextInt();sc.nextLine();
            String customerName = sc.nextLine();
            double balance = sc.nextDouble();sc.nextLine();
            double ratePerSecond = sc.nextDouble();sc.nextLine();
            String circle = sc.nextLine();

            arr[i] = new Sim(simId,customerName,balance,ratePerSecond,circle);
        }
        String oldCircle = sc.nextLine();
        String newCircle = sc.nextLine();

        Sim [] result = transferCustomerCircle(arr,oldCircle,newCircle);

        if (result.length > 0){
            for (int i = 0; i < result.length; i++) {
                System.out.println( result[i].getSimId() + " : " + result[i].getCustomerName() +" : " + result[i].getCircle() + " : " + result[i].getRatePerSecond());
            }
        }else{
            System.out.println("No Match Found");
        }
    }
    public static Sim [] transferCustomerCircle( Sim [] sim , String circleToBeTransfer, String newCircle){
        Sim [] arr2 = new Sim[0];
        for (int i = 0; i < sim.length; i++) {
            if (sim[i].getCircle().equals(circleToBeTransfer)){
                sim[i].setCircle(newCircle);
                arr2 = Arrays.copyOf(arr2,arr2.length + 1);
                arr2[arr2.length - 1 ] = sim[i];
            }
        }
        if (arr2.length > 0 ){
            return arr2;
        }else{
            return null;
        }
     }
}

class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int simId,String customerName,double balance,double ratePerSecond,String circle){
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }
    public void setCircle(String circle){
        this.circle = circle;
    }
}