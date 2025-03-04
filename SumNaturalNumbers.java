import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new sc(System.in);
        //user input for number n
        int number = sc.nextInt();
        // print out the result by pasing value to helper method
        if (number < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = findSum(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + result);
        }
    }
    // Method to calculate the sum of first n natural numbers
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}