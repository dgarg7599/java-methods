import java.util.Scanner;

public class Eucledian {

    // Method to find the Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Euclidean distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to find the equation of the line given two points (x1, y1) and (x2, y2)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Slope formula: m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);

        // Y-intercept formula: b = y1 - m * x1
        double b = y1 - m * x1;

        // Return an array containing the slope and y-intercept
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the points is: " + distance);

        // Calculate and display the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("The equation of the line is: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }
}
