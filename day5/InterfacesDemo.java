package hit.mod1.level2.day5;

public class InterfacesDemo {
	public static void main(String[] args) {
		Dominos khanD=new KhanDominos();
		
		Dominos kapoorD=new KapoorDominos();
		
		Dominos.advertisement();
		khanD.getOrderAndPayment();
		khanD.delivery();
	}
}
interface Dominos{
	static void advertisement() {
		System.out.println("common advertisement for all the franchisees....");
	}
	
	default public void makeDough() {
		System.out.println("create dough as per dominos standards...");
	}
	default public void makeIngredients() {
		System.out.println("make ingredients as per dominos standards..");
	}
	default public void doBaking() {
		System.out.println("do baking as per dominos standards...");
	}
	
	default public void doPacking() {
		System.out.println("do packing as pas dominos standards...");
	}
	default public void makePizza() {
		makeDough();
		makeIngredients();
		doBaking();
		doPacking();
	}
	public void getOrderAndPayment();
	public void delivery();
}
class KhanDominos implements Dominos{
	@Override
	public void delivery() {
		makePizza();
		System.out.println("delivery of pizza as per khan dominos standard...");
	}
	@Override
	public void getOrderAndPayment() {
		System.out.println("order and payment processing as per khan dominos logic..");
	}
}
class KapoorDominos implements Dominos{
	@Override
	public void delivery() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getOrderAndPayment() {
		// TODO Auto-generated method stub
		
	}
}
