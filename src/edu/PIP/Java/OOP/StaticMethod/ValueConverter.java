package edu.PIP.Java.OOP.StaticMethod;
/**
 * Class with methods to convert Feet to Inches and Inches to Feet
 */
public class ValueConverter {
	//Constant variable
	public static final int INCHES_PER_FOOT = 12;
	
	//Convert Feet to Inches
	public static double convertFeetToInches(double feet)
	{
		return feet + INCHES_PER_FOOT;
	}
	
	//Convert Inches to Feet
	public static double convertInchesToFeet(double inches)
	{
		return inches / INCHES_PER_FOOT;
	}
}
