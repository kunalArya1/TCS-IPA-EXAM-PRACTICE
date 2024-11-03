package IPA10;

import java.util.Scanner;

public class IPA10S {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        College [] arr = new College[4];
        for (int i = 0; i < arr.length; i++) {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int contactNo = sc.nextInt();sc.nextLine();
            String address = sc.nextLine();
            int pinCode = sc.nextInt();
            sc.nextLine();


            arr[i] = new College(id,name,contactNo,address,pinCode);
        }

        String address = sc.nextLine();


        College maxPinCodeCollege = findCollegeWithMaximumPinCode(arr);

        if (maxPinCodeCollege != null
        ){
            System.out.println(maxPinCodeCollege.getId());
            System.out.println(maxPinCodeCollege.getName());
            System.out.println(maxPinCodeCollege.getContactNo());
            System.out.println(maxPinCodeCollege.getAddress());
            System.out.println(maxPinCodeCollege.getPinCode());
        }
        else {
            System.out.println("No college found with mentioned attribute");
        }


        System.out.println("Second Object ");

        College result = searchCollegeByAddress(arr,address);
        if(result != null){
            System.out.println(result.getId());
            System.out.println(result.getName());
            System.out.println(result.getContactNo());
            System.out.println(result.getAddress());
            System.out.println(result.getPinCode());
        }
        else{
            System.out.println("No college found with mentioned attribute");
        }


    }
    public static College findCollegeWithMaximumPinCode(College [] college){
        if (college == null || college.length == 0) {
            return null; // Return null if the input array is empty
        }
        College max = college[0];
        for (int i = 0; i < college.length; i++) {
            if (college[i].getPinCode() > max.getPinCode() ){
                max = college[i];
            }
        }
        return max;
    }

    public static College searchCollegeByAddress(College [] college , String address){
        for (int i = 0; i < college.length; i++) {
            if(college[i].getAddress().equalsIgnoreCase(address)){
                return college[i];
            }
        }
        return  null;
    }
}

class  College {
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pinCode;

    public College(int id, String name,int contactNo,String address ,int pinCode){
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pinCode = pinCode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public int getPinCode() {
        return pinCode;
    }
}