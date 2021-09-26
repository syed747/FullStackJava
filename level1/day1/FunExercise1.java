package hit.mod1.level1.day1;

//Design Patterns - DECORATOR PATTERN
import java.io.BufferedReader;
import java.io.InputStreamReader;
//Thaali - composition - Decorator
public class FunExercise1 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Food thaali=new Rice(new Mutton(new Daal(new Fish())));
		
		System.out.println("Cost of Thaali...:"+thaali.cost());
	}
}
abstract class Food{
	public abstract int cost();
}
abstract class NonVegFood extends Food{}
abstract class VegFood extends Food{}
class Mutton extends NonVegFood{
	Food item;
	public Mutton() {
		// TODO Auto-generated constructor stub
	}
	public Mutton(Food item) {
		this.item=item;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(item!=null) {
			return 50+item.cost();
		}
		else {
			return 50;
		}
	}
	
}
class Chicken extends NonVegFood{
	Food item;
	public Chicken() {
		// TODO Auto-generated constructor stub
	}
	public Chicken(Food item) {
		this.item=item;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(item!=null) {
			return 25+item.cost();
		}
		else {
			return 25;
		}
	}
	
}
class Fish extends NonVegFood{
	Food item;
	public Fish() {
		// TODO Auto-generated constructor stub
	}
	public Fish(Food item) {
		this.item=item;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(item!=null) {
			return 15+item.cost();
		}
		else {
			return 15;
		}
	}
	
}
class Rice extends NonVegFood{
	Food item;
	public Rice() {
		// TODO Auto-generated constructor stub
	}
	public Rice(Food item) {
		this.item=item;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(item!=null) {
			return 5+item.cost();
		}
		else {
			return 5;
		}
	}
	
}
class Daal extends NonVegFood{
	Food item;
	public Daal() {
		// TODO Auto-generated constructor stub
	}
	public Daal(Food item) {
		this.item=item;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(item!=null) {
			return 10+item.cost();
		}
		else {
			return 10;
		}
	}
	
}
