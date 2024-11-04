package IPA16;

import java.util.Arrays;
import java.util.Scanner;

public class IPA16S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee [] arr = new Employee[4];
        for (int i = 0; i < arr.length; i++) {
            int empId = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = sc.nextDouble();sc.nextLine();
            boolean transport = sc.nextBoolean();sc.nextLine();

            arr[i] = new Employee(empId,name,branch,rating
            ,transport);
        }
        String branch = sc.nextLine();
        int numberOfEmp = findCountOfEmployeesUsingCompTransport(arr,branch);
        if (numberOfEmp > 0 ){
            System.out.println(numberOfEmp);
        }else{
            System.out.println("No such Employees");
        }
        Employee result  = findEmployeeWithSecondHighestRating(arr);
        if (result != null){
            System.out.println(result.getEmployeeId() + " : " + result.getName());
        }else {
            System.out.println("All Employees using company transport");
        }
    }
    public static int findCountOfEmployeesUsingCompTransport(Employee [] employee ,String usingTransport){
        int count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getBranch().equals(usingTransport) && employee[i].isTransport()){
                count++;
            }
        }
        if (count > 0){
            return count;
        }else{
            return 0;
        }
    }

    public static Employee findEmployeeWithSecondHighestRating(Employee [] employees){
        Employee [] arr2 = new Employee[0];
        for (int i = 0; i < employees.length; i++) {
            if (!employees[i].isTransport()){
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1 ] = employees[i];
            }
        }

        // Sort the array based on rating
        Employee val;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if (arr2[i].getRating() < arr2[j].getRating()){
                    val = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = val;
                }
            }
        }
        if (arr2.length >= 2 ){
            return arr2[1];
        }else {
            return null;
        }
    }
}
class Employee {
    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;

    public Employee(int employeeId, String name, String branch, double rating, boolean transport) {
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getRating() {
        return rating;
    }

    public boolean isTransport() {
        return transport;
    }
}
