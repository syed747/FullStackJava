package LabworkWeek3;

import java.util.Scanner;

public class ArmstrongNumber {
//b) To check given number is an Armstrong number or-
//	 -perfect number or palindrome or none of these
	public static void main(String[] args) {
	    Scanner scan =new Scanner(System.in);
	    System.out.println("enter any number");
	   int n1= scan.nextInt(); 
	    int number = n1 , originalNumber, remainder, result = 0, n = 0;
 
        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
	}
}
