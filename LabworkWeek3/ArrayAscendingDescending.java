package LabworkWeek3;


public class ArrayAscendingDescending {
//Write a program to sort an array element in ascending and descending order?
	public static void main(String[] args) {
		 int temp, number1, number2, number3, number4;
		 number1 = 10;
		 number2 = 20;
		 number3 = 30;
		 number4 = 4;

		 for (int count = 0; count < 4; count++)
		 {
		     if ( number2 < number1)
		     {
		        temp = number1;
		        number1 = number2;
		        number2 = temp;
		     }
 
		     if ( number3 < number2)
		     {
		        temp = number2;
		        number2 = number3;
		        number3 = temp;
		     }

		     if ( number4 < number3)
		     {
		        temp = number3;
		        number3 = number4;
		        number4 = temp;
		     }

		    
		 }

		 System.out.println( number1 + " " + number2 + " " + number3 + " " + number4);//Ascending order
		 System.out.println( number4 + " " + number3 + " " + number2 + " " + number1);//Descending order
}
}
