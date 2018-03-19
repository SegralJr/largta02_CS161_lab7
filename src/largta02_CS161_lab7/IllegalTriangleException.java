package largta02_CS161_lab7;

public class IllegalTriangleException extends Exception {
	
	/*
	 * Taylor Large
	 * CS161
	 * Spring 2018
	 * Lab 7
	 */
	
	public static final String message = "Triangle inequality violated!";
	
	public IllegalTriangleException() {
		super(IllegalTriangleException.message);
	}
	public IllegalTriangleException(String string) {
		super(string);
	}
	
	public String getMessage() {
		return message;
	}

}
