package KnightingaleWeek2;

public class ConditionDemo {
	  public static void main(String[] args) {
			int i=200;
			
			if(i%2==0) {
				System.out.println("even number........");
			}
			else {
			  System.out.println("odd number......");
			}
			// ? - ternary operator
			System.out.println((i==100)?"i is equal to 100":"i is not equal to 100...");
			System.out.println((i%2==0)?"even number....":"odd number.....");
			
			if(i==300) {
				System.out.println("i value is 200");
			}
			else if(i<200) {
				System.out.println("i value is lesser than 200");
			}
			else if(i>400) {
				System.out.println("i value is greater than 200");
			}
				else {
					System.out.println("none of the conditions stisfiyed...");
				}
			}
}
