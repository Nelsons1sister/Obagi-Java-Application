public class SumOfEvenNumInAnArray{
	public static void main(String[] args){
		int[] numbers = {17,23,19,13,15,8,4,14,10,18};
		int sumOf4_6 = 0;
		int sumOf5_9 = 0;
		
		for(int i = 1; i < 10; i++) {
			
			if(i >= 4 && i <= 6) {
				sumOf4_6 += numbers[i];
			}
				
			if(i >= 5 && i <= 9) {
				sumOf5_9 += numbers[i];
			}
		}
		int result  =sumOf4_6 * sumOf5_9;
		
		if(result % 2 == 0){
			System.out.printf("The Even Result is %d ",result);
		}	
	}
}