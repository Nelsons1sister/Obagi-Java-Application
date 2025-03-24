//2.34

import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        double population = input.nextDouble();

        System.out.print("Enter annual growth rate (as a percentage): ");
        double growthRate = input.nextDouble() / 100;

        System.out.println("\nYearly Projected Population Growth:");
        for (int year = 1; year <= 5; year++) {
            population += population * growthRate;
            System.out.printf("Year %d: %.0f%n", year, population);
        }

        input.close();
    }
}
