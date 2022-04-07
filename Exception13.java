package exceptionhandling;

class InvalidAgeException extends Exception {

	private int age;
	
	InvalidAgeException(int a) {
		age =a;
	}
	
	public String toString() {
		return "Age:" + age + "is not a valid age";
	}
}

public class Exception13 {

	static void checkAge(int age) throws InvalidAgeException{
		System.out.println("check age validity : (" + age + ")");
		
		if(age < 0 || age > 100)
			throw new InvalidAgeException(age);
		System.out.println("Age: " + age + "is a valid age");
		
	}
	
	public static void main(String[] args) {
		
		try {
			checkAge(25);
			checkAge(-5);
		}catch(InvalidAgeException e) {
			System.out.println("Caught: " + e);
		}
	}
}
