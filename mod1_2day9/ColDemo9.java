package mod1_2day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ColDemo9 {
	public static void main(String[] args) {
		Map hm=new HashMap();
		hm=new TreeMap();
		hm.put("s2", "zillo");
		hm.put("s3", "hai");
		hm.put("s1", "joy");
		
		System.out.println(hm.get("s1"));
		Set s= hm.entrySet();
		for(Object o:s) {
			System.out.println(o);
		}
		
		Iterator iter=s.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		iter=s.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println("Key...:"+me.getKey());
			System.out.println("Value..:"+me.getValue());
		}
	}
}