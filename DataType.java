public class DataType{
	public static void main(String[] args){
		//integer type (byte,short,int,long)
		byte age = 50;
		System.out.printf("you are %d years old%n",age);
		
		short quantity = 20000;
		System.out.printf("I bought %d quantity of bags for my business%n",quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("the population In Nigeria is %d%n",populationInNigeria);
		
		long worldPopulation = 8000000000L;
		System.out.printf("the world Population is %d%n",worldPopulation);
		
		
		//float-point numbers (float,double)
		float weight = 5.6F;
		System.out.printf("The bag of rice was %.1fKG%n",weight);
		
		double acctBalance =  487575.94747;
		System.out.printf("Your account balance is %c%.2f%n",'$',acctBalance);
		
		//Boolean type (boolean)
		boolean isJavafun = true;
		System.out.printf("is java fun? %b%n",isJavafun);
		
		//character type(char)
		char alpha = '@';
		System.out.printf("My email is ella%cgmail.com%n",alpha);
		
		
		
	}
}