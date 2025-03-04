import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
		//user input for temperature and windSpeed
        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();
        
        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Wind chill formula is valid only for temperatures at or below 50°F and wind speeds above 3 mph.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        }
    }
    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
