package mod1.rev.day3;
/*
 * What is a class ?
 * How to create a object ?
 * main method
 * how to pass command line arguments ?
 * constructors
 * constructor overloading
 * methods - both void and return
 * method overloading
 * this keyword
 * instanceof keyword
 *
 *  */
public class JavaRevision2 {
	public static void main(String[] args) {
		Employee.ss="this is static-common for all objects...";
		Employee emp=new Employee();
		System.out.println(emp.ss);
		
		Employee emp2=new Employee("ramu");
		System.out.println(emp2.ss);
		emp2.add(10,10,10);
	}
}
class Employee{
	String s;//instance variable
	static String ss;//class variable
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void add(int i,int j, int y) {
		System.out.println(i+y+j);
	}
	public Employee() {
		System.out.println("employee object created...");
	}
	public Employee(String s) {//this s is local variable
		System.out.println("Employee object created....:"+s);
		System.out.println(this.s);//this will always point to the current instance
	}
	
	public void met() {
	//void methods do not return any value
		
	}
	public int met2() {
		return 1;
		//return method do return a value and it is compulsory
	}
	public int met3(int i) {
		return i;
	}
	public static void sMet() {
		
	}
	public static int sMet1() {//Employee.sMet1();
		return 0;
	}
	public static int sMet2(int s) {//Employee.sMet2();
		//this.ss;cannot use this keyword in a static context.
		//super keyword cannot be used in a static context
		return s;
	}
	//overloaded method, the method name should be same but the parameter should change
	//return type and access specifier can be changed.
	public int met2(int i) {
		return i;
	}
	


}
