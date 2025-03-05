import java.util.Scanner;

public class FifthNumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // Prime numbers are greater than 1
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square != 0) {
            sumOfDigits += square % 10;  // Add each digit of the square to the sum
            square /= 10;  // Remove the last digit of the square
        }

        return sumOfDigits == number;  // Check if the sum of digits is equal to the original number
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;  // Add digit to sum
            product *= digit;  // Multiply digit to product
            number /= 10;  // Remove last digit
        }
        return sum == product;  // Check if sum equals product
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        // Convert both number and its square to strings for easy comparison
        String strNumber = Integer.toString(number);
        String strSquare = Integer.toString(square);

        return strSquare.endsWith(strNumber);  // Check if the square ends with the number itself
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;  // Check if divisible by 7 or ends with 7
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // You can change this number to test with other inputs

        // Check if the number is prime
        boolean prime = isPrime(number);
        System.out.println(number + " is Prime? " + prime);

        // Check if the number is a neon number
        boolean neon = isNeon(number);
        System.out.println(number + " is Neon? " + neon);

        // Check if the number is a spy number
        boolean spy = isSpy(number);
        System.out.println(number + " is Spy? " + spy);

        // Check if the number is an automorphic number
        boolean automorphic = isAutomorphic(number);
        System.out.println(number + " is Automorphic? " + automorphic);

        // Check if the number is a buzz number
        boolean buzz = isBuzz(number);
        System.out.println(number + " is Buzz? " + buzz);
    }
}
