import java.util.Scanner;

public class SmallestLargestNumber {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
        // take user input of three numbers
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        //finding the result and printing them
        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
    }
    // Method to find the smallest and largest numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }
}
