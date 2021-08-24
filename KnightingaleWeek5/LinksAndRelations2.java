package KnightingaleWeek5;

public class LinksAndRelations2 {
	public static void main(String[] args) {
		Person fahad=new Person();//doctor
		Person geetha=new Person();//nurse
		
	}
}
class Person{
	
}
interface Doctor1{
	public void doCure();
}
interface Nurse1{
	public void doCare();
}
class AlopathyMedicalCollege1 implements Doctor1,Nurse1{
	@Override
	public void doCare() {
		System.out.println("alopathy nursing.....");
	}
	@Override
	public void doCure() {
		System.out.println("Alopathy curing.............");
	}
}
class UnaniMedicalCollege1 implements Doctor1,Nurse1{
	@Override
	public void doCare() {
		System.out.println("unani nursing.....");
	}
	@Override
	public void doCure() {
		System.out.println("unani curing.............");
	}
}
