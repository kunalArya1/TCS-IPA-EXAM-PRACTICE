//package IPA19;
//
//import java.util.Scanner;
//
//public class IPA19S {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        AutonomousCar [] arr = new AutonomousCar[4];
//        for (int i = 0; i < arr.length; i++) {
//            int cardId = sc.nextInt();sc.nextLine();
//            String brand = sc.nextLine();
//            int noOfTestedConducted = sc.nextInt();sc.nextLine();
//            int noOfTestedPassed = sc.nextInt();sc.nextLine();
//            String environment = sc.nextLine();
//
//            arr[i] = new AutonomousCar(cardId,brand,noOfTestedConducted,noOfTestedPassed,environment);
//        }
//
//    }
//    public static int findTestPassedByEnv(AutonomousCar [] autonomousCars,String environment ){
//        int sum = 0;
//        for (int i = 0; i < autonomousCars.length; i++) {
//            if (autonomousCars[i].getEnvironment().equals(environment)){
//                sum += autonomousCars[i].getNoOfTestsPassed();
//            }
//        }
//        if (sum > 0 ){
//            return sum;
//        }else {
//            return 0;
//        }
//    }
//
//    public static AutonomousCar
//}
//
//class AutonomousCar {
//    private int carId;
//    private String  brand;
//    private int noOfTestsConducted;
//    private int noOfTestsPassed;
//    private String environment;
//
//    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
//        this.carId = carId;
//        this.brand = brand;
//        this.noOfTestsConducted = noOfTestsConducted;
//        this.noOfTestsPassed = noOfTestsPassed;
//        this.environment = environment;
//    }
//
//    public int getCarId() {
//        return carId;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public int getNoOfTestsConducted() {
//        return noOfTestsConducted;
//    }
//
//    public int getNoOfTestsPassed() {
//        return noOfTestsPassed;
//    }
//
//    public String getEnvironment() {
//        return environment;
//    }
//}