/*NOTE THAT:
while loop can run both fixed and infinite loops*/

public class WhileLoopStatement {
	public static void main(String[] args){
		int num = 50;
		
		int i = 1;
		
		while(i <= 10){ //will stop after 10 iterations
			System.out.printf("%d%n",num);
			i++;  //controlls the loop + is an increament
			
		}
	}
}