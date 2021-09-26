package hit.mod1.level2.day2;

public class Handler911 {
private Handler911() {
		
	}
	private static Handler911 handler;
	
	public static Handler911 getHandler() {
		if(handler==null) {
			handler=new Handler911();
		}
		return handler;
	}
	
	public void handle(DogBiteException dbe) {
		System.out.println("Dog has bitten,,,,let us take the victim to hospital....");
	}
	
	public void handle(DogBarkException dbee) {
		System.out.println("barking dogs seldom bite....no worries...keep going....");
	}
	public void handle(DogHappyException dbee) {
		System.out.println("Happy happy dog...will play with you...enjoy.....");
	}
}
