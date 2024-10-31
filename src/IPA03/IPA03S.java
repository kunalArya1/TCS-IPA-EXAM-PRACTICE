package IPA03S;
import java.util.Scanner;

public class IPA03S {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Institution[] arr = new Institution[4];

        for (int i = 0; i < arr.length; i++) {
            int institutionId = sc.nextInt();
            sc.nextLine();  // Clear newline to avoid skipping input on nextLine (Mistake: this was missing)

            String institutionName = sc.nextLine();
            int noOfStudentsPlaced = sc.nextInt();
            sc.nextLine();  // Clear newline to avoid skipping input on nextLine (Mistake: this was missing)

            int noOfStudentsCleared = sc.nextInt();
            sc.nextLine();  // Clear newline to avoid skipping input on nextLine (Mistake: this was missing)

            String location = sc.nextLine();

            // Initializing the array element with proper inputs
            arr[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        }

        String location = sc.nextLine();
        String institutionName = sc.nextLine();

        // First Method
        int noOfClearance = FindNumClearedByLoc(arr, location);
        if (noOfClearance > 0) {
            System.out.println(noOfClearance);
        } else {
            System.out.println("There are no cleared students in this particular location");
        }

        // Second Method
        Institution result = UpdateInstitutionGrade(institutionName, arr);
        if (result == null) {
            System.out.println("No Institute is available with the specified name");
        } else {
            System.out.println(result.getInstitutionName() + "::" + result.getGrade());
        }
    }

    public static int FindNumClearedByLoc(Institution[] institutions, String location) {
        int sum = 0;
        for (Institution institution : institutions) {
            if (institution.getLocation().equals(location)) {
                sum += institution.getNoOfStudentsCleared();
            }
        }
        return Math.max(sum, 0);  // Ensures non-negative return even if no students cleared (Mistake: previously checked if sum < 0, which was unnecessary)
    }

    public static Institution UpdateInstitutionGrade(String institutionName, Institution[] institutions) {
        for (Institution institution : institutions) {
            if (institution.getInstitutionName().equals(institutionName)) {
                int rating = (institution.getNoOfStudentsPlaced() * 100) / institution.getNoOfStudentsCleared();

                // Setting grade based on calculated rating
                if (rating >= 80) {
                    institution.setGrade("A");
                } else {
                    institution.setGrade("B");
                }
                return institution;
            }
        }
        return null;  // Returns null if no institution matches the specified name
    }
}

class Institution {
    private final int institutionId;
    private final String institutionName;
    private final int noOfStudentsPlaced;
    private final int noOfStudentsCleared;
    private final String location;
    private String grade;

    public int getInstitutionId() {
        return institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;  // Mistake: was incorrectly set with getNoOfStudentsCleared() in the constructor
        this.location = location;
    }
}
