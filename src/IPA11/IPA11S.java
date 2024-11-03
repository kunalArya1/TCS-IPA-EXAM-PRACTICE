package IPA11;

import java.util.Scanner;

public class IPA11S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motel [] arr = new Motel[4];
        for (int i = 0; i < arr.length; i++) {
            int motelId = sc.nextInt();sc.nextLine();
            String motelName = sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();sc.nextLine();
            String cabFacility = sc.nextLine();
            double totalBill = sc.nextDouble();
            sc.nextLine();

            arr[i] = new Motel(motelId,motelName,dateOfBooking,noOfRoomsBooked,cabFacility,totalBill);
        }
        String cabFacility = sc.nextLine();
        int result = totalNoOfRoomsBooked(arr,cabFacility);

        if(result > 0){
            System.out.println(result);

        }else {
            System.out.println("No such rooms booked");
        }
    }
    public static int totalNoOfRoomsBooked(Motel [] motels , String cabFacility){
        int count = 0;
        for (int i = 0; i < motels.length; i++) {
            if(motels[i].getCabFacility().equalsIgnoreCase(cabFacility)){
                count++;
            }
        }
        if (count > 0 ){
            return count;
        }else return 0;
    }
}

class Motel {
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill) {
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }

    public int getMotelId() {
        return motelId;
    }

    public String getMotelName() {
        return motelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public String getCabFacility() {
        return cabFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }
}