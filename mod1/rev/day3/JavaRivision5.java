package mod1.rev.day3;

public class JavaRivision5 {
	public static void main(String[] args) {
		SubClass sc=new SubClass();
		sc.mett();
		sc.met();
		//SuperClass obj=new SuperClass();
		
	}
}
abstract class SuperClass{
	public SuperClass() {
		System.out.println("abstract class cons called...");
	}
	final public void met() {
		System.out.println("met called..");
	}
	public abstract void mett();
}
class SubClass extends SuperClass{
	@Override
	public void mett() {
		System.out.println("logic for parent abstract method....");
	}
}
