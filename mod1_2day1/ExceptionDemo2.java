package mod1_2day1;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		try{
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println("dont divide a number by zero");
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("please enter a valid command line argument...");
		}
		catch(Exception e) {
			System.out.println("unknown exception handle with care...");
		}
		finally {
			System.out.println("finally called....");
		}
		System.out.println("After Exception");
	}
}
/*
 * Finally block always gets executed...
 * whether an exception arises or not
 * whether an exception is handled or not
 * finally is always called..
 */

