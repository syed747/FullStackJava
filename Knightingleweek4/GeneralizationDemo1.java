package Knightingleweek4;

//subclass can replace the super class reference
//Object re usability and code re usability
//overriding
//abstract keyword
//multiple inheritance
public class GeneralizationDemo1 {
	public static void main(String[] args) {
		//Subclass is a king of superclass
		//Subclass object can replace the superclass object
		SuperClass sc1=new SubClass1();
		SuperClass sc2=new SubClass2();
		
		Engineer empEngineer=new Engineer();
		Employee empAttendar=new Attendar();
		acceptEmployee(empEngineer);
		acceptEmployee(empAttendar);
		
		acceptEngineer(empEngineer);
		//acceptEngineer(empAttendar);
		
	}
	public static void acceptEmployee(Employee e) {//generic method
		
	}
	public static void  acceptEngineer(Engineer ee) {//specific method
		
	}
}
class SuperClass{
	
}
class SubClass1 extends SuperClass{//subclass is a kind of superclass
	
}
class SubClass2 extends SuperClass{//subclass2 is kind of superclass
	
}

class Employee{
	
}
class Engineer extends Employee{}//engineer is a kind of employee
class
Attendar extends Employee{}//attendar is a kind of employee