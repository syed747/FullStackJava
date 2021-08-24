package KnightingaleWeek5;

public class Test {
	public static void main(String[] args) {
		Employee e=(Employee)new Engineer();
		e.work();
		
		Engineer ee=(Engineer)getEmployee();
		ee.work();
		ee.doEngineering();
	}
	
	public static Object getEmployee() {
		return new Engineer();
	}
}
class Employee{
	public void work() {
		System.out.println("do work method called...");
	}
}
class Engineer extends Employee{
	public void doEngineering() {
		System.out.println("do engineering ......");
	}
}
