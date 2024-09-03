package edu.PIP.Java.OOP.StaticMethod;
/**
 * Demonstrating Static Methods
 */
public class StaticDemo{
	public static void main(String args[]){
		// calling instance method
		StaticMethodDemo a = new StaticMethodDemo();
		a.InstanceMethod();	//static methods cannot access instance variables

		// The 2 ways of calling static method
		StaticMethodDemo.StaticMethod();
		
		a.StaticMethod(); // also possible
	}
}