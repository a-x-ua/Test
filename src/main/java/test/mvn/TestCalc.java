package test.mvn;

public class TestCalc {

	public static void main(String[] args) {
		
		System.out.println("2 + 2 = " + Calc.getIntsance().add(2, 2));
		System.out.println("2 - 2 = " + Calc.getIntsance().subtract(2, 2));
		System.out.println("2 x 2 = " + Calc.getIntsance().multiply(2, 2));
		System.out.println("2 : 2 = " + Calc.getIntsance().divide(2, 2));

	}

}
