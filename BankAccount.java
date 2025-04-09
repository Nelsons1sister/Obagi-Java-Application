import java.util.scanner;

public class BankAccount{
	String accountName = "John Doe";
	String accountNumber = "4590468934";
	double accountBalance = 94746.66;
	
	public static void main(String[] args){
		BankAccount bank = new BankAccount();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to UBA bank");
		System.out.println("Enter 1 to withdraw");
		System.out.println("Enter 2 to deposit");
		
		System.out.print("enter your choice");
		int choice = input.nextInt();
		
		switch (choice){
			case 1:
			{
				System.out.print("Enter amount to withdraw: ");
				int amount = input.nextInt();
				
				bank.withdrawal(amount);
				System.out.printf("Account name is %s%n",bank.accountName);
				System.out.printf("Account number is %s%n",bank.accountNumber);
				System.out.printf("Account balance is %s%n",bank.accountBalance);	
			}
			break;
			
			case 2:
			{
			System.out.print("Enter amount to deposit: ");
				int amount = input.nextInt();
				
				bank.deposit(amount);
				System.out.printf("Account name is %s%n",bank.accountName);
				System.out.printf("Account number is %s%n",bank.accountNumber);
				System.out.printf("Your balance is %.2f%n",bank.accountBalance); 		
			}
			break;
			default:
			
			System.out.printf("Invalid input");
		}
		
		
		
	
		 
	}
	public double withdrawal(int amount){
		accountBalance -= amount;
		
		return accountBalance;
	}
	public double deposit(int amount){
		accountBalance += amount;
		
		return accountBalance;
	}
}