package KnightingaleWeek3;

public class ConstructionDemo {
	public static void main(String[] args) {
		
		//Human.initialization(1000);
		
		Human1 fahad=new Human1("aaa");//this is at object level
		Human1 fahad2=new Human1(100000);//this is at object level
		Human1.initialization(100);//this is at class level
		fahad.business();
		fahad2.business();
	}
}
class Human1{
	//A constructor is similar to a method, but the name should be class name with return or void
	//this constructor is called when the object of Human class is created..
	static int honey;
	Human1(){
		
	}
	Human1(int honey){
		Human1.honey=honey;
		System.out.println("human cons called...");
	}
	Human1(String s){
		
	}
	static void initialization(int honey) {
		Human1.honey=honey;
		System.out.println("initialization code called...");
	}
	
	public void business() {
		System.out.println("honey honey honey...:"+Human1.honey);
	}
}
