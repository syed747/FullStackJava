package Labworkweek2;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
    {
      int num;
   System.out.println("enter an integer number:"); 
   
   //the input provided by user is stored in num 
   Scanner input = new Scanner(System.in);
   num = input.nextInt();
   
   /* if number is divisible by 2 then its an even number *else odd number*/
   if(num % 2 == 0)
   	System.out.println("Entered a number is even ");
   else 
   	System.out.println("Entered number is odd");
   }
}
}
