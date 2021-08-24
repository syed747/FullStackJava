package LabworkWeek3;

public class Investment {
//27. Create a program that calculates how much a
//	  -$14,000 investment would be worth if it increased in
//	  -value by 40% during the first year, lost $1,500 in value
//	  -the second year, and increased 12% in the third year.
	   public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 int i = 14000;
		 System.out.println("Initial investment:$"+i);
		 System.out.println("increased in value by 40% during the first year is:$"+i*40/100);
		 System.out.println("Starting value in the second year is:$"+(i*40/100+i));
		 System.out.println("Lost of $1,500 in value the second year closing is:$"+(i*40/100+i-1500));
		 System.out.println("increased in value by 12% in the third year is:$"+(i*40/100+i-1500)*12/100);
		 System.out.println("The value third year closing is:$"+(((i*40/100+i-1500)*12/100)+(i*40/100+i-1500)));
		 }
}
