package Labworkweek2;

import java.util.Scanner;

public class FindAreaofCircle {
    public static void main(String[] args) {
		 Scanner scanner =new Scanner(System.in);
		 
		 System.out.println("enter the radius:");
		 /*we are storing the entered radius in double
		  * because a user can enter radius in decimal
		  */
		 double radius =scanner.nextDouble();
		 //area =PI*radius*radius(PIr2)
		 double area =Math.PI*(radius*radius);
		 System.out.println("the area of circle is:"+area);
		 //circumference =2*PI*radius(2PIr)
		 double circumference=Math.PI*2*radius;
		 System.out.println("the circumference of the circle is:"+circumference);
		 
	}
}
