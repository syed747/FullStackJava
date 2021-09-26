package mod1_2day8;

import java.util.Iterator;
import java.util.Vector;

public class GenericsDemo2 {
	public static void main(String[] args) {
		Vector<Dabba> v=new Vector<>();
		v.add(new Dabba());
		v.add(new Dabba());
		v.add(new Dabba() );
		
		Iterator<Dabba> iter=v.iterator();
		while(iter.hasNext()) {
			Dabba d=iter.next();
			d.enjoy();
		}
		
	}
}
class Dabba1{
	public void enjoy() {
		System.out.println("dabba enjoyment...");
	}
}