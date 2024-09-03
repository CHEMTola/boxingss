package edu.PIP.Java.OOP.StaticMethod;
/**
 * Showing how static variables work
 */
public class StaticVariable {
	public int instanceVar;
	public static int staticVar;
	
	public static void main(String[] args) {
		//Display initial value of staticVar
		System.out.println("MyClass.staticVar = " + StaticVariable.staticVar);
		
		//Create instances
		StaticVariable a1 = new StaticVariable();
		StaticVariable a2 = new StaticVariable();
		
		//Displaying initial values
		System.out.println("a1.instanceVar = " + a1.instanceVar);
		System.out.println("a2.instanceVar = " + a2.instanceVar);
		System.out.println("a1.staticVar = " + a1.staticVar);
		System.out.println("a2.staticVar = " + a2.staticVar);
		
		//Incrementing value by 1
		a1.instanceVar++;
		a1.staticVar++;
		
		//Display new values
		System.out.println("a1.instanceVar = " + a1.instanceVar);
		System.out.println("a1.staticVar = " + a1.staticVar); 		
		//Display new values, and notice a2.staticVar's value matches a1.staticVar's value
		System.out.println("a2.instanceVar = " + a2.instanceVar);
		System.out.println("a2.staticVar = " + a2.staticVar);
	}

}
