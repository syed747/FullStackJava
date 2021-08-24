package hit.day20;

public class StringDemo {
public static void main(String[] args) {
	String s="hello world";//only one value object is created
	String ss=new String("hello world");//one value object and one object gets created..
	
	//string are non mutable objects
	
	String temp=s;
	s=s+"...hi world";//new string s object is created
			System.out.println(s);
			System.out.println(temp);
			
			String newvalue=s.replace('h','m'); 
			System.out.println(s);
			System.out.println(newvalue);
			
			String t1="hello world";
			String t2="hello world";
			
			System.out.println(t1==t2);//==is for comparison
			
			String t11=new String("heloo world");
			String t22=new String("hello world");
			       
			System.out.println(t11==t2);
			//in case of new string-you cannot use == for comparison
			System.out.println(t11.hashCode()+":"+t22.hashCode());
			
			System.out.println(t11.charAt(6));
			System.out.println(t11.indexOf('w'));
			String sss=new String(new char[] {'a','b','c'});
			System.out.println(sss);
			System.out.println(t11.substring(0,6));
}
}
