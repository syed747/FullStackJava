package KnightingaleWeek5;

import malik.MoleculeFramework;
public class LinksAndRelation {
	public static void main(String[] args)throws Exception {
		Object fahad=new Human1();
		Object shoiab=new Human1();
		
		Family fahadFamily=new Family();
		MoleculeFramework.setInterface(Father.class);
		fahad=MoleculeFramework.getObject(new Object[]{fahad,fahadFamily});//subjection
		
		if(fahad instanceof Father) {
			System.out.println("yes fahad is father....");
		}
		else {
			System.out.println("not a father....");
		}
		
		Father father=(Father)fahad;
		father.doCare();
		
		MoleculeFramework.setInterface(Child.class);
		shoiab=MoleculeFramework.getObject(new Object[]{shoiab,fahadFamily});//subjection
		Child child=(Child)shoiab;
		child.doLove();
	}
}
class Human1 {
	
}
interface Father{
	public void doCare();
}
interface Child{
	public void doLove();
}
class Family implements Father,Child{
	@Override
	public void doCare() {
		System.out.println("family father care.............");
	}
	@Override
	public void doLove() {
		// TODO Auto-generated method stub
		System.out.println("family child love..............");
	}
}
