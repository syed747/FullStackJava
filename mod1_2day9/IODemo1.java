package mod1_2day9;

import java.io.FileInputStream;

public class IODemo1 {
	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("abc.properties");
		
//		char c=(char)fis.read();		
//		System.out.println(c);
//		c=(char)fis.read();		
//		System.out.println(c);
//		c=(char)fis.read();		
//		System.out.println(c);
//		c=(char)fis.read();		
//		System.out.println(c);
//		c=(char)fis.read();		
//		System.out.println(c);
//		c=(char)fis.read();		
//		System.out.println(c);
//		int i=fis.read();		
//		System.out.println(i);//-1 is End Of File
		
		int i=0;
//		while((i=fis.read())!=-1) {
//			System.out.println((char)i);
//		}
		int noOfBytesRead=0;
		byte b[]=new byte[8];
		while((noOfBytesRead=fis.read(b))!=-1) {
			System.out.println(noOfBytesRead);
			String s=new String(b,0,noOfBytesRead);
			System.out.println(s);
		}
	}
}