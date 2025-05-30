import java.util.Scanner;

public class MathClassMethod{
	public static void main(String[] args){ 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer: ");
		int num = input.nextInt();
		
		System.out.printf("The absolute value is %d%n",Math.abs(num));
		
		System.out.print("Enter a float-point number: ");
		double num1 = input.nextDouble();
		
		System.out.printf("The rounded value is %d%n",Math.round(num1));
		
		System.out.printf("The rounded value is %f%n",Math.pow(num1,2));
		
		System.out.printf("The square root value is %f%n",Math.sqrt(num1));
		
		System.out.printf("====================================================%n");
		
		System.out.print("Enter the first number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter the Second number: ");
		int number2 = input.nextInt();
		
		System.out.printf("The minimum number is %d%n",Math.min(number1,number2));
		
		System.out.printf("====================================================%n");
		
		System.out.print("Enter the first number: ");
		int number3 = input.nextInt();
		
		System.out.print("Enter the Second number: ");
		int number4 = input.nextInt();
		
		System.out.printf("The maximum number is %d%n",Math.max(number3,number4));
		
		System.out.printf("The random number is %f%n",Math.random());
		
		System.out.printf("====================================================%n");
		
		System.out.println("To claculate area of a circle");
		
		System.out.println("Enter the radius of the circle: ");
		int radius = input.nextInt();
		
		double areaOfCircle = Math.PI * Math.pow(radius,2);
		
		System.out.printf("The area of the circle is %f%n",areaOfCircle);
	}
}
		=