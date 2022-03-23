import static org.junit.Assert.*;
import org.junit.Test;
import static java.lang.Math.toRadians;

public class TestClass {
	
//-------------------- Start of Helper Functions Testing --------------------//
	
	/*
	 * This function method will test the square function that 
	 * was created in our own math library, it will test the 
	 * results of a given input with the expected results
	 */
	@Test
	public void test_square()
	{
		double output = MathLib.my_square(2);
		assertEquals(4, output, 0);
	}
	
	/*
	 * This function method will test the power function that 
	 * was created in our own math library, it will test the 
	 * results of a given input with the expected results
	 */
	@Test
	public void test_pow()
	{
		double output = MathLib.my_pow(2, 2);
		assertEquals(4, output, 0);
	}
	
	/*
	 * This function method will test the factorial function that 
	 * was created in our own math library, it will test the 
	 * results of a given input with the expected results
	 */
	@Test
	public void test_factorial()
	{
		double output = MathLib.my_factorial(2);
		assertEquals(2, output, 0);
	}
	
	/*
	 * This function method will test the deg2rad function that 
	 * was created in our own math library, it will test the 
	 * results of a given input with the expected results
	 */
	@Test
	public void test_deg2rad()
	{
		double output = MathLib.my_deg_2_rad(90);
		double expected = Math.toRadians(90);
		assertEquals(expected, output, 0.0001);
	}
	
//-------------------- End of Helper Functions Testing --------------------//	

//-------------------- Start of Assignment Functions Testing --------------------//
	
	
	// SIN FUNCTION TEST CASES RADS AND DEGS FOUR TESTS
	@Test
	public void test_sin_rad()
	{
		fail("not implemented");
	}
	
	@Test
	public void test_sin2_rad()
	{
		fail("not implemented");
	}
	
	@Test
	public void test_sin_deg()
	{
		fail("not implemented");
	}
	
	@Test
	public void test_sin2_deg()
	{
		fail("not implemented");
	}
	
	// COS FUNCTION TEST CASES RADS AND DEGS FOUR TESTS
	@Test
	public void test_cos_rad()
	{
		fail("not implemented");
	}
	
	@Test
	public void test_cos2_rad()
	{
		fail("not implemented");
	}
	
	@Test
	public void test_cos_deg()
	{
		fail("not implemented");
	}
	
	@Test
	public void test_cos2_deg()
	{
		fail("not implemented");
	}
	
	// TAN FUNCTION TEST CASES RADS AND DEGS FOUR TESTS
	@Test
	public void test_tan_rad()
	{
		fail("not implemented");
	}
	
	@Test
	public void test_tan2_rad()
	{
		fail("not implemented");
	}
	
	@Test
	public void test_tan_deg()
	{
		fail("not implemented");
	}
	
	@Test
	public void test_tan2_deg()
	{
		fail("not implemented");
	}

//-------------------- End of Assignment Functions Testing --------------------//
}
