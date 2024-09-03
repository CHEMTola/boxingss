package edu.PIP.Java.OOP.StaticMethod;
/**
 * Using Class DollarFormat to turn a decimal number into standard dollar format with loop to do many test
 */
import java.util.Scanner;
/*
 * Precondition: Input double value
 * Postcondition: Output the input value in standard dollar format
 */
public class DollarFormatDriver {

	public static void main(String[] args) {
		//Variable
		double amount;
		String response;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner (System.in);
		System.out.println ("Testing DollarFormatFirstTry.write:");
		
		//Loop to continue input over and over until you want to
		do 
		{
			//Prompt for input
			System.out.println ("Enter a value of type double:");
			amount = keyboard.nextDouble ();
			
			//Calling method from another class to turn the value into standard dollar format
			DollarFormat.write(amount);
			
			System.out.println();
			System.out.println("Test again?"); //Prompt to end the loop or try again
			response = keyboard.next();	//inputting yes will loop the process again
		}
		while(response.equalsIgnoreCase("yes")); //End when you anything but yes
		//Display when the program ends
		System.out.println ("End of test.");
	}
}
