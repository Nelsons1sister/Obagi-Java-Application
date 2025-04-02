public class OddNumInDescendingOrder{
	public static void main(String[] args){
		
		int i = 50;//start
		
		while (i >= 1){ // stop. false skips the number and will also terminate the program
			if(i%2 ==1){ //this is for true, it will play till it gets to 1
				System.out.printf("%d%n",i);
			}
			i--;
		}
	}
}	