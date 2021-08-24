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
public class JavaRevision {
	public static void main(String[] args) {
		System.out.println("hello world..."+args[0]+args[1]);
		Department obj=new Department();
		obj.i=20202;Department.s=30303;
		System.out.println(obj.i);
		System.out.println(Department.s);
		Department.met();//static methods are called directly using class name
		obj.nonStaticMethod();
		
		
		
		Department obj2=new Department();
		System.out.println(obj2.i);
		System.out.println(Department.s);
		Department.met();//static methods are called directly using class name
		obj2.nonStaticMethod();
		/*
		 * both static fields and static methods, only one copy for the class are created,
		 * all the instances of that class share those single copies.
		 */
		
		Department dep=new Department("gold");
		System.out.println(dep instanceof Department);
	}
}
class Department{
	String ss="silver";
	public Department() {
		/*
		 * A construtor will carry the same name of the class
		 * A constructor will neither be void nor it will have a return value
		 * A constructor is called when the object of the class is created.
		 * A constructor can also be overloaded.
		 * Java use VMI/DMI (virtual method invocation or dynamic method invocatin) to determine the right
		 * constructor.
		 */
		System.out.println("department cons called...");
	}
	public Department(String ss) {
		System.out.println(ss);
		System.out.println(this.ss);
	}
	int i=10;//instance variable
	static int s=10;//class variable
	public static void met() {
		/*
		 * Rules of static methods
		 * static methods - only one copy or instance is created for the static methods
		 * you can access the static methods using the class name, without created an object of the class
		 * static methods can access only static variables and static methods
		 * this and super keyword cannot be used inside a static method
		 */
		System.out.println("static met called....");
	}
	public void nonStaticMethod() {
		/*
		 * To access the non static methods, you have to create an object of the class
		 * Non static methods can access static variables and static methods
		 * non static methods can use this and super keyword
		 */
		System.out.println("non static met called....."+Department.s);
	}
	
	public void nonStatMet(int i,String s) {
		/*
		 * Methods can be void or return type
		 * Methods can accept null parameters or 1 or more parameters.
		 * methods can also be overloaded
		 */
	}
	public void nonStatMet(int i) {
		/*
		 * In case of overloading, the method name should be same
		 * the parameter should compulsorily differ
		 * the return type can differ
		 * the access specifier can differ
		 */
	}
	
	public String nonStatMet2(int i) {
		/*
		 * All returnable methods should compulsorily return a value
		 * There can be multiple return statement, but we should have only one return.
		 */
		if(i%2==0) {
			return "even number...";
		}
		else {
			return "odd number...";
		}
	}
}