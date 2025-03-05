import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 columns: Physics, Chemistry, Math
        
        for (int i = 0; i < numStudents; i++) {
            // Generate random marks between 0 and 99 for each subject
            scores[i][0] = 50 + random.nextInt(51); // Physics
            scores[i][1] = 50 + random.nextInt(51); // Chemistry
            scores[i][2] = 50 + random.nextInt(51); // Math
        }
        
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][4]; // 4 columns: total, average, percentage, and original index
        
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            // Store results, rounding off total, average, and percentage to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;         // Total
            results[i][1] = Math.round(average * 100.0) / 100.0;        // Average
            results[i][2] = Math.round(percentage * 100.0) / 100.0;      // Percentage
        }
        
        return results;
    }

    // Method to display the scorecard for all students
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student No.\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("--------------------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.print(results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2] + "%\n");
        }
    }

    public static void main(String[] args) {
        // Input: Number of students
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Step 1: Generate random scores for Physics, Chemistry, and Math
        int[][] scores = generateScores(numStudents);
        
        // Step 2: Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);
        
        // Step 3: Display the scorecard in tabular format
        displayScorecard(scores, results);
        
        // Close the scanner
        scanner.close();
    }
}
