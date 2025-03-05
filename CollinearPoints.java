import java.util.Scanner;

public class CollinearPoints {

    // Method to check if points are collinear using the slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // If slopes are equal, points are collinear
        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    // Method to check if points are collinear using the area of the triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by points
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // If area is zero, points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for the three points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check if points are collinear by slope method
        boolean isCollinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        // Check if points are collinear by area method
        boolean isCollinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Display the results
        if (isCollinearBySlope && isCollinearByArea) {
            System.out.println("The points (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), and (" + x3 + ", " + y3 + ") are collinear.");
        } else {
            System.out.println("The points (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), and (" + x3 + ", " + y3 + ") are NOT collinear.");
        }
    }
}
