package RevisionGen;

public class RevisionGen5 {
	public static void main(String[] args) {
		//HaarisInfotech hit=new HaarisInfotech();
		//hit.teachingProcess();
		
		syedInfotech git=new syedInfotech();
		git.teachingProcess();
		git.payFranchiseeFees();
	}
}
abstract class HaarisInfotech{
	//final methods cannot be overridden
	final public void teachingProcess() {
		System.out.println("teaching process of HIT.......................");
	}
	abstract public void payFranchiseeFees();
}
class syedInfotech extends HaarisInfotech {
//	public void teachingProcess() {
//		System.out.println("teaching process of GIT..........");
//	}
	
	@Override
	public void payFranchiseeFees() {
		System.out.println("GIT writes the logic on the payment of franchisee fee to HIT...");
	}
}