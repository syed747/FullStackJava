package mod1_2day9;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
public class IODemo3 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("google.html");
		URL url=new URL("https://www.google.com/index.html");
		URLConnection urlcon=url.openConnection();
		
		InputStream is=urlcon.getInputStream();
		
		BufferedInputStream bis=new BufferedInputStream(is);
		
		int i=0;
		byte b[]=new byte[32];
		while((i=bis.read(b))!=-1) {
			String s=new String(b,0,i);
			System.out.print(s);
			fos.write(b,0,i);
		}
	}
}