import java.util.*;

public class TechProSalaryCalculator {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to TechPro Employee Salary Calculator!");
        System.out.println();

        // Array to store employee names
        String[] employees = {"Alice", "Bob", "Carl", "Synthia", "Zudy"};
        
        // Arrays to store hourly rates, weekly work hours, and weekly salaries for each employee
        double[] hourlyRates = new double[employees.length];
        double[] weeklyWorkHours = new double[employees.length];
        double[] weeklySalaries = new double[employees.length];

        // Loop to ask user for hourly rates and total hours worked per employee
        for(int i = 0; i < employees.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the hourly rate for " + employees[i] + ": $");
            hourlyRates[i] = input.nextDouble();
            System.out.print("Enter the number of hours " + employees[i] + " worked this week: ");
            weeklyWorkHours[i] = input.nextDouble();
            System.out.println();
        }

        // Calculates weekly salary for each employee and prints them
        System.out.println("Weekly Salaries:");
        for(int i = 0; i < employees.length; i++) {
            weeklySalaries[i] = hourlyRates[i] * weeklyWorkHours[i];
            System.out.println(employees[i] + ": $" + weeklySalaries[i]);
        }
        System.out.println();

        // Calculates total salary expense for TechPro
        double sum = 0.0;
        for(int i = 0; i < employees.length; i++) {
            sum += weeklySalaries[i];
        }
        System.out.println("Total Salary Expense for TechPro: $" + sum);

        // Calculates average weekly salary
        double average = sum / employees.length;
        System.out.println("Average Weekly Salary at TechPro: $" + average);

        // Calculates the highest earner
        int maxIndex = 0;
        for(int i = 0; i < employees.length; i++) {
            double max = 0.0;
            if(max < weeklySalaries[i]) {
                max = weeklySalaries[i];
                maxIndex = i;
            }
        }
        System.out.println("Highest Earner: " + employees[maxIndex] + "($" + weeklySalaries[maxIndex] + ")");

        // Calculates the lowest earner
        double min = weeklySalaries[0];
        int minIndex = 0;
        for(int i = 0; i < employees.length; i++) {
            if(min > weeklySalaries[i]) {
                min = weeklySalaries[i];
                minIndex = i;
            }
        }
        System.out.println("Lowest Earner: " + employees[minIndex] + "($" + weeklySalaries[minIndex] + ")");
    }
}
