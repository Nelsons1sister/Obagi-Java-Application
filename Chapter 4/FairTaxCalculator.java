import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalExpenses = 0;

        System.out.println("Enter your annual expenses for the following categories:");

        System.out.print("Housing: $");
        totalExpenses += input.nextDouble();

        System.out.print("Food: $");
        totalExpenses += input.nextDouble();

        System.out.print("Clothing: $");
        totalExpenses += input.nextDouble();

        System.out.print("Transportation: $");
        totalExpenses += input.nextDouble();

        System.out.print("Education: $");
        totalExpenses += input.nextDouble();

        System.out.print("Health Care: $");
        totalExpenses += input.nextDouble();

        System.out.print("Vacations: $");
        totalExpenses += input.nextDouble();

        // Add more categories as needed

        double fairTaxAmount = totalExpenses * 0.23; // 23% FairTax

        System.out.printf("\nEstimated FairTax amount: $%.2f\n", fairTaxAmount);

        input.close();
    }
}