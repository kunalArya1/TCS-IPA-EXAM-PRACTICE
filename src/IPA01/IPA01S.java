package IPA01;

import java.util.Scanner;

public class IPA01S {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TravelAgencies [] arr = new TravelAgencies[4];
        for (int i = 0; i < arr.length ; i++) {
            int regNo = sc.nextInt();
            sc.nextLine();
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            boolean flightFacility = sc.nextBoolean();

            arr[i] = new TravelAgencies(regNo,agencyName,packageType,price,flightFacility);



        }
        int regNoP = sc.nextInt();
        sc.nextLine();
        String packageTypeP = sc.nextLine();


        int maxPrice = findAgencyWithHighestPackagePrice(arr);
        System.out.println();
        System.out.println(maxPrice);

        TravelAgencies result = agencyDetailsForGivenLdAndType(arr,regNoP,packageTypeP);
        System.out.println(result.getAgencyName() + ":" + result.getPrice());

    }
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] travelAgency ){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < travelAgency.length; i++) {
            if(max < travelAgency[i].getPrice()){
                max = travelAgency[i].getPrice();
            }
        }
        if(max < 0){
            return 0;
        }
        return max;
    }
    public static TravelAgencies agencyDetailsForGivenLdAndType(TravelAgencies[] travelAgency ,int regNo ,String packageType){
        for (int i = 0; i < travelAgency.length; i++) {
            if(travelAgency[i].getFlightFacility()){
                if(travelAgency[i].getRegNo() == regNo && travelAgency[i].getPackageType().equals(packageType)){
                    return travelAgency[i];
                }
            }
        }

        return null;
    }
}

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean getFlightFacility() {
        return flightFacility;
    }

    public TravelAgencies(int regNo,String agencyName,String packageType,int price,boolean flightFacility){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType= packageType;
        this.price = price;
        this.flightFacility= flightFacility;
    }
}