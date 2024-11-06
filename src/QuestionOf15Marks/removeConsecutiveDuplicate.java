package QuestionOf15Marks;

import java.util.Scanner;

public class removeConsecutiveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = "";
        char previousChar = str.charAt(0);
        result += previousChar;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if( previousChar != currentChar){
                result += currentChar;
                previousChar = currentChar;
            }
        }

        System.out.println(result);
    }
}
