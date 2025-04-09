import java.util.Random;

public class RandomClassGenrator{
	public static void main(String[] args){
		Random random = new Random();
		
		boolean option = random.nextBoolean();
		System.out.printf("Do you love java %b%n",option);
		
		int integerWithNoBound = random.nextInt();
		System.out.printf("The random number is %d%n",integerWithNoBound);
		
		int integerWithBound = random.nextInt(2000) + 1;
		System.out.printf("The random number is %d%n",integerWithBound);
		
		long timeStamp = random.nextLong();
		System.out.printf("The time Stamp is %d%n",timeStamp);
		
		float scoreBoard = random.nextFloat();
		System.out.printf("The time Stamp is %.2f%n",scoreBoard);
		
		double winTeam = random.nextDouble();
		System.out.printf("The number is %.2f%n",winTeam);
		
	}
}