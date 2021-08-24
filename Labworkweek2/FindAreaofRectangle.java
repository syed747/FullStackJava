package Labworkweek2;

import java.util.Scanner;

public class FindAreaofRectangle {
    public static void main(String[] args) {
	    
 	   Scanner scanner =new Scanner(System.in);
 	   System.out.println("enter the length of Rectangle:");
 	   double length =scanner.nextDouble();
 	   System.out.println("enter the width of Rectangle");
 	   double width =scanner.nextDouble();
 	   //area =length*width
 	   double area = length*width;
 	   System.out.println("area of Rectangle is: " +area);
	}    
}
