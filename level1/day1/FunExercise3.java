package hit.mod1.level1.day1;

public class FunExercise3 {
	public static void main(String[] args) {
		//BadDog bullDog=new BadDog();
		GoodDog tomy=new GoodDog();
		//BadChild naughty=new BadChild();
		GoodChild baby=new GoodChild();
		baby.playWithDog(new StickItem(), tomy);
	}
}
class DogExceptions extends Exception{
	
}
class DogBiteException extends DogExceptions{}
class DogBarkException extends DogExceptions{}
//This is bad code because the code is open for modification
class BadDog{
	public void play(String item) throws DogExceptions{
		if(item.equals("stick")) {
			throw new DogBiteException();
		}
		else if(item.equals("stone")) {
			throw new DogBarkException();
		}
	}
}
class GoodDog{
	public void play(Item item)throws DogExceptions {
		item.execute();
	}
}
abstract class Item{
	public abstract void execute()throws DogExceptions;
}
class StoneItem extends Item{
	@Override
	public void execute()throws DogExceptions {
		throw new DogBiteException();
	}
}
class StickItem extends Item{
	@Override
	public void execute() throws DogExceptions {
		throw new DogBarkException();
	}
}
class BadChild{
	public void playWithDog(String item, BadDog dog) {
		try{
			
			dog.play(item);
			
		}catch(DogBiteException dbe) {
			dbe.printStackTrace();
		}
		catch(DogBarkException dbr) {
			dbr.printStackTrace();
		}
		catch(DogExceptions de) {
			de.printStackTrace();
		}
	}
}
class GoodChild{
	public void playWithDog(Item item, GoodDog dog) {
		try{
			
			dog.play(item);
			
		}catch(DogBiteException dbe) {
			dbe.printStackTrace();
		}
		catch(DogBarkException dbr) {
			dbr.printStackTrace();
		}
		catch(DogExceptions de) {
			de.printStackTrace();
		}
	}
}
