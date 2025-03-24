public class Operators {
	public static void main(String[] args){
		//Assingment operator(=)
	
		int num1 = 13;
		int num2 = 5;
		
		//Arithmetic operator(+,*,-,/,%)
		int sum = num1 + num2;
		
		int product = num1 * num2;
		
		int difference = num1 - num2;
		
		double quotient = (double)num1 / num2;
		
		int remainder = num1 % num2;
		
		//Relational operators (>,<,>=,<=,==,!=)
		boolean isLessThan = num1 < num2;
		boolean isGreaterThan = num1 > num2;
		boolean isGreaterThanOrEqualTo = num1 >= num2;
		boolean isLessThanOrEqualTo = num1 <= num2;
		boolean isEqualTo = num1 == num2;
		boolean  isNotEqualTo = num1 != num2;
		
		//Logical operator(&&,||,!)
		boolean isANDOperator = num1 > num2 && num1 >= num2;
		boolean isOrOperator = num1 == num2 || num1 > num2;
		boolean isNotOperator = !(num1 == num2 || num1 > num2);
		
		
		
		System.out.printf("the sum of the numbers is %d%n",sum);
		System.out.printf("the product of the numbers is %d%n",product);
		System.out.printf("the difference of the numbers is %d%n",difference);
		System.out.printf("the quotient of the numbers is %f%n",quotient);
		System.out.printf("the remainder of the numbers is %d%n",remainder);
		System.out.printf("================================================================%n");
		System.out.printf("is %d < %d ? %b%n",num1,num2,isLessThan);
		System.out.printf("Is %d > %d? %b%n",num1,num2,isGreaterThan);
		System.out.printf("Is %d >= %d? %b%n",num1,num2,isGreaterThanOrEqualTo);
		System.out.printf("Is %d <= %d? %b%n",num1,num2,isLessThanOrEqualTo);
		System.out.printf("Is %d == %d? %b%n",num1,num2,isEqualTo);
		System.out.printf("Is %d != %d? %b%n",num1,num2,isNotEqualTo);
		System.out.printf("================================================================%n");
		System.out.printf("Is %d > %d && %d >= %d? %b%n",num1,num2,num1,num2,isANDOperator);
		System.out.printf("Is %d == %d || %d > %d? %b%n",num1,num2,num1,num2,isOrOperator);
		System.out.printf("Is !(%d == %d || %d > %d)? %b%n",num1,num2,num1,num2,isNotOperator);

	}
}