package edu.PIP.Java.OOP.StaticMethod;
/**
 * Class for rounding a dollar amount with decimal points to dollar amount with only 2 decimal point
 */
public class DollarFormat {
	public static void write(double amount)
	{
		int allCents = (int) (Math.round (amount * 100));	//Take a number, and only preserve 2 decimal
		int dollars = allCents / 100;	//Only Dollar
		int cents = allCents % 100;		//Only Cent
		
		//Display DollHair Amount
		System.out.print('$');
		System.out.print(dollars);
		System.out.print('.');
		
		//Check if there are cents left
		if (cents < 10) {
			System.out.print('0');
			System.out.print(cents);
		} else
			System.out.print(cents);
	}

}
