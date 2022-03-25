package a3SoftVer;


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
			// Quadrant 1 Test 
			double outputQuad1 = MathLib.my_sin_rad(0.785398);
			double expectedQuad1 = Math.sin(0.785398);
			assertEquals("Fails First Quad Test", expectedQuad1, outputQuad1, 0.01);
			
			// Quadrant 2 Test
			double outputQuad2 = MathLib.my_sin_rad(1.91986);
			double expectedQuad2 = Math.sin(1.91986);
			assertEquals("Fails Second Quad Test", expectedQuad2, outputQuad2, 0.01);
			
			// Quadrant 3 Test
			double outputQuad3 = MathLib.my_sin_rad(3.83972);
			double expectedQuad3 = Math.sin(3.83972);
			assertEquals("Fails Third Quad Test", expectedQuad3, outputQuad3, 0.01);
			
			// Quadrant 4 Test
			double outputQuad4 = MathLib.my_sin_rad(5.75959);
			double expectedQuad4 = Math.sin(5.75959);
			assertEquals("Fails Fourth Quad Test", expectedQuad4, outputQuad4, 0.01);
		}
		
		@Test
		public void test_sin_deg()
		{
			// Quadrant 1 Test 
			double outputQuad1 = MathLib.my_sin_deg(45);
			double expectedQuad1 = Math.sin(MathLib.my_deg_2_rad(45));
			assertEquals("Fails First Quad Test", expectedQuad1, outputQuad1, 0.01);
			
			// Quadrant 2 Test
			double outputQuad2 = MathLib.my_sin_deg(110);
			double expectedQuad2 = Math.sin(MathLib.my_deg_2_rad(110));
			assertEquals("Fails Second Quad Test", expectedQuad2, outputQuad2, 0.01);
			
			// Quadrant 3 Test
			double outputQuad3 = MathLib.my_sin_deg(220);
			double expectedQuad3 = Math.sin(MathLib.my_deg_2_rad(220));
			assertEquals("Fails Third Quad Test", expectedQuad3, outputQuad3, 0.01);
			
			// Quadrant 4 Test
			double outputQuad4 = MathLib.my_sin_deg(330);
			double expectedQuad4 = Math.sin(MathLib.my_deg_2_rad(330));
			assertEquals("Fails Fourth Quad Test", expectedQuad4, outputQuad4, 0.01);
		}
		
		// COS FUNCTION TEST CASES RADS AND DEGS FOUR TESTS
		@Test
		public void test_cos_rad()
		{
			// Quadrant 1 Test 
			double outputQuad1 = MathLib.my_cos_rad(0.785398);
			double expectedQuad1 = Math.cos(0.785398);
			assertEquals("Fails First Quad Test", expectedQuad1, outputQuad1, 0.01);
			
			// Quadrant 2 Test
			double outputQuad2 = MathLib.my_cos_rad(1.91986);
			double expectedQuad2 = Math.cos(1.91986);
			assertEquals("Fails Second Quad Test", expectedQuad2, outputQuad2, 0.01);
			
			// Quadrant 3 Test
			double outputQuad3 = MathLib.my_cos_rad(3.83972);
			double expectedQuad3 = Math.cos(3.83972);
			assertEquals("Fails Third Quad Test", expectedQuad3, outputQuad3, 0.01);
			
			// Quadrant 4 Test
			double outputQuad4 = MathLib.my_cos_rad(5.75959);
			double expectedQuad4 = Math.cos(5.75959);
			assertEquals("Fails Fourth Quad Test", expectedQuad4, outputQuad4, 0.01);
		}
		
		@Test
		public void test_cos_deg()
		{
			// Quadrant 1 Test 
			double outputQuad1 = MathLib.my_cos_deg(45);
			double expectedQuad1 = Math.cos(MathLib.my_deg_2_rad(45));
			assertEquals("Fails First Quad Test", expectedQuad1, outputQuad1, 0.01);
			
			// Quadrant 2 Test
			double outputQuad2 = MathLib.my_cos_deg(110);
			double expectedQuad2 = Math.cos(MathLib.my_deg_2_rad(110));
			assertEquals("Fails Second Quad Test", expectedQuad2, outputQuad2, 0.01);
			
			// Quadrant 3 Test
			double outputQuad3 = MathLib.my_cos_deg(220);
			double expectedQuad3 = Math.cos(MathLib.my_deg_2_rad(220));
			assertEquals("Fails Third Quad Test", expectedQuad3, outputQuad3, 0.01);
			
			// Quadrant 4 Test
			double outputQuad4 = MathLib.my_cos_deg(330);
			double expectedQuad4 = Math.cos(MathLib.my_deg_2_rad(330));
			assertEquals("Fails Fourth Quad Test", expectedQuad4, outputQuad4, 0.01);
		}
		
		// TAN FUNCTION TEST CASES RADS AND DEGS FOUR TESTS
		@Test
		public void test_tan_rad()
		{
			// Quadrant 1 Test 
			double outputQuad1 = MathLib.my_tan_rad(0.785398);
			double expectedQuad1 = Math.tan(0.785398);
			assertEquals("Fails First Quad Test", expectedQuad1, outputQuad1, 0.01);
			
			// Quadrant 2 Test
			double outputQuad2 = MathLib.my_tan_rad(1.91986);
			double expectedQuad2 = Math.tan(1.91986);
			assertEquals("Fails Second Quad Test", expectedQuad2, outputQuad2, 0.01);
			
			// Quadrant 3 Test
			double outputQuad3 = MathLib.my_tan_rad(3.83972);
			double expectedQuad3 = Math.tan(3.83972);
			assertEquals("Fails Third Quad Test", expectedQuad3, outputQuad3, 0.01);
			
			// Quadrant 4 Test
			double outputQuad4 = MathLib.my_tan_rad(5.75959);
			double expectedQuad4 = Math.tan(5.75959);
			assertEquals("Fails Fourth Quad Test", expectedQuad4, outputQuad4, 0.01);
		}
		
		@Test
		public void test_tan_deg()
		{
			// Quadrant 1 Test 
			double outputQuad1 = MathLib.my_tan_deg(45);
			double expectedQuad1 = Math.tan(MathLib.my_deg_2_rad(45));
			assertEquals("Fails First Quad Test", expectedQuad1, outputQuad1, 0.01);
			
			// Quadrant 2 Test
			double outputQuad2 = MathLib.my_tan_deg(110);
			double expectedQuad2 = Math.tan(MathLib.my_deg_2_rad(110));
			assertEquals("Fails Second Quad Test", expectedQuad2, outputQuad2, 0.01);
			
			// Quadrant 3 Test
			double outputQuad3 = MathLib.my_tan_deg(220);
			double expectedQuad3 = Math.tan(MathLib.my_deg_2_rad(220));
			assertEquals("Fails Third Quad Test", expectedQuad3, outputQuad3, 0.01);
			
			// Quadrant 4 Test
			double outputQuad4 = MathLib.my_tan_deg(330);
			double expectedQuad4 = Math.tan(MathLib.my_deg_2_rad(330));
			assertEquals("Fails Fourth Quad Test", expectedQuad4, outputQuad4, 0.01);
		}

	//-------------------- End of Assignment Functions Testing --------------------//
	
}
