package edu.PIP.Java.OOP.StaticMethod;
/**
 * Converts Feet to Inches and Inches to Feet with methods of Class ValueConverter
 */
import java.util.Scanner;	//Import class Scanner for input
/*
 * Precondition: Input value in feet and inches separately
 * Postcondition: Output the converted values
 */
public class Converter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//Object to use input
		Scanner keyboard = new Scanner (System.in);
		
		//Prompt for input
		System.out.println ("Enter a measurement in inches: ");
		double inches = keyboard.nextDouble ();	//Take input
		
		//Calling method from another class
		double feet = ValueConverter.convertInchesToFeet(inches);
		
		//Display
		System.out.println (inches + " inches = " + feet + " feet.");
		
		//Prompt for input
		System.out.print ("Enter a measurement in feet: ");
		feet = keyboard.nextDouble ();		//Take input
		
		//Calling method from another class
		inches = ValueConverter.convertFeetToInches(feet);
		
		//Display
		System.out.println (feet + " feet = " + inches + " inches.");

	}

}
