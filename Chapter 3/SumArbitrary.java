/*Code for checking the Sum of an Arbitrary Number of Positive Integers*/
import java.util.Scanner;

public class SumArbitrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter positive integers (enter -1 to end):");

        while (true) {
            number = input.nextInt();
            if (number == -1) {
                break; // Exit the loop
            }
            if (number > 0) {
                sum += number;
            } else {
                System.out.println("Please enter a positive integer.");
            }
        }

        System.out.println("Sum of entered positive integers: " + sum);
    }
}

