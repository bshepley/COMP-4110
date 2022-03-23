
public class MathLib 
{
	
//-------------------- Start of Helper Constants and Functions --------------------//
	
	// Constants
	public static final double PI = 3.14159;
	
	/*
	 * Description: This function will take in a double and
	 * 				calculate the square of that given number
	 * 				and return the result
	 */
	public static double my_square(double number)
	{
		return number * number;
	}
	
	/*
	 * Description: This function will take in a double and integer
	 * 				then calculate the power of that given number and exponent
	 * 				and return the result
	 */
	public static double my_pow(double basis, int exp)
	{
		if(exp == 0) 
		{
			return 1;
		}
		else
		{
			return(my_square(my_pow(basis, exp/2))*(exp%2==1?basis:1));
		}
	}
	
	/*
	 * Description: This function will take in an integer and
	 * 				calculate the factorial of that given number
	 * 				and return the result
	 */
	public static long my_factorial(int number)
	{
		long result = 1;
		while(number > 1)
		{
			result *= number;
			--number;
		}
		return result;
	}
	
	/*
	 * Description: This function will take in an rads value and
	 * 				return the result as a degree
	 */
	public static double my_deg_2_rad(double degree)
	{
		return degree * PI / 180;
	}
	
	
//-------------------- End of Helper Constants and Functions --------------------//
	
//-------------------- Start of Assignment Functions --------------------//

	public static double my_sin_rad()
	{
		return 1;
	}
	
	public static double my_sin_deg()
	{
		return 1;
	}
	
	public static double my_cos_rad()
	{
		return 1;
	}
	
	public static double my_cos_deg()
	{
		return 1;
	}
	
	public static double my_tan_rad()
	{
		return 1;
	}
	
	public static double my_tan_deg()
	{
		return 1;
	}
	
//-------------------- End of Assignment Functions --------------------//

	public static void main(String[] args)
	{
		System.out.println();
	}
}

