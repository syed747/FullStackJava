package hit.mod1.level2.day2;

public abstract class Item {
	public abstract void execute()throws DogExceptions;
}
class StickItem extends Item{
	@Override
	public void execute() throws DogExceptions{
		throw new DogBiteException("You beat I Bite....");
	}
}
class StoneItem extends Item{
	@Override
	public void execute()throws DogExceptions {
		throw new DogBarkException("You throw I bark......")		;
	}
}
class BiscuitItem extends Item{
	@Override
	public void execute()throws DogExceptions {
		throw new DogHappyException("Yummy yummy I love biscuits......")		;
	}
}
