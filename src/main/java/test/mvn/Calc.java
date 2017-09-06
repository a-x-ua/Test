package test.mvn;
public class Calc {
		
	private static Calc instance = null;
	
	protected Calc() {
						
	}
	
	public static Calc getIntsance() {
		
		if(instance == null) {
			synchronized(Calc.class) {
				if(instance == null) {
					instance = new Calc();
				}
			}
		}
		return instance;
	}

	public int add(int number1, int number2) {

		return number1 + number2;
	
	}

	public int subtract(int number1, int number2) {

		return number1 - number2;
	
	}

	public int multiply(int number1, int number2) {

		return number1 * number2;
	
	}

	public int divide(int number1, int number2) {

		return number1 / number2;
	
	}

}

