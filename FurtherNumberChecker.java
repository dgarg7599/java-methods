import java.util.Arrays;
import java.util.Scanner;

public class FurtherNumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(Math.abs(number)).length();  // Convert the number to a string and return its length
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        String numStr = Integer.toString(Math.abs(number));  // Convert number to string
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';  // Store each digit
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];  // Reverse the array
        }
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);  // Using Arrays.equals() to compare arrays
    }

    // Method to check if a number is a palindrome using the digits
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);  // Store digits of the number
        int[] reversedDigits = reverseDigits(digits);  // Reverse the digits
        return compareArrays(digits, reversedDigits);  // Check if the original digits and reversed digits are equal
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);  // Store digits of the number
        for (int digit : digits) {
            if (digit == 0) {  // Duck number has at least one non-zero digit
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();  // You can change this number to test with other inputs

        // Count digits in the number
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
        
        // Store digits of the number in an array
        int[] digits = storeDigits(number);
        System.out.println("Digits in the number: " + Arrays.toString(digits));
        
        // Reverse the digits array
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));
        
        // Compare the original and reversed digits to check if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is Palindrome? " + isPalindrome);
        
        // Check if the number is a Duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck number? " + isDuck);
    }
}

