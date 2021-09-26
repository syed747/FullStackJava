package hit.mod1.level2.day2;

public class Child {
	public void playWithDog(Dog dog,Item item) {
		try {
			dog.play(item);
		}catch(DogExceptions de) {
			System.out.println(de);
			de.visit();
		}
	}
}
