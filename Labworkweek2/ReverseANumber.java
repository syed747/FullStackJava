package Labworkweek2;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
		
  	  int num=0;
  	  int reversenum=0;
  	  System.out.println("input your number and press enter:");
  	  //this statement will capture the users input 
  	  Scanner in=new Scanner(System.in);
  	  //capture input: logic to find out the reverse number 
  	  while(num!= 0) {
  		  reversenum = reversenum*10;
  		  reversenum = reversenum+num%10;
  		  num=num/10;
  	  }
  	  System.out.println("reverse of input is:"+reversenum);
	}
}
