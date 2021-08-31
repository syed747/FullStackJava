package mod1_2.day1;

public interface ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println("dont divide a number by zero...");
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("please enter a value in command line...");
		}
		catch(NumberFormatException ne) {
			System.out.println("please enter a valid number...");
		}
		catch(Exception e) {
			System.out.println("unknown exception");
		}
		System.out.println("After Exception");
	}
}
