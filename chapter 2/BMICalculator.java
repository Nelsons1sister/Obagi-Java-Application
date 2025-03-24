//2.33

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        
        System.out.printf("Your BMI is: %.2f%n", bmi);

        System.out.println("\nBMI Categories:");
        System.out.println("Underweight: BMI < 18.5");
        System.out.println("Normal weight: 18.5–24.9");
        System.out.println("Overweight: 25–29.9");
        System.out.println("Obesity: BMI 30 or greater");

        input.close();
    }
}
