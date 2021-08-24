package Labworkweek2;

public class SwapTwoNumbersExcersise {
	   public static void main(String[] args) {
			 
		   float first =2.50f, second =4.50f;
		   
		   System.out.println("--before swap--");
		   System.out.println("first number ="+first);
		   System.out.println("second number ="+second);
		   
		   // value of is assigned to temporary 
		   float temporary =first;
		   
		   // value =second
		   first=second;
		   
		   // value of temporary (which contains the initial value of first) is assigned to second
		   second = temporary;
		   
		   System.out.println("--after swap--");
		   System.out.println("first numbers ="+first);
		   System.out.println("seconn number ="+second);
	   
	}
}
