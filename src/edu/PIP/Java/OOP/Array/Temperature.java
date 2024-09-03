package edu.PIP.Java.OOP.Array;
/**
 * Showing Array: Program will take 7 temperatures via input and sum them to find the average 
 * before spitting out each values and whether it is below or above average
 */
import java.util.Scanner;
import java.text.DecimalFormat;		//For formating placement of decimal point
/*
 * Precondition: Input 7 temperature values
 * Postcondition: Output average of inputs and each input values
 */
public class Temperature {

	public static void main(String[] args) {
		//Initializing array to store values
		double[] temperature = new double[7];
		
		@SuppressWarnings ("resource")
		//Object to use input
		Scanner keyboard = new Scanner(System.in);
		//Object form DecimalFormat Class for formatting placement of decimal point
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		//Prompt user input
		System.out.println("Enter 7 temperture: ");
		
		double sum = 0;
		//Loop for inputting value input each index of the array and summing up the total input value
		for (int index = 0; index < 7; index++) {
			temperature[index] = keyboard.nextDouble();
			sum = sum + temperature[index];
		}
		//Calculating the average of the total input value
		double average = sum / 7;
		
		//Display average
		System.out.println("\nThe average temperture is " + numberFormat.format(average));
		
		//Loop for display all the elements in the array and whether each value is lower or higher than the average
		for (int index = 0; index < 7; index++) {
			if (temperature[index] > average) {
				System.out.println(temperature[index] + " is above average");
			}
			else System.out.println(temperature[index] + " is below average");
		}
		System.out.println("Have a nice week");
	}
}
