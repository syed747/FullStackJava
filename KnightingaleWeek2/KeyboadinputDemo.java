package KnightingaleWeek2;

import java.util.Scanner;

public class KeyboadinputDemo {
	  public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		
		  System.out.println("please enter a value..:");
		  
		  int i=scan.nextInt();
		  
		  System.out.println("the value you enterd is....:"+i);
		  
		  System.out.println((i%2==0)?"even number...":"odd number....");
		  
		  if(i>40 && i<60) {
			  System.out.println("second class......");
			  
			  }
			  else if(i>60 && i<80) {
				  System.out.println("distinction.....");
			  }
			  else {
				  System.out.println("topper.........");
			  }
		 }
}
