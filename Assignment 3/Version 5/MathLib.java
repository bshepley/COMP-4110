package a3SoftVer;

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

	public static double my_sin_rad(double rads)
	{	
		int power = 1;
		double sinX = 0.0;
		
		for(int i = 1; i <=11; i++ )
		{
			double currentTerm = 0.0;
			if(i % 2 == 0)
			{
				currentTerm = -MathLib.my_pow(rads, power) / MathLib.my_factorial(power);
			}
			else
			{
				currentTerm = MathLib.my_pow(rads, power) / MathLib.my_factorial(power);
			}
			sinX = sinX + currentTerm;
			power = power + 2;
		}
		return sinX;
	}
	
	public static double my_sin_deg(double degree)
	{
		double rads = MathLib.my_deg_2_rad(degree);
		
		int power = 1;
		double sinX = 0.0;
		
		for(int i = 1; i <=11; i++ )
		{
			double currentTerm = 0.0;
			if(i % 2 == 0)
			{
				currentTerm = -MathLib.my_pow(rads, power) / MathLib.my_factorial(power);
			}
			else
			{
				currentTerm = MathLib.my_pow(rads, power) / MathLib.my_factorial(power);
			}
			sinX = sinX + currentTerm;
			power = power + 2;
		}
		return sinX;
	}
	public static double my_cos_rad(double radian)
	{
		int power = 0;
		double cosX = 0.0;

		
		for(int i = 1; i<= 11; i++) {
			
			double currentTerm = 0.0;
			
			if(i % 2 == 0) {
				currentTerm = -MathLib.my_pow(radian, power) / MathLib.my_factorial(power);
	
			} else if(i % 2 != 0){
				currentTerm = MathLib.my_pow(radian, power) / MathLib.my_factorial(power);

			}

			cosX = cosX + currentTerm;

			power = power + 2;
		
		}
		
		return cosX;
	}
	
	public static double my_cos_deg(double degree)
	{
		double radian = MathLib.my_deg_2_rad(degree);
		int power = 0;
		double cosX = 0.0;

		
		for(int i = 1; i<= 11; i++) {
			
			double currentTerm = 0.0;
			
			if(i % 2 == 0) {
				currentTerm = -MathLib.my_pow(radian, power) / MathLib.my_factorial(power);
	
			} else if(i % 2 != 0){
				currentTerm = MathLib.my_pow(radian, power) / MathLib.my_factorial(power);

			}

			cosX = cosX + currentTerm;

			power = power + 2;
		
		}
		
		return cosX;
	}
	
	public static double my_tan_rad(double rads)
	{
		return my_sin_rad(rads)/ my_cos_rad(rads);
	}
	
	public static double my_tan_deg(double degree)
	{
		return my_sin_deg(degree)/ my_cos_deg(degree);

	}
	
//-------------------- End of Assignment Functions --------------------//


}