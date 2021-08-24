package KnightingaleWeek5;

import malik.MoleculeFramework;
public class Demo {
	//private static Class c[]={Doctor.class,Pilot.class,Steward.class};
	public static void main(String[] args) {
		
		AlopathyMedicalCollege stanelyMC=new AlopathyMedicalCollege();	//1907
		Object fahad=new Human();//1974
//		//today i am checking...2021/8/5
		if(fahad instanceof Doctor){
			System.out.println("shoiab is a doctor...");
		}else{
			System.out.println("shoiab is not a doctor");
		}
//		Doctor doctor=(Doctor)fahad;
//		doctor.doCure();
		System.out.println("shoiab goes to medical college.....");
		MoleculeFramework.setInterface(Doctor.class);
		fahad=
			MoleculeFramework.getObject
			(new Object[]{fahad,stanelyMC});//subjection
		if(fahad instanceof Doctor){
			System.out.println("shoiab is now a doctor after mixing");
		}
		Doctor doctorshoiab=(Doctor)fahad;
		doctorshoiab.doCure();
//////////		
//	
	JetAirAcademy ja=new JetAirAcademy();
//////		
		MoleculeFramework.setInterface(Pilot.class);
		MoleculeFramework.setInterface(Steward.class);
	fahad=MoleculeFramework.getObject
		(new Object[]{fahad,ja});
		Pilot pilot=(Pilot)fahad;
		pilot.doFly();
		doctorshoiab=(Doctor)fahad;
		doctorshoiab.doCure();
//////		
//////		
	}
}
