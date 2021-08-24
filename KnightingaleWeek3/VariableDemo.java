package KnightingaleWeek3;

public class VariableDemo {
	/*
	 * 1. instance variable
	 * 2. Local Variable
	 *
	 * local variables are not initialized whereas instance variables are initialized
	 *
	 * local variables cannot be accessed outside the method
	 */
	int i;//instance variable
	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		obj.met();
		obj.i=595959;
		obj.met();
		
	}
	
	public void met() {
		int i=0;//all variables declared inside a method is called local variable
		System.out.println("Local variable value..:"+i);
		System.out.println("Instance Variable value..:"+this.i);
	}
}