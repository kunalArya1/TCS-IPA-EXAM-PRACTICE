package QuestionOf15Marks;

import java.util.Scanner;

public class oddIndex {
    public static void main(String[] args) {

        // Question 1
        /* Find Characters of a string at odd index
         * Arijit = rjt
         * priyanka = ryna
         */


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(i % 2 != 0){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
