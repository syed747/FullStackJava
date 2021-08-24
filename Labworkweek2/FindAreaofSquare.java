package Labworkweek2;

import java.util.Scanner;

public class FindAreaofSquare {
    /**
     * @param args
     */
    public static void main(String[] args) {
		    System.out.println("enter side of square:");
		    //capture the user's input
		    Scanner scanner = new Scanner(System.in);
		    //Storing the captured value in a variable
		    double side = scanner.nextDouble(); 
		    //Area of Square = side*side
		    double area = side*side; 
		    System.out.println("Area of Square is: "+area);	    
	}
}
