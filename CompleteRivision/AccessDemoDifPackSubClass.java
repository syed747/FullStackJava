package CompleteRivision;
import CompleteRivision.AccessDemo;
public class AccessDemoDifPackSubClass extends AccessDemo{
	public void met() {
		//System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
class AccessDemoDifPackNonSubClass {
	public void met() {
		AccessDemo obj=new AccessDemo();
		//System.out.println(obj.pri);
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}
