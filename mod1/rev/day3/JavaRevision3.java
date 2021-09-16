package mod1.rev.day3;
/*
 * inheritance
 * creates a kind of relationship
 * where the parent can replace the child
 * we can achieve code reusability
 * we can achieve object reusability
 * we can create abstract classes
 * we achieve method overriding
 * super
 */
public class JavaRevision3 {
	public static void main(String[] args) {
		Parent p=new Parent();
		System.out.println(p.i);
		p.met();
		
		Child c=new Child();
		System.out.println(c.i);
		c.met();
		
		ChildChild cc=new ChildChild();
		System.out.println(cc.i);
		cc.met();
	}
}
class Parent{
	int i=10;
	public void met() {
		System.out.println("parent method called...");
	}
}
class Child extends Parent{
	
}
class ChildChild extends Parent{
	

}
