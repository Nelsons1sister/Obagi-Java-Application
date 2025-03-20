import java.util.Scanner;




public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your address: ");
		String address = input.nextLine();
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		System.out.print("Enter your account balance: ");
		float balance = input.nextFloat();
		
		System.out.print("Do you love java(True/False): ");
		boolean isJava = input.nextBoolean();
		
		System.out.println();
		
		
		System.out.printf("hello %s, you are welcome to First Bank%n",name);
		System.out.printf("your account balance is %c%.2f%n",'$',balance);
		System.out.printf("You are living in %s%n",address);
		System.out.printf("You are %d years old%n",age);
		System.out.printf("%s Do you love java? %b%n",name,isJava);
		
	}
}