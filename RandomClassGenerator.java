import java.util.Random;

public class RandomClassGenerator{
	public static void main(String[] args){
		Random random = new Random();
		
		boolean option = random.nextBoolean();
		System.out.printf("Do you love java %b%n",option);
		
		int integerWithNoBound = random.nextInt();
		System.out.printf("The Random number is %d%n",integerWithNoBound);
		
		int integerWithBound = random.nextInt(2000) + 1;
		System.out.printf("The Random number is %d%n",integerWithBound);
		
		long LargeNumerics = random.nextLong();
		System.out.printf("The Random number is %d%n",LargeNumerics);
		
		float randomFloatDigit = random.nextFloat();
		System.out.printf("The Random number is %f%n",randomFloatDigit);
		
		double Digits = random.nextDouble();
		System.out.printf("The Random number is %f%n",Digits);
	}
}