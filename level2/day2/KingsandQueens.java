package hit.mod1.level2.day2;

public class KingsandQueens {
public static void main(String[] args) {
	Tv sony=new Tv();
	XBox xBox=new XBox();
	VGame vGame=new VGame();
	SoundSystem soundSystem=new SoundSystem();
	SetTopBox tataSky=new SetTopBox();
	
	FatherNewsCommand fnc=new FatherNewsCommand(sony, tataSky, vGame, soundSystem, xBox);
	MotherSerialCommand msc=new MotherSerialCommand(sony, tataSky, vGame, soundSystem, xBox);
	FatherVGameCommand fvc=new FatherVGameCommand(sony, tataSky, vGame, soundSystem, xBox);
	
	SevaGenie genie=new SevaGenie();
	
	genie.setCommand(fnc, 0);
	genie.setCommand(fvc, 1);
	genie.setCommand(msc, 2);
	
	//now the royal treatment starts....
	
	genie.executeCommand(0);//this is all my father will say...
	
}
}
class SevaGenie{
Command command[]=new Command[5];
public SevaGenie() {
	for(int i=0;i<5;i++) {
		command[i]=new DummyCommand(null, null, null, null, null);
	}
}
public void setCommand(Command command,int slot) {
	this.command[slot]=command;
}
public void executeCommand(int slot) {
	this.command[slot].execute();
}
}
abstract class Command{
Tv tv;SetTopBox setTopBox;VGame vGame;SoundSystem soundSystem;XBox xBox;

public abstract void execute();
public Command(Tv tv, SetTopBox setTopBox, VGame vGame, SoundSystem soundSystem, XBox xBox) {
	this.tv = tv;
	this.setTopBox = setTopBox;
	this.vGame = vGame;
	this.soundSystem = soundSystem;
	this.xBox = xBox;
}
}
class DummyCommand extends Command{
public DummyCommand(Tv tv, SetTopBox setTopBox, VGame vGame, SoundSystem soundSystem, XBox xBox) {
	super(tv,setTopBox,vGame,soundSystem,xBox);		
}
@Override
public void execute() {
	System.out.println("I am dummy yet to be operational...........");
}
}
class FatherNewsCommand extends Command{
public FatherNewsCommand(Tv tv, SetTopBox setTopBox, VGame vGame, SoundSystem soundSystem, XBox xBox) {
	super(tv,setTopBox,vGame,soundSystem,xBox);		
}
@Override
public void execute() {
	//write the logic of my servant.
	System.out.println("The logic for news channel started....");
	tv.av1();
	setTopBox.newsChannel();
	soundSystem.highSound();
	System.out.println("The news channel is ready...enjoy the news...");
}
}
class MotherSerialCommand extends Command{
public MotherSerialCommand(Tv tv, SetTopBox setTopBox, VGame vGame, SoundSystem soundSystem, XBox xBox) {
	super(tv,setTopBox,vGame,soundSystem,xBox);		
}
@Override
public void execute() {
	//write the logic of my servant.
	System.out.println("The logic for serial channel started....");
	tv.av1();
	setTopBox.serialChannel();
	soundSystem.lowSound();
	System.out.println("The serial channel is ready...enjoy the saas bahu jhagda.....");
}
}
class FatherVGameCommand extends Command{
public FatherVGameCommand(Tv tv, SetTopBox setTopBox, VGame vGame, SoundSystem soundSystem, XBox xBox) {
	super(tv,setTopBox,vGame,soundSystem,xBox);		
}
@Override
public void execute() {
	//write the logic of my servant.
	System.out.println("The logic for vgame channel started....");
	tv.av2();
	vGame.TTGame();
	soundSystem.lowSound();
	System.out.println("The TT game is ready...enjoy the game.....");
}
}
class Tv{
public void av1() {
	System.out.println("tv in av1 mode....");
}
public void av2() {
	System.out.println("tv in av2 mode....");
}
}
class SetTopBox{
public void serialChannel() {
	System.out.println("saas bahu serial..............");
}
public void newsChannel() {
	System.out.println("boring news channel...............");
}
}
class VGame{
public void TTGame() {
	System.out.println("vgame tt game....");
}

}
class SoundSystem{
public void lowSound() {
	System.out.println("low sound..........");
}
public void highSound() {
	System.out.println("high sound.........");
}
}
class XBox{
public void boxingGame() {
	System.out.println("boxing game.......enjoying....");
}
}