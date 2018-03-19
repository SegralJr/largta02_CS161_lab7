package largta02_CS161_lab7;

import javax.swing.JOptionPane;

public class Triangle  {
	
	/*
	 * Taylor Large
	 * CS161
	 * Spring 2018
	 * Lab 7
	 */
	
	private double side1, side2, side3;
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = Math.abs(this.side1);
		this.side2 = Math.abs(this.side2);
		this.side3 = Math.abs(this.side3);
	}
	
	public double getSide1() {
		side1 = Double.parseDouble(JOptionPane.showInputDialog("Please supply side 1"));
		return side1;
	}
	
	public double getSide2() {
		side2 = Double.parseDouble(JOptionPane.showInputDialog("Please supply side 2"));
		return side2;
	}
	
	public double getSide3() {
		side3 = Double.parseDouble(JOptionPane.showInputDialog("Please supply side 3"));
		return side3;
	}
	
	public double computeArea(double a, double b, double c) throws IllegalTriangleException {
		double area = 0, s, perimeter = (a + b + c);
		s = perimeter/2;
		if((s-a) < 0 || (s-b) < 0 || (s-c) < 0) {
			// IllegalTriangleException
			throw new IllegalTriangleException();
		}
		else {
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		System.out.println("\nThe area of the triangle is: " + area + "\n");
		return area;
	}

}
