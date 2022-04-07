package exceptionhandling;

//using try catch block
public class Exception03 {

	public static void main(String[] args) {
		
		int d,a;
		
		try {
		
			d=0;
			a=10/d;
		}catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		System.out.println("After catch statement");
	}
}
