package mod1_2.day2;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		RockySapant heroine=new RockySapant();
		try {
			heroine.buyDress();
		}catch(CameraException ce) {
			System.out.println("Exception is...:"+ce);
		}
		
		System.out.println(new Bus());
	}
}
class Bus{
	@Override
	public String toString() {
		return "This is bus class object...";
	}
}
class RockySapant{
	public void buyDress()throws CameraException
	{
		ShoppingMall damal=new ShoppingMall();
		
			damal.changeDress();
		
	}
}
class ShoppingMall{
	boolean lock=true;
	public void changeDress() throws CameraException{
		if(lock) {
			
				throw new CameraException("By mistake the camera got switched on....");
			
		}
	}
}
//custom exception
class CameraException extends Exception{
	String msg;
	public CameraException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "camera exception is thrown.................."+this.msg;
	}
}
