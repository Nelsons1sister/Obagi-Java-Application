//ex 2.28

import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = input.nextDouble();

        System.out.println("Diameter: " + (2 * radius));
        System.out.println("Circumference: " + (2 * Math.PI * radius));
        System.out.println("Area: " + (Math.PI * radius * radius));

        input.close();
    }
}
