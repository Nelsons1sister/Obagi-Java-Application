//2.32

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        System.out.println("Enter five integers:");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeroes: " + zeroCount);

        input.close();
    }
}
