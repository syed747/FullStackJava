package mod1.rev.day1;

public class TypeCastingDemo {
	public static void main(String[] args) {
		int i=257;//32 bit size 
		acceptAge((byte)i);// doun casting from 32 bit you have coverted it to 8 bit
	    
		short b=(short)i;
	    System.out.println(b);
	    
	    long l=i;//lower is assingnd to higher- no casting -auto type promotion will happer
	    
	    float f=10.5f;//32bit
	    int x=(int)f;//32 bit
	    System.out.println(x);
	    
	    char c='a';
	    int cc=c;
	    char ccc=97;
	    char cccc=(char)cc;
	    
	}
	
	public static void acceptAge(byte b) {
		
	}	
}