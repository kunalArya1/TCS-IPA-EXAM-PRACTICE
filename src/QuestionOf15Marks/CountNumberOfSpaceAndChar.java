package QuestionOf15Marks;

import java.util.Scanner;

public class CountNumberOfSpaceAndChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int charCount = 0;
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                charCount++;
            } else if (Character.isSpaceChar(str.charAt(i))) {
                spaceCount++;
            }
        }
        System.out.println("Char Count :- " + charCount + " : " + "Space Count :- " + spaceCount);
    }
}
