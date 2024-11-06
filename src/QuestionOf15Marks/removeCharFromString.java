package QuestionOf15Marks;

import java.util.Scanner;

public class removeCharFromString {
    public static void main(String[] args) {
        /* Remove a character from a string
         * Input
         * --------------
         * Arijit
         * i
         * Output
         * ---------------
         * Arjt
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        String str2 = "";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) != ch ){
                str2 += str.charAt(i);
            }
        }
        System.out.println(str2);

    }
}
