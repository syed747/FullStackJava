package CompleteRivision;
import malik.MoleculeFramework;
public class Demo {
	public static void main(String[] args) {
		Object shoiab=new Human();
		
		AlopathyMedicalCollege amc=new AlopathyMedicalCollege();
		
		if(shoiab instanceof Doctor) {
			System.out.println("shoiab is a doctor...");
		}
		else {
			System.out.println("shoiab is not a doctor...");
		}
		
		//link or subject shoiab to medical college
		MoleculeFramework.setInterface(Doctor.class);
		Doctor doctorShoiab=(Doctor)MoleculeFramework.getObject(new Object[] {shoiab,amc});
		
		if(doctorShoiab instanceof Doctor) {
			System.out.println("shoiab is now a doctor...");
		}
		else {
			System.out.println("shoiab is not a doctor........");
		}
		
		doctorShoiab.doCure();
		
		HaarisInfotech goldenTouch=new HaarisInfotech();
		
		MoleculeFramework.setInterface(Programmer.class);
		Programmer programmerShoiab=(Programmer)MoleculeFramework.getObject(new Object[] {doctorShoiab,goldenTouch});
		
		programmerShoiab.doProgramming();
		
		Doctor docSho=(Doctor)programmerShoiab;
		docSho.doCure();
	}
}
