package test.mvn;
import static org.testng.Assert.*;
import org.testng.annotations.*;

import test.mvn.Calc;

public class Calc_TestNG {

  @Test
  public void add() {
	  int expectedResult = 4;
	  assertEquals(Calc.getIntsance().add(2, 2), expectedResult);
  }

  @Test
  public void divide() {
	  int expectedResult = 1;
	  assertEquals(Calc.getIntsance().divide(2, 2), expectedResult);
  }

  @Test
  public void multiply() {
	  int expectedResult = 4;
	  assertEquals(Calc.getIntsance().multiply(2, 2), expectedResult);
  }

  @Test
  public void subtract() {
	  int expectedResult = 0;
	  assertEquals(Calc.getIntsance().subtract(2, 2), expectedResult);
  }

}
