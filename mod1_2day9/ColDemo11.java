package mod1_2day9;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
public class ColDemo11 {
	
public static void main(String[] args) {
	Map wm=new WeakHashMap();
	//wm=new HashMap();
	String s1=new String("s100");
	String s2=new String("s200");
	
	wm.put(s1, "hello");
	wm.put(s2, "hai");
	
	System.out.println(wm);
	
	s1=null;
	
	System.gc();
	
	System.out.println(wm);
}
}