package hit.mod1.level2.day2;

import java.util.Scanner;

public class FunExcercise4 {
	public static void main(String[] args)throws Exception {
		Dog tomy=new Dog();
		
		Child baby=new Child();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the item class name..:");
		String itemClass=scan.next();
		
		Item item=(Item)Class.forName("hit.mod1.level2.day2."+itemClass).newInstance();
		
		baby.playWithDog(tomy, item);
	}
}
