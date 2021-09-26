package hit.mod1.level1.day1;
//Design Pattern - State Pattern
public class FunExercise {
	public static void main(String[] args) {
		//BadFan shaitan=new BadFan();
		GoodFan khaitan=new GoodFan();
		for(int i=0;i<10;i++) {
			//shaitan.pull();
			khaitan.pull();
		}
	}
}
//The badfan code is representing a dynamic case, so using if-else-if in dynamic code
//may result in open for modification - which is against the OPEN CLOSE PRINCIPLE
class BadFan{
	int state=0;
	public void pull() {
		if(state==0) {
			System.out.println("switch on state...");
			state=1;
		}
		else if(state==1) {
			System.out.println("medium speed state...");
			state=2;
		}
		else if(state==2) {
			System.out.println("high speed state...");
			state=3;
		}
		else if(state==3) {
			System.out.println("switch off state...");
			state=0;
		}
	}
	
}
/*
* For all dynamic programs, using if-else-if is a bad programming
* To remove the condition ladder we follow the following steps as a STRATEGY
* 1. Delete the conditional ladder
* 2. Convert the condition to classes
* 3. Create a hierarchial ABSTRACT class and group all the class under the hierarchial class
* 4. Create a relationship between the using class and the heirarchial class
*/
class GoodFan{
	State state=new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}
abstract class State{
	public abstract void pull(GoodFan fan);
}
class SwitchOffState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("switch on state....");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("Medium Speed....");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("High Speed state....");
		fan.state=new HighSpeedState();
	}
}
class HighSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("switch off state....");
		fan.state=new SwitchOffState();
	}
}
