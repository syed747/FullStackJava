package mod1_2.day8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo6 {
	public static void main(String[] args) {
		Set set=new HashSet();
		set =new TreeSet();
		
		set.add("zzz");
		set.add("bbb");
		set.add("aaa");
		set.add("ddd");
		set.add("aaa");
		set.add("ccc");
				
		System.out.println(set);
		
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
