package exceptionhandling;

//Must catch sub-class exception first
public class Exception07 {

	public static void main(String[] args) {
	
		try {
			
			int a=0;
			int b = 10/a;
		}catch(Exception e) {
			
			System.out.println("Generic Exception catch");
		}catch(ArithmeticException e) {
			//Error unreachable code
			System.out.println("This is never reached");
		}
	}
}
