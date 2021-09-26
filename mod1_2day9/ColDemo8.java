package mod1_2day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ColDemo8 {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("s1", "hello");
		hm.put("s2", "hai");
		
		System.out.println(hm.get("s1"));
		Set s= hm.entrySet();
		for(Object o:s) {
			System.out.println(o);
		}
		
		Iterator iter=s.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}