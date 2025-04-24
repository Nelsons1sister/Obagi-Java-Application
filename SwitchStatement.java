import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter *131# to Subscribe Data");
		System.out.println("Enter *310# to Check Balance");
		System.out.println("Enter *606# to Borrow Airtime/Data");
		System.out.println();
		
		System.out.print("Enter Code: ");
		String code = input.nextLine();
		
		switch(code) {
			case "*131#":
			{
				System.out.println("Enter 1 for 1 Month Subscription");
				System.out.println("Enter 2 for 2 Months Subscription");
				System.out.println("Enter 3 for 3 Months Subscription");
				System.out.println("Enter 4 for 4 Months Subscription");
				System.out.println();
				
				System.out.print("Enter Code: ");
				int option = input.nextInt();
				
				switch(option) {
					case 1:
					{
						System.out.println("Your 1 month subscribtion has been activated");
					}
					break;
					
					case 2:
					{
						System.out.println("Your 2 months subscribtion has been activated");
					}
					break;
					
					case 3:
					{
						System.out.println("Your 3 month subscribtion has been activated");
					}
					break;
					
					case 4:
					{
						System.out.println("Your 4 month subscribtion has been activated");
					}
					break;
					
					default:
					System.out.println("Invalid Input");
				}
			}
			break;
			
			case "*310#":
			{
				System.out.println("your balance is: N764.89");
			}
			break;
			
			case "*606#":
			{
				System.out.println("Enter 1 to borrow 1000");
				System.out.println("Enter 2 to borrow 2000");
				System.out.println("Enter 3 to borrow 3000");
				System.out.println("Enter 4 to borrow 4000");
				System.out.println();
				
				System.out.print("Enter Code: ");
				int option = input.nextInt();
				
				switch(option) {
					case 1:
					{
						System.out.println("You have borrowed N1000");
					}
					break;
					
					case 2:
					{
						System.out.println("You have borrowed N2000");
					}
					break;
					
					case 3:
					{
						System.out.println("You have borrowed N3000");
					}
					break;
					
					case 4:
					{
						System.out.println("You have borrowed N4000");
					}
					break;
					
					default:
					System.out.println("Invalid Input");
				}
			}
			
			break;
		}
	}
}