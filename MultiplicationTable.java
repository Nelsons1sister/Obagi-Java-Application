/* write a program to accept numbers from a user
and display the multiplication table of the number*/

import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		for (int i = 1; i <= 12; i++){
			System.out.println(num + "X" + i + "=" + num * i);
		}
	}
}