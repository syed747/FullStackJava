package mod1.rev.day1;

public class ConditionalBranching {
	public static void main(String[] args) {
	/*
	 * if-else-if
	 * switch case
	 * ternary operator
	 *
	 */
		int i=11;
		if(i>=11 || i==100)System.out.println("the value is eleven...");
		
		else if(i==10) {System.out.println("the value is ten"); System.out.println("ten ten ten");}
		
		else if(i==9) System.out.println("the value is 9");
		
		else System.out.println("the value is not eleven...");
		
		boolean b=false;
		if(!b) {
			System.out.println("yes it is false...");
		}
		
		char c='a';
		if(c=='a') {
			
		}
		
		//ternary operator
		
		String s=10>20?"yes 10 greater  than 20":"no 10 is lesser than 20";
		System.out.println(s);
		
		System.out.println(30>20?"yes 30 greater  than 20":"no 20 is lesser than 30");
		
		
	}
}