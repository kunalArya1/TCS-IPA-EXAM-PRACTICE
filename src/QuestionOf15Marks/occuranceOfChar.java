package QuestionOf15Marks;

import java.util.Scanner;

public class occuranceOfChar {
    public static void main(String[] args) {


        /* Find occurance of a character in a string
            Input
            --------------
         *  Priyanka
         *  a

         *  Output
            ----------------
         *  2
 */


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
