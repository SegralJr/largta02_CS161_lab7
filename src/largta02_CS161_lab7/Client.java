package largta02_CS161_lab7;

import java.util.Scanner;

public class Client {
	
	/*
	 * Taylor Large
	 * CS161
	 * Spring 2018
	 * Lab 7
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		// Ask client for triangle sides
		System.out.println("Enter the first side");
		double side1 = Double.parseDouble(scanner.nextLine());

		System.out.println("Enter the second side");
		double side2 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Enter the third side");
		double side3 = Double.parseDouble(scanner.nextLine());
		
		// Try catch blocks to detect IllegalTriangleException
		try {
			Triangle triangle = new Triangle(side1, side2, side3);
			triangle.computeArea(side1, side2, side3);
			
		} catch (IllegalTriangleException error) {
			System.out.println(error.getMessage());
			System.out.println("First attempt failed with sides: \nSide 1 = " + side1 + " \nSide 2 = " + side2 + " \nSide 3 = " + side3);
			
			try {
				Triangle triangle = new Triangle(side1, side2, side3);
				triangle.computeArea(side1, side1, side2);
			} catch (IllegalTriangleException error2) {
				System.out.println("\n");
				System.out.println(error.getMessage());
				System.out.println("Second attempt failed with sides: \nSide 1 = " + side1 + " \nSide 1 = " + side1 + " \nSide 2 = " + side2);
			}
			
		}
		finally { // Temporary code
			try {
				Triangle triangle = new Triangle(side1, side2, side3);
				triangle.computeArea(side1, side1, side1);
			} catch (IllegalTriangleException error3) {
				
			}
			finally {
				System.out.println("Success!");
			}
		}
		
		
		
	}

}
