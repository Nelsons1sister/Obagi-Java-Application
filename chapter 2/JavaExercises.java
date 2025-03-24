// chapter 2

import java.util.Scanner;

public class JavaExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int c = 0;
		int number = 0;


        // 2.3b & 2.3c - Prompt and read an integer
        System.out.print("Enter an integer: ");
        number = input.nextInt();

        // 2.3d - Print a message on one line
        System.out.println("This is a Java program");

        // 2.3e - Print message on two lines using printf
        System.out.printf("This is a %s%n%s%n", "Java", "program");

        // 2.3f - Check if number is not equal to 7
        if (number != 7) {
            System.out.println("The variable number is not 7");
        }

        // 2.4a - Corrected error: Removed the semicolon after 'if'
        if (c < 7) {
            System.out.println("c is less than 7");
        }
        
        // 2.4b - Corrected error: Changed '=>' to '>='
        if (c >= 7) {
            System.out.println("c is equal to or greater than 7");
        }

        // This program calculates the product of three integers.


        // 2.5c - Declare variables
        int x, y, z, result;

        // 2.5d-i - Input three integers
        System.out.print("Enter first integer: ");
        x = input.nextInt();
        System.out.print("Enter second integer: ");
        y = input.nextInt();
        System.out.print("Enter third integer: ");
        z = input.nextInt();

        // 2.5j - Compute product
        result = x * y * z;

        // 2.5k - Print result
        System.out.printf("Product is %d%n", result);
    }
}
