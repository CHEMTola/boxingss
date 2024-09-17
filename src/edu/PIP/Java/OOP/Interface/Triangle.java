package edu.PIP.Java.OOP.Interface;

public class Triangle implements Measurable{

	private double myBottom;
	private double myHeight;

	public Triangle(double bottom, double height) {
		myBottom = bottom;
		myHeight = height;
	}

	public double getArea() {
		return (myBottom * myHeight)/2;
	}
}
