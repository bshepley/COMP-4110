import static org.junit.Assert.*;
import org.junit.Test;

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
		// Test 1 for Square Function
		assertEquals("Fails First Square Test", 4, MathLib.my_square(2), 0);
		
		// Test 2 for Square Function
		assertEquals("Fails Second Square Test", 16, MathLib.my_square(4), 0);
		
		// Test 3 for Square Function
		assertEquals("Fails Third Square Test", 256, MathLib.my_square(16), 0);
		
		// Test 4 for Square Function
		assertEquals("Fails Fourth Square Test", 4, MathLib.my_square(-2), 0);
	}
	
	/*
	 * This function method will test the power function that 
	 * was created in our own math library, it will test the 
	 * results of a given input with the expected results
	 */
	@Test
	public void test_pow()
	{
		// Test 1 for Power Function
		assertEquals("Fails First Power Test", 4, MathLib.my_pow(2, 2), 0);
		
		// Test 2 for Power Function
		assertEquals("Fails Second Power Test", 9, MathLib.my_pow(3, 2), 0);
		
		// Test 3 for Power Function
		assertEquals("Fails Third Power Test", 2401, MathLib.my_pow(7, 4), 0);
		
		// Test 4 for Power Function
		assertEquals("Fails Fourth Power Test", 1, MathLib.my_pow(-1, 2), 0);
	}
	
	/*
	 * This function method will test the factorial function that 
	 * was created in our own math library, it will test the 
	 * results of a given input with the expected results
	 */
	@Test
	public void test_factorial()
	{
		// Test 1 for Factorial Function
		assertEquals("Fails First Factorial Test", 2, MathLib.my_factorial(2), 0);
		
		// Test 2 for Factorial Function
		assertEquals("Fails Second Factorial Test", 40320, MathLib.my_factorial(8), 0);
		
		// Test 3 for Factorial Function
		assertEquals("Fails Third Factorial Test", 24, MathLib.my_factorial(4), 0);
		
		// Test 4 for Factorial Function
		assertEquals("Fails Fourth Factorial Test", -120, MathLib.my_factorial(-5), 0);
	}
	
	/*
	 * This function method will test the deg2rad function that 
	 * was created in our own math library, it will test the 
	 * results of a given input with the expected results
	 */
	@Test
	public void test_deg2rad()
	{
		// Test 1 for Degree to Radian Function
		assertEquals("Fails First Degree to Radian Test", Math.toRadians(90), MathLib.my_deg_2_rad(90), 0.0001);
		
		// Test 2 for Degree to Radian Function
		assertEquals("Fails Second Degree to Radian Test", Math.toRadians(180), MathLib.my_deg_2_rad(180), 0.0001);
		
		// Test 3 for Degree to Radian Function
		assertEquals("Fails First Degree to Radian Test", Math.toRadians(270), MathLib.my_deg_2_rad(270), 0.0001);
		
		// Test 4 for Degree to Radian Function
		assertEquals("Fails First Degree to Radian Test", Math.toRadians(360), MathLib.my_deg_2_rad(360), 0.0001);
	}
	
//-------------------- End of Helper Functions Testing --------------------//	

//-------------------- Start of Assignment Functions Testing --------------------//
	
	
	// SIN FUNCTION TEST CASES RADS AND DEGS FOUR TESTS
	@Test
	public void test_sin_rad()
	{
		// Quadrant One First Test (0.0174533 rads == 1 degrees)
		assertEquals("Fails Quad One First Test", Math.sin(0.0174533), MathLib.my_sin_rad(0.0174533), 0.1);
		
		// Quadrant One Second Test (1.55334 rads == 89 degrees)
		assertEquals("Fails Quad One Second Test", Math.sin(1.55334), MathLib.my_sin_rad(1.55334), 0.1);
		
		// Quadrant One Third Test (0.785398 rads == 45 degrees)
		assertEquals("Fails Quad One Third Test", Math.sin(0.785398), MathLib.my_sin_rad(0.785398), 0.1);
		
		// Quadrant One Fourth Test (1.20428 rads == 69 degrees)
		assertEquals("Fails Quad One Fourth Test", Math.sin(1.20428), MathLib.my_sin_rad(1.20428), 0.1);
		
	//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Two First Test (1.58825 rads == 91 degrees)
		assertEquals("Fails Quad Two First Test", Math.sin(1.58825), MathLib.my_sin_rad(1.58825), 0.1);
		
		// Quadrant Two Second Test (3.12414 rads == 179 degrees)
		assertEquals("Fails Quad Two Second Test", Math.sin(3.12414), MathLib.my_sin_rad(3.12414), 0.1);
		
		// Quadrant Two Third Test (2.35619 rads == 135 degrees)
		assertEquals("Fails Quad Two Third Test", Math.sin(2.35619), MathLib.my_sin_rad(2.35619), 0.1);
		
		// Quadrant Two Fourth Test (2.94961 rads == 169 degrees)
		assertEquals("Fails Quad Two Fourth Test", Math.sin(2.94961), MathLib.my_sin_rad(2.94961), 0.1);
		
	//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Three First Test (3.15905 rads == 181 degrees)
		assertEquals("Fails Quad Three First Test", Math.sin(3.15905), MathLib.my_sin_rad(3.15905), 0.1);
		
		// Quadrant Three Second Test (4.69494 rads == 269 degrees)
		assertEquals("Fails Quad Three Second Test", Math.sin(4.69494), MathLib.my_sin_rad(4.69494), 0.1);
		
		// Quadrant Three Third Test (3.92699 rads == 225 degrees)
		assertEquals("Fails Quad Three Third Test", Math.sin(3.92699), MathLib.my_sin_rad(3.92699), 0.1);
		
		// Quadrant Three Fourth Test (4.10152 rads == 235 degrees)
		assertEquals("Fails Quad Three Fourth Test", Math.sin(4.10152), MathLib.my_sin_rad(4.10152), 0.1);

	//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Four First Test (4.72984 rads == 271 degrees)
		assertEquals("Fails Quad Four First Test", Math.sin(4.72984), MathLib.my_sin_rad(4.72984), 0.1);
		
		// Quadrant Four Second Test (6.26573 rads == 359 degrees)
		assertEquals("Fails Quad Four Second Test", Math.sin(6.26573), MathLib.my_sin_rad(6.26573), 0.1);
		
		// Quadrant Four Third Test (5.49779 rads == 315 degrees)
		assertEquals("Fails Quad Four Third Test", Math.sin(5.49779), MathLib.my_sin_rad(5.49779), 0.1);
		
		// Quadrant Four Fourth Test (5.75959 rads == 330 degrees)
		assertEquals("Fails Quad Four Fourth Test", Math.sin(5.75959), MathLib.my_sin_rad(5.75959), 0.1);
	}
	
	@Test
	public void test_sin_deg()
	{
		// Quadrant One First Test (0.0174533 rads == 1 degrees)
		assertEquals("Fails Quad One Fourth Test", Math.sin(MathLib.my_deg_2_rad(1)), MathLib.my_sin_deg(1), 0.1);
		
		// Quadrant One Second Test (1.55334 rads == 89 degrees)
		assertEquals("Fails Quad One Fourth Test", Math.sin(MathLib.my_deg_2_rad(89)), MathLib.my_sin_deg(89), 0.1);
		
		// Quadrant One Third Test (0.785398 rads == 45 degrees)
		assertEquals("Fails Quad One Fourth Test", Math.sin(MathLib.my_deg_2_rad(45)), MathLib.my_sin_deg(45), 0.1);
		
		// Quadrant One Fourth Test (1.20428 rads == 69 degrees)
		assertEquals("Fails Quad One Fourth Test", Math.sin(MathLib.my_deg_2_rad(69)), MathLib.my_sin_deg(69), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Two First Test (1.58825 rads == 91 degrees)
		assertEquals("Fails Quad Two First Test", Math.sin(MathLib.my_deg_2_rad(91)), MathLib.my_sin_deg(91), 0.1);
		
		// Quadrant Two Second Test (3.12414 rads == 179 degrees)
		assertEquals("Fails Quad Two Second Test", Math.sin(MathLib.my_deg_2_rad(179)), MathLib.my_sin_deg(179), 0.1);
		
		// Quadrant Two Third Test (2.35619 rads == 135 degrees)
		assertEquals("Fails Quad Two Third Test", Math.sin(MathLib.my_deg_2_rad(135)), MathLib.my_sin_deg(135), 0.1);
		
		// Quadrant Two Fourth Test (2.94961 rads == 169 degrees)
		assertEquals("Fails Quad Two Fourth Test", Math.sin(MathLib.my_deg_2_rad(169)), MathLib.my_sin_deg(169), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Three First Test (3.15905 rads == 181 degrees)
		assertEquals("Fails Quad Three First Test", Math.sin(MathLib.my_deg_2_rad(181)), MathLib.my_sin_deg(181), 0.1);
		
		// Quadrant Three Second Test (4.69494 rads == 269 degrees)
		assertEquals("Fails Quad Three Second Test", Math.sin(MathLib.my_deg_2_rad(269)), MathLib.my_sin_deg(269), 0.1);
		
		// Quadrant Three Third Test (3.92699 rads == 225 degrees)
		assertEquals("Fails Quad Three Third Test", Math.sin(MathLib.my_deg_2_rad(225)), MathLib.my_sin_deg(225), 0.1);
		
		// Quadrant Three Fourth Test (4.10152 rads == 235 degrees)
		assertEquals("Fails Quad Three Fourth Test", Math.sin(MathLib.my_deg_2_rad(235)), MathLib.my_sin_deg(235), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Four First Test (4.72984 rads == 271 degrees)
		assertEquals("Fails Quad Four First Test", Math.sin(MathLib.my_deg_2_rad(271)), MathLib.my_sin_deg(271), 0.1);
		
		// Quadrant Four Second Test (6.26573 rads == 359 degrees)
		assertEquals("Fails Quad Four Second Test", Math.sin(MathLib.my_deg_2_rad(359)), MathLib.my_sin_deg(359), 0.1);
		
		// Quadrant Four Third Test (5.49779 rads == 315 degrees)
		assertEquals("Fails Quad Four Third Test", Math.sin(MathLib.my_deg_2_rad(315)), MathLib.my_sin_deg(315), 0.1);
		
		// Quadrant Four Fourth Test (5.75959 rads == 330 degrees)
		assertEquals("Fails Quad Four Fourth Test", Math.sin(MathLib.my_deg_2_rad(330)), MathLib.my_sin_deg(330), 0.1);
	}
	
	// COS FUNCTION TEST CASES RADS AND DEGS FOUR TESTS
	@Test
	public void test_cos_rad()
	{
		// Quadrant One First Test (0.0174533 rads == 1 degrees)
		assertEquals("Fails Quad One First Test", Math.cos(0.0174533), MathLib.my_cos_rad(0.0174533), 0.1);
		
		// Quadrant One Second Test (1.55334 rads == 89 degrees)
		assertEquals("Fails Quad One Second Test", Math.cos(1.55334), MathLib.my_cos_rad(1.55334), 0.1);
		
		// Quadrant One Third Test (0.785398 rads == 45 degrees)
		assertEquals("Fails Quad One Third Test", Math.cos(0.785398), MathLib.my_cos_rad(0.785398), 0.1);
		
		// Quadrant One Fourth Test (1.20428 rads == 69 degrees)
		assertEquals("Fails Quad One Fourth Test", Math.cos(1.20428), MathLib.my_cos_rad(1.20428), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Two First Test (1.58825 rads == 91 degrees)
		assertEquals("Fails Quad Two First Test", Math.cos(1.58825), MathLib.my_cos_rad(1.58825), 0.1);
		
		// Quadrant Two Second Test (3.12414 rads == 179 degrees)
		assertEquals("Fails Quad Two Second Test", Math.cos(3.12414), MathLib.my_cos_rad(3.12414), 0.1);
		
		// Quadrant Two Third Test (2.35619 rads == 135 degrees)
		assertEquals("Fails Quad Two Third Test", Math.cos(2.35619), MathLib.my_cos_rad(2.35619), 0.1);
		
		// Quadrant Two Fourth Test (2.94961 rads == 169 degrees)
		assertEquals("Fails Quad Two Fourth Test", Math.cos(2.94961), MathLib.my_cos_rad(2.94961), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Three First Test (3.15905 rads == 181 degrees)
		assertEquals("Fails Quad Three First Test", Math.cos(3.15905), MathLib.my_cos_rad(3.15905), 0.1);
		
		// Quadrant Three Second Test (4.69494 rads == 269 degrees)
		assertEquals("Fails Quad Three Second Test", Math.cos(4.69494), MathLib.my_cos_rad(4.69494), 0.1);
		
		// Quadrant Three Third Test (3.92699 rads == 225 degrees)
		assertEquals("Fails Quad Three Third Test", Math.cos(3.92699), MathLib.my_cos_rad(3.92699), 0.1);
		
		// Quadrant Three Fourth Test (4.10152 rads == 235 degrees)
		assertEquals("Fails Quad Three Fourth Test", Math.cos(4.10152), MathLib.my_cos_rad(4.10152), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Four First Test (4.72984 rads == 271 degrees)
		assertEquals("Fails Quad Four First Test", Math.cos(4.72984), MathLib.my_cos_rad(4.72984), 0.1);
		
		// Quadrant Four Second Test (6.26573 rads == 359 degrees)
		assertEquals("Fails Quad Four Second Test", Math.cos(6.26573), MathLib.my_cos_rad(6.26573), 0.1);
		
		// Quadrant Four Third Test (5.49779 rads == 315 degrees)
		assertEquals("Fails Quad Four Third Test", Math.cos(5.49779), MathLib.my_cos_rad(5.49779), 0.1);
		
		// Quadrant Four Fourth Test (5.75959 rads == 330 degrees)
		assertEquals("Fails Quad Four Fourth Test", Math.cos(5.75959), MathLib.my_cos_rad(5.75959), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
	}
	
	@Test
	public void test_cos_deg()
	{
		// Quadrant One First Test (0.0174533 rads == 1 degrees)
		assertEquals("Fails Quad One First Test", Math.cos(MathLib.my_deg_2_rad(1)), MathLib.my_cos_deg(1), 0.1);
		
		// Quadrant One Second Test (1.55334 rads == 89 degrees)
		assertEquals("Fails Quad One Second Test", Math.cos(MathLib.my_deg_2_rad(89)), MathLib.my_cos_deg(89), 0.1);
		
		// Quadrant One Third Test (0.785398 rads == 45 degrees)
		assertEquals("Fails Quad One Third Test", Math.cos(MathLib.my_deg_2_rad(45)), MathLib.my_cos_deg(45), 0.1);
		
		// Quadrant One Fourth Test (1.20428 rads == 69 degrees)
		assertEquals("Fails Quad One Fourth Test", Math.cos(MathLib.my_deg_2_rad(69)), MathLib.my_cos_deg(69), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Two First Test (1.58825 rads == 91 degrees)
		assertEquals("Fails Quad Two First Test", Math.cos(MathLib.my_deg_2_rad(91)), MathLib.my_cos_deg(91), 0.1);
		
		// Quadrant Two Second Test (3.12414 rads == 179 degrees)
		assertEquals("Fails Quad Two Second Test", Math.cos(MathLib.my_deg_2_rad(179)), MathLib.my_cos_deg(179), 0.1);
		
		// Quadrant Two Third Test (2.35619 rads == 135 degrees)
		assertEquals("Fails Quad Two Third Test", Math.cos(MathLib.my_deg_2_rad(135)), MathLib.my_cos_deg(135), 0.1);
		
		// Quadrant Two Fourth Test (2.94961 rads == 169 degrees)
		assertEquals("Fails Quad Two Fourth Test", Math.cos(MathLib.my_deg_2_rad(169)), MathLib.my_cos_deg(169), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Three First Test (3.15905 rads == 181 degrees)
		assertEquals("Fails Quad Three First Test", Math.cos(MathLib.my_deg_2_rad(181)), MathLib.my_cos_deg(181), 0.1);
		
		// Quadrant Three Second Test (4.69494 rads == 269 degrees)
		assertEquals("Fails Quad Three Second Test", Math.cos(MathLib.my_deg_2_rad(269)), MathLib.my_cos_deg(269), 0.1);
		
		// Quadrant Three Third Test (3.92699 rads == 225 degrees)
		assertEquals("Fails Quad Three Third Test", Math.cos(MathLib.my_deg_2_rad(225)), MathLib.my_cos_deg(225), 0.1);
		
		// Quadrant Three Fourth Test (4.10152 rads == 235 degrees)
		assertEquals("Fails Quad Three Fourth Test", Math.cos(MathLib.my_deg_2_rad(235)), MathLib.my_cos_deg(235), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Four First Test (4.72984 rads == 271 degrees)
		assertEquals("Fails Quad Four First Test", Math.cos(MathLib.my_deg_2_rad(271)), MathLib.my_cos_deg(271), 0.1);
		
		// Quadrant Four Second Test (6.26573 rads == 359 degrees)
		assertEquals("Fails Quad Four Second Test", Math.cos(MathLib.my_deg_2_rad(359)), MathLib.my_cos_deg(359), 0.1);
		
		// Quadrant Four Third Test (5.49779 rads == 315 degrees)
		assertEquals("Fails Quad Four Third Test", Math.cos(MathLib.my_deg_2_rad(315)), MathLib.my_cos_deg(315), 0.1);
		
		// Quadrant Four Fourth Test (5.75959 rads == 330 degrees)
		assertEquals("Fails Quad Four Fourth Test", Math.cos(MathLib.my_deg_2_rad(330)), MathLib.my_cos_deg(330), 0.1);
	}
	
	// TAN FUNCTION TEST CASES RADS AND DEGS FOUR TESTS
	@Test
	public void test_tan_rad()
	{
		// Quadrant One First Test (0.0174533 rads == 1 degrees)
		assertEquals("Fails Quad One First Test", Math.tan(0.0174533), MathLib.my_tan_rad(0.0174533), 0.1);
		
		// Quadrant One Second Test (1.55334 rads == 89 degrees)
		assertEquals("Fails Quad One Second Test", Math.tan(1.55334), MathLib.my_tan_rad(1.55334), 0.1);
		
		// Quadrant One Third Test (0.785398 rads == 45 degrees)
		assertEquals("Fails Quad One Third Test", Math.tan(0.785398), MathLib.my_tan_rad(0.785398), 0.1);
		
		// Quadrant One Fourth Test (1.20428 rads == 69 degrees)
		assertEquals("Fails Quad One Fourth Test", Math.tan(1.20428), MathLib.my_tan_rad(1.20428), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Two First Test (1.58825 rads == 91 degrees)
		assertEquals("Fails Quad Two First Test", Math.tan(1.58825), MathLib.my_tan_rad(1.58825), 0.1);
		
		// Quadrant Two Second Test (3.12414 rads == 179 degrees)
		assertEquals("Fails Quad Two Second Test", Math.tan(3.12414), MathLib.my_tan_rad(3.12414), 0.1);
		
		// Quadrant Two Third Test (2.35619 rads == 135 degrees)
		assertEquals("Fails Quad Two Third Test", Math.tan(2.35619), MathLib.my_tan_rad(2.35619), 0.1);
		
		// Quadrant Two Fourth Test (2.94961 rads == 169 degrees)
		assertEquals("Fails Quad Two Fourth Test", Math.tan(2.94961), MathLib.my_tan_rad(2.94961), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Three First Test (3.15905 rads == 181 degrees)
		assertEquals("Fails Quad Three First Test", Math.tan(3.15905), MathLib.my_tan_rad(3.15905), 0.1);
		
		// Quadrant Three Second Test (4.69494 rads == 269 degrees)
		assertEquals("Fails Quad Three Second Test", Math.tan(4.69494), MathLib.my_tan_rad(4.69494), 0.1);
		
		// Quadrant Three Third Test (3.92699 rads == 225 degrees)
		assertEquals("Fails Quad Three Third Test", Math.tan(3.92699), MathLib.my_tan_rad(3.92699), 0.1);
		
		// Quadrant Three Fourth Test (4.10152 rads == 235 degrees)
		assertEquals("Fails Quad Three Fourth Test", Math.tan(4.10152), MathLib.my_tan_rad(4.10152), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Four First Test (4.72984 rads == 271 degrees)
		assertEquals("Fails Quad Four First Test", Math.tan(4.72984), MathLib.my_tan_rad(4.72984), 0.1);
		
		// Quadrant Four Second Test (6.26573 rads == 359 degrees)
		assertEquals("Fails Quad Four Second Test", Math.tan(6.26573), MathLib.my_tan_rad(6.26573), 0.1);
		
		// Quadrant Four Third Test (5.49779 rads == 315 degrees)
		assertEquals("Fails Quad Four Third Test", Math.tan(5.49779), MathLib.my_tan_rad(5.49779), 0.1);
		
		// Quadrant Four Fourth Test (5.75959 rads == 330 degrees)
		assertEquals("Fails Quad Four Fourth Test", Math.tan(5.75959), MathLib.my_tan_rad(5.75959), 0.1);
	}
	
	@Test
	public void test_tan_deg()
	{
		// Quadrant One First Test (0.0174533 rads == 1 degrees)
		assertEquals("Fails Quad One First Test", Math.tan(MathLib.my_deg_2_rad(1)), MathLib.my_tan_deg(1), 0.1);
		
		// Quadrant One Second Test (1.55334 rads == 89 degrees)
		assertEquals("Fails Quad One Second Test", Math.tan(MathLib.my_deg_2_rad(89)), MathLib.my_tan_deg(89), 0.1);
		
		// Quadrant One Third Test (0.785398 rads == 45 degrees)
		assertEquals("Fails Quad One Third Test", Math.tan(MathLib.my_deg_2_rad(45)), MathLib.my_tan_deg(45), 0.1);
		
		// Quadrant One Fourth Test (1.20428 rads == 69 degrees)
		assertEquals("Fails Quad One Fourth Test", Math.tan(MathLib.my_deg_2_rad(69)), MathLib.my_tan_deg(69), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Two First Test (1.58825 rads == 91 degrees)
		assertEquals("Fails Quad Two First Test", Math.tan(MathLib.my_deg_2_rad(91)), MathLib.my_tan_deg(91), 0.1);
		
		// Quadrant Two Second Test (3.12414 rads == 179 degrees)
		assertEquals("Fails Quad Two Second Test", Math.tan(MathLib.my_deg_2_rad(179)), MathLib.my_tan_deg(179), 0.1);
		
		// Quadrant Two Third Test (2.35619 rads == 135 degrees)
		assertEquals("Fails Quad Two Third Test", Math.tan(MathLib.my_deg_2_rad(135)), MathLib.my_tan_deg(135), 0.1);
		
		// Quadrant Two Fourth Test (2.94961 rads == 169 degrees)
		assertEquals("Fails Quad Two Fourth Test", Math.tan(MathLib.my_deg_2_rad(169)), MathLib.my_tan_deg(169), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Three First Test (3.15905 rads == 181 degrees)
		assertEquals("Fails Quad Three First Test", Math.tan(MathLib.my_deg_2_rad(181)), MathLib.my_tan_deg(181), 0.1);
		
		// Quadrant Three Second Test (4.69494 rads == 269 degrees)
		assertEquals("Fails Quad Three Second Test", Math.tan(MathLib.my_deg_2_rad(269)), MathLib.my_tan_deg(269), 0.1);
		
		// Quadrant Three Third Test (3.92699 rads == 225 degrees)
		assertEquals("Fails Quad Three Third Test", Math.tan(MathLib.my_deg_2_rad(225)), MathLib.my_tan_deg(225), 0.1);
		
		// Quadrant Three Fourth Test (4.10152 rads == 235 degrees)
		assertEquals("Fails Quad Three Fourth Test", Math.tan(MathLib.my_deg_2_rad(235)), MathLib.my_tan_deg(235), 0.1);
		
		//------------------------------------------------------------------------------------------------------//
		
		// Quadrant Four First Test (4.72984 rads == 271 degrees)
		assertEquals("Fails Quad Four First Test", Math.tan(MathLib.my_deg_2_rad(271)), MathLib.my_tan_deg(271), 0.1);
		
		// Quadrant Four Second Test (6.26573 rads == 359 degrees)
		assertEquals("Fails Quad Four Second Test", Math.tan(MathLib.my_deg_2_rad(359)), MathLib.my_tan_deg(359), 0.1);
		
		// Quadrant Four Third Test (5.49779 rads == 315 degrees)
		assertEquals("Fails Quad Four Third Test", Math.tan(MathLib.my_deg_2_rad(315)), MathLib.my_tan_deg(315), 0.1);
		
		// Quadrant Four Fourth Test (5.75959 rads == 330 degrees)
		assertEquals("Fails Quad Four Fourth Test", Math.tan(MathLib.my_deg_2_rad(330)), MathLib.my_tan_deg(330), 0.1);
	}

//-------------------- End of Assignment Functions Testing --------------------//
}
