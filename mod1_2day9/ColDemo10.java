package mod1_2day9;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ColDemo10 {
	public static void main(String[] args)throws Exception {
		Properties prop=new Properties();
		
		prop.load(new FileInputStream("abc.properties"));
		
//		prop.put("s1", "hello");
//		prop.put("s2", "hai");
//		prop.put("s2", "joy");
		
		System.out.println(prop.get("s1"));
		
		Set s= prop.entrySet();
		
		Iterator iter=s.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println("Key..:"+me.getKey());
			System.out.println("Value..:"+me.getValue());
		}
	}
}





