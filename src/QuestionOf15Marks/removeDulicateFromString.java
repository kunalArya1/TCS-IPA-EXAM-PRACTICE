package QuestionOf15Marks;

import java.util.Scanner;

public class removeDulicateFromString {
    public static void main(String[] args) {

        /* Remove  duplicate characters in a string
         *
         * Input : Arijit Ghosh
         * Output : Arijt Ghos
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch = "";
        int i,j;
        for (i = 0; i < str.length(); i++) {
            for (j = 0; j < i; j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    break;
                }
            }
            if(i==j)
            {
                ch = ch+str.charAt(i);
            }
        }
        System.out.println("New string removing Duplicates : "+ch);
    }
}
