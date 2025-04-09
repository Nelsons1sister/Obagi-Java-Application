public class MethodWithoutReturnType{
	public static void main(String[] args){
		MethodWithoutReturnType mwrt = new MethodWithoutReturnType();
		mwrt.additon();//invoking the method that is outside the main method
		
	}
	public void additon(){//void means that it doesnt have a return type
		int num1 = 15;
		int num2 = 20;
		
		int sum = num1 + num2;
		
		System.out.printf("The sum is %d%n",sum);
	}
}