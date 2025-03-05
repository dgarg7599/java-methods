ximport java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {

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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        // A duck number has a non-zero digit and it must contain a '0' somewhere other than the first position
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;  // Found a '0' in a non-leading position
            }
        }
        return false;  // No '0' found in a valid position
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int numDigits = digits.length;
        int sum = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        
        return sum == Math.abs(number);  // Check if sum of powers is equal to the number
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // You can change the number to test with other inputs
        
        // Count digits in the number
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
        
        // Store digits of the number in an array
        int[] digits = storeDigits(number);
        System.out.println("Digits in the number: " + Arrays.toString(digits));
        
        // Check if the number is a Duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck number? " + isDuck);
        
        // Check if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong number? " + isArmstrong);
        
        // Find the largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);
        
        // Find the smallest and second smallest digits
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
    }
}
