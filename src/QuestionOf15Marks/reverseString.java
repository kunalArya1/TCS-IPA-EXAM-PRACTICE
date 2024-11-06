package QuestionOf15Marks;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // First Method
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        System.out.println(str1.toString());

        // Second Method
        char [] arr = str.toCharArray();

        int left = 0;
        int right = arr.length -1;

        while ( left < right ){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));
    }
}
