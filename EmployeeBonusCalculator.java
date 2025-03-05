import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to generate random salary and years of service for each employee
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2]; // 2D array: [salary, years of service]
        
        for (int i = 0; i < numEmployees; i++) {
            // Generate random salary between 10000 and 99999 (5-digit number)
            employeeData[i][0] = 10000 + (random.nextDouble() * (99999 - 10000));
            // Generate random years of service between 1 and 15 years
            employeeData[i][1] = 1 + random.nextInt(15); 
        }
        
        return employeeData;
    }

    // Method to calculate the bonus, new salary, and return the updated data (new salary and bonus)
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // 2D array: [old salary, bonus, new salary]

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = 0;

            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = salary * 0.05;  // 5% bonus
            } else {
                bonus = salary * 0.02;  // 2% bonus
            }

            // Calculate new salary after adding bonus
            double newSalary = salary + bonus;

            // Store the old salary, bonus, and new salary in the updatedData array
            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }

        return updatedData;
    }

    // Method to calculate and display the sum of old salaries, new salaries, and total bonus
    public static void calculateAndDisplayTotals(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Sum up the old salaries, new salaries, and bonuses
        for (int i = 0; i < updatedData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            totalNewSalary += updatedData[i][2];
        }

        // Display the data in a tabular format
        System.out.println("------------------------------------------------------------");
        System.out.println("Emp. #  Old Salary   Bonus  New Salary");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < updatedData.length; i++) {
            System.out.printf("%-8d%-12.2f%-8.2f%.2f\n", i + 1, updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("Total    %.2f        %.2f      %.2f\n", totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numEmployees = 10;  // 10 employees
        double[][] employeeData = generateEmployeeData(numEmployees);  // Generate random data for employees
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);  // Calculate bonus and new salary
        calculateAndDisplayTotals(updatedData);  // Calculate and display totals in tabular format
    }
}
