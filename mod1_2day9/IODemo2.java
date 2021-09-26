package mod1_2day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IODemo2 {
	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos=new FileOutputStream("abc.txt");
		
		fos.write(97);
		
		String str="====jack and jill went up the hill...====";
		
		fos.write(str.getBytes());
		
		FileInputStream fis=new FileInputStream("abc.properties");
		byte b[]=new byte[8];
		int i=0;
		while((i=fis.read(b))!=-1) {
			fos.write(b,0,i);
		}
		
	}
}
