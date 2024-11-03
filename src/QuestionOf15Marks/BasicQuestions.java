package QuestionOf15Marks;

import java.util.Arrays;

public class BasicQuestions {

    // 1. Write a program to check if a given string is a palindrome.
    public static  boolean isPalindrome(int num){
        /*
            steps:
                1. take a variable temp to store the value of num
                2. take a variable reverseNum = 0
                3. extract the last digit of number by module operation
                4. construct the number by revereNum = reverseNum * 10 + digit
                5. eliminate the last digit of number by division operation
        * */

        int temp = num ;
        int reverseNum = 0;
        while (num > 0){
            int digit = num % 10;
            reverseNum = (reverseNum* 10 ) + digit;
            num = num / 10;
        }
        System.out.println(temp + " " + reverseNum);
        if(temp == reverseNum){
            return  true;
        }
        return false;
    }
    // 2. Write a program to check if two given strings are anagrams of each other.
    public  static boolean isAnagram(String str1, String str2){
        /*
            Steps:
                1. Find length of both of the string
                2. Compare the length of both string
                    I. if not equal then return false
                    II. if true then go to next step
                3. Convert the string to character array
                4. sort both the character array
                5. compare each element of the character array
                    I. if true then return true
                    II. if false then return false

        */
        boolean anagram = false;
        if( str1.length() != str2.length()) return false;

        // Convert the string to the character Array

        // Method 1: inbuilt java function [ toCharArray() ]
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        // Method 2: Using Manual work

        char[] charArray3 = new char[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            charArray3[i] = str1.charAt(i);
        }
        // Now sort the Char Array
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        // Compare each Element of both the array

        // Method: 1 using java inBuilt function
        anagram = Arrays.equals(charArray1,charArray2);

        // Method: 2 using manual work
        for (int i = 0; i < charArray1.length; i++) {
            if( charArray1[i] == charArray2[i]){
                anagram= true;
            }else{
                anagram = false;
            }

        }

        return anagram;
    }
    // 3. Write a program to print the first n numbers in the Fibonacci sequence.
    public  static  void printFibonacci( int n ){
        /*
                Steps:
                    1. create two variable first and second with 0 and 1 value respectively
                    2. move first to next term by assigning the value of second
                    3. move second to next term by assigning the sum of first and second in next variable to get next term in series
                    4. print second to get you series

         */

        int first = 0 ;
        int second = 1;
        System.out.print("Fibonacci Series using iteration:- ");
        for (int i = 0; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
    // 4. Write a program to check a number is prime or not
    public  static  boolean isPrime(int num){
        /*
            steps:
                1. Run a loop from int 2 to num
                2. check  whether the number is divisible by any digit
                3. if yes then return not prime else return prime
       */

        if(num <= 1){
            return false;
        }

        // We can check until square root of number using Math.sqrt(num) for best efficiency
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    // 5. Write a program to find the sum of the digits of a given number.
    public  static  int sumOfDigit(int num ){

        /*
            Steps:
                1. take a variable sum = 0
                2. extract last digit  by module operation
                3. add the digit into sum variable
                4. remove the last digit by divide operation
        * */

        int sum = 0;
        while (num > 0){
            int  digit = num % 10 ;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
    // 6. Write a  program to print the digit of an number.
    public  static void printDigitOfNumber(int num){
        /*
            Steps:
                1. Module Operation to get Last Digit
                2. Divide the number to remove the last digit
                3. Do until number become the zero
        * */

        while (num > 0){
            int digit  = num % 10;
            num = num /10;
            System.out.println(digit);
        }

    }
    // 7. Write a program to reverse a number
    public  static  int reverseANumber(int num){
        /*
            Steps:
                1. take a variable reverse with 0 value
                2. Module operation to extract the last digit
                3. construct reverse with reverse = reverse * 10 + digit
                4. Divide operation to remove the last digit of number

         */

        int reverseNumber = 0;
        while (num > 0){
            int digit = num % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            num = num / 10;
        }


        // for handling Zero

        /*
        Steps:
            1. Convert the number to a string.
            2. Reverse the string.
            3. Convert the reversed string back to a number if needed (or leave as a string to preserve leading zeros).
     */

//        String numStr = String.valueOf(num);
        // Another Mehtod
//        String numStr1 = Integer.toString(num);
        // Then convert to string builder

//        StringBuilder reverseStr = new StringBuilder(numStr).reverse();

//        int reverseNumber1 = Integer.parseInt(reverseStr);



        return reverseNumber;
    }
    // 8. Write a program to check if a given number is an Armstrong number.
    public static  boolean isArmstrong(int  num){

        // An Armstrong number (also known as a narcissistic number, plenary number, or plump number) is a number that is equal to
        // the sum of its own digits each raised to the power of the number of digits.
        int digitCount = String.valueOf(num).length();

        int digitPowSum = 0;
        int temp = num;
        while (num > 0 ){
            int digit = num % 10;
            digitPowSum += (int)Math.pow(digit,digitCount);
            num = num / 10;
        }
        return (temp == digitPowSum);
    }
    // 9. Program to Find the Sum of First N Natural Numbers using java
    public  static  int sumOfFirstNaturalNumber(int num){
        /*
            Steps:
                1. we can use formula (n*(n+1) / 2)
        * */
        return ((num * (num +1))/2 );
    }
    // 10. Find the Sum of the Numbers in a Given Range in Java
    public  static  int sumOfNumberInGivenRange(int start ,int end ){
        /*
            Steps:
                1. we can use iterative approach
                2. we can use formula which ((end- start + 1) * ( start + end )) / 2
                Example: start 2 and end 5 -> (4 * 7 ) / 2 = 14
        * */
        return ((end -start + 1 )*( start + end )) / 2;
    }
    // 11. Find the Greatest Number Among Three Numbers in Java
    public  static  int greatestNumberAmongThreeNumber(int num1 ,int num2,int num3){
        if( num1 > num2 && num1 > num3){
            return  num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }
        return num3;
    }
    // 12. Power of a number using Java
    public  static  int powerOfNumber( int num , int power ){
        // For handling the power of 0
        if(power < 0){
            return  1;
        }
        int powerNum = 1;
        for (int i = 0; i < power; i++) {
            powerNum = powerNum * num;
        }
        return  powerNum;
    }
    // 13. Check Whether or Not the Number is a Strong Number in Java
    public static boolean isStrongNumber(int num){

        // A strong number (also known as a strong Harshad number) is a number
        // that equals the sum of the factorial of its digits.
        int sumOfFactorial = 0;
        int temp = num;
        while ( num > 0){
            int digit = num % 10;
            sumOfFactorial += factorialOfNumber(digit);
            num = num / 10;
        }
        return  ( temp == sumOfFactorial);
    }
    // 14. Check Whether or Not the Number is a Perfect Number in Java
    public static boolean isPerfectNumber(int num){
        int sum = 0;
        for (int i = 1; i < num ; i++) {
            if(num % i == 0){
                sum += i;
            }
        }
        return (sum == num);
    }
    // 15. Check Whether Or Not the Number is an Automorphic Number in Java
    public static boolean isAutomorphicNumber( int num ){
        // An automorphic number, also known as a circular number or a pernicious number,
        // is a number whose square ends with the number itself.

        int square = (num * num);
        int lastDigit = square % 10;

        return  (lastDigit == num);
    }
    // 16. Harshad number or not using Java
    public static boolean isHarshdNumber(int num ){
        int digitSum = 0;
        int temp = num;
        //A Harshad number (also known as Niven number) is a number that is divisible by the sum of its digits.
        while (num > 0){
            int digit = num % 10;
            digitSum += digit;
            num = num /10;
        }
        return (temp % digitSum == 0);
    }
    // 17. Abundant Number or not in Java
    public static boolean isAbundantNumber(int num){
        int sum = 0;
        for (int i = 1; i < num ; i++) {
            if(num % i == 0){
                sum += i;
            }
        }
        return (sum > num);

    }
    // 18. Check Whether or Not the Year is a Leap Year in Java
    public static boolean isLeapYear(int year ){

        // A year is normally considered a leap year if it is divisible by 4.
        //However, if a year is divisible by 100,
        // it must also be divisible by 400 to be considered a leap year.

        if(year % 4  == 0){
            if( year % 100 != 0 || year % 400 == 0){
                return  true;
            }
        }
        return  false;
    }
    // 19. Find the Factors of a Number in Java
    public static void printFactorOfNumber(int num){
        for (int i = 1; i <= num /2; i++) {
            if(num % i == 0){
                System.out.println("Factor of "+ num +" is :- " +i);
            }
        }
    }
    // 20. Check for Perfect Square in Java
    public static boolean isPerfectSquare(int num){
        int squareRootNumber = (int)Math.sqrt(num);

        return (squareRootNumber * squareRootNumber) == num ;
    }
    // 21. Friendly pair or not (amicable or not) using Java
    public static boolean checkFriendlyPair(int num1,int num2){
        /*

            A "friendly pair" or "friendly numbers" are pairs of numbers that share
            the same abundancy index.The abundancy index of a number is defined as
            the sum of its divisors divided by the number itself.

            Setps:
                Calculate the sum of divisors for each number:
                                Find all divisors of the number and sum them up.
                Calculate the abundancy index:
                                Divide the sum of the divisors by the number itself.
                Compare the abundancy indices:
                                If the abundancy indices are equal, the numbers are friendly.
         */

        int sumOfDivisorOfNumber1 = sumOfDivisorOfNumber(num1);
        int sumOfDivisorOfNumber2 = sumOfDivisorOfNumber(num2);

        double abundancyIndexOfNum1 = (double) (sumOfDivisorOfNumber1 / num1);
        double abundancyIndexOfNum2 = (double) (sumOfDivisorOfNumber2 / num2);

        return abundancyIndexOfNum1 == abundancyIndexOfNum2;
    }
    // 22. Factorial of a Number in Java
    public static int factorialOfNumber(int num ){

        // if num is smaller than zero then
        if(num < 0 ){
            return -1;
        }
        // this is for factorial of 0
        if(num ==0){
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact *= i;
        }
        return fact;
    }
    // 23. Program for Finding out the Prime Factors of a number in Java
    public static void printPrimeFactorOfNumber(int num ){
        System.out.print("Prime Factor of Number is :- ");
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                if (isPrime(i)){
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
    // 24. Find the Prime Numbers in a Given Interval in Java
    public static void printPrimeNumberInGivenRange(int start,int end){
        System.out.print("Prime Number in Range:- ");
        for (int i = start; i <= end  ; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    // 25. Armstrong Numbers between Two Intervals using Java
    public static void printArmstrongNumberInInterval(int start , int end){
        System.out.print("Armstrong Number in Range :- ");
        for (int i = start; i <= end ; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    // 26. Find the Fibonacci Series up to Nth Term in Java
    public static void printFibonacciSeriesUpToNthTerm(int num){
        printFibonacci(num);
    }
    // 27. Find Square root of a num
    public static int squareRootOfNumber(int num){

        /*
            Steps:
                Algorithm:
                    We will first declare a variable called ‘ans’.
                    Then, we will first run a loop(say i) from 1 to n.
                    Until the value i*i <= n, we will update the variable ‘ans’, with i.
                    Once, the value i*i becomes greater than n, we will break out from the loop as the current number i, or the numbers greater than i, cannot be our answers.
                    Finally, our answer should have been stored in ‘ans’.

        */


        int ans= 0;
        for (int i = 1; i < num; i++) {
            if(i * i <= num){
                ans = i;
            }
            else{
                break;
            }
        }
        return ans;
    }
    // 28. Find the sum of divisor of a number
    public static int sumOfDivisorOfNumber(int num){
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if(num % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    // 29. Write a program to print the first n numbers in the Fibonacci sequence using recursion.
    public static int findNthFibonacciNumberUsingRecursion(int n){
        if (n <= 1){
            return n;
        }

        return (findNthFibonacciNumberUsingRecursion(n-1) + findNthFibonacciNumberUsingRecursion(n-2));
    }
    // 30. Write a program to print fibonacci series using recursion
    public static void printFibonacciSeries(int n, int first , int second ){
        if(n > 0){
            System.out.print(first + " ");
            printFibonacciSeries(n-1,second,first+second);
        }
    }
    public static void printFibonacciSeriesUsingRecursion(int n){
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Series using the Recursion :- ");
        printFibonacciSeries(n + 1,first,second);


    }
    // 31. Write a program to print Nth fibonacci number using iteration
    public static int findNthFibonacciNumberUsingIteration(int n){
        if (n <= 1)
            return n;

        int first =0;
        int second =1;
        for (int i = 1; i < n; ++i) {
            int next = first + second;
            first = second;
            second = next;

        }
        return  second;
    }

    public static void main(String[] args) {
        printDigitOfNumber(450);
        System.out.println("Reverse of Number is :- "+reverseANumber(451));
        System.out.println( "Sum of Digit of Number is :- " +sumOfDigit(6572829));
        System.out.println("Number is Palindrome :- " + isPalindrome(121212));
        System.out.println("Number is Prime :- " + isPrime(12));
        System.out.println("Sum of First Natural Number is :- "+ sumOfFirstNaturalNumber(101));
        System.out.println("Sum of Number in given Range is :- " + sumOfNumberInGivenRange(1,100) );
        System.out.println("Greatest Among Three Number :- " + greatestNumberAmongThreeNumber(0,-3,-1));
        System.out.println("Power of Number is :- "+powerOfNumber(2,5
        ));
        System.out.println("Square Root of number is :- "+ squareRootOfNumber(36));
        System.out.println("Is Perfect Square or not :- " + isPerfectSquare(36));
        System.out.println("Is Perfect Number or Not :- " + isPerfectNumber(8128));
        System.out.println("Automrphic Number or Not :- "+ isAutomorphicNumber(7));
        System.out.println("Harshad Number or Not :- " + isHarshdNumber(19));
        System.out.println("Abundant Number or Not :- "+isAbundantNumber(14));
        printFactorOfNumber(6);
        System.out.println("Factorial of a Number is :- " + factorialOfNumber(-12));
        System.out.println("Strong Number or Not :- " + isStrongNumber(5));
        System.out.println("Armstrong Number or Not :- " + isArmstrong(1634));
        System.out.println("Leap Year or Not :- " + isLeapYear(2001));
        System.out.println("Friendly Pair or Not :- " + checkFriendlyPair(6,28));
        printFibonacci(5);
        System.out.println();
        System.out.println( "Nth Fibonacci Number using Recursion  :- " + findNthFibonacciNumberUsingRecursion(5));
        printFibonacciSeriesUsingRecursion(5);
        System.out.println();
        System.out.println("Nth Fibonacci Number using Iteration  :- " + findNthFibonacciNumberUsingIteration(6));
        printArmstrongNumberInInterval(2,500);
        printFibonacciSeriesUpToNthTerm(5);
        System.out.println();
        printPrimeNumberInGivenRange(1,10);
        printPrimeFactorOfNumber(21);
        System.out.println("Given string is anagram :- " + isAnagram("listen","silent"));
    }



}
