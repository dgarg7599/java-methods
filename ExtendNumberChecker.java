import java.util.Arrays;
import java.util.Scanner;

public class ExtendNumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(Math.abs(number)).length();  // Convert the number to a string and get its length
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

    // Method to find the sum of digits of the number
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of the number
    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);  // Use Math.pow() to square the digit
        }
        return sumOfSquares;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sumOfDigits = sumOfDigits(number);
        return Math.abs(number) % sumOfDigits == 0;  // Harshad number check
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2];  // Array to store frequency of digits (0-9)
        
        // Initialize frequency array with digit (0-9) in the first column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;  // Set frequency to 0 initially
        }
        
        // Count frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // You can change this number to test with other inputs

        // Count digits in the number
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
        
        // Store digits of the number in an array
        int[] digits = storeDigits(number);
        System.out.println("Digits in the number: " + Arrays.toString(digits));
        
        // Find the sum of digits
        int sumOfDigits = sumOfDigits(number);
        System.out.println("Sum of digits: " + sumOfDigits);
        
        // Find the sum of squares of digits
        double sumOfSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        
        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad number? " + isHarshad);
        
        // Find the frequency of each digit
        int[][] frequencies = digitFrequency(number);
        System.out.println("Frequency of each digit:");
        for (int[] frequency : frequencies) {
            if (frequency[1] > 0) {
                System.out.println(frequency[0] + " appears " + frequency[1] + " times.");
            }
        }
    }
}
