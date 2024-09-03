package edu.PIP.Java.OOP.StaticMethod;

public class StaticMethodDemo{
	private int att1, att2;
	public void InstanceMethod(){
		System.out.println(
				"This is an intance method.");
		System.out.println("\tatt1 = " + att1 + ",att2 = " + att2);
	}
	public static void StaticMethod()
	{
		System.out.println("This is a static method.");
		// static methods cannot access instance var.
		// System.out.println("\tatt1 = " + att1 + ",att2 = " + att2); // not allowed
	}
}
