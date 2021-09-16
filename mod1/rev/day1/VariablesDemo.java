package mod1.rev.day1;

public class VariablesDemo {
	public static void main(String[] args) {
	/*
	 * variable declaration
	 * variable initialization
	 * variable valid names
	 */
		//in java we have 4 types of variables
		/*
		 * number variables
		 * floating variables
		 * boolean variables
		 * char variables
		 */
		// number variables- byte,short,int,long
		//variable valid names
		/*
		 * age-is a valid name
		 * 2age-invalid name -because it starts with a number
		 * @age-invalid name becaue it starts with a special caracter
		 * age e- invalid nme because there is a space in between 
		 * switch-invalid name because its a keyword
		 * $age-valid name 
		 * _age-valid name
		 * a_g$e-valid names- number can be in between 
		 * 
		 * they are applicable to class names and method names alo
		 * 
		 */
		//variable declaration
		byte b;//8 bit
		short s;//16 bit
		int i;//32 bit
		long l; //64bit
		
		//variable initialization
		b=127;
		s=32000;
		i=34_34_343;
		//floating types
		float f=100;
		float ff=110.2f;//Compulsory u have suffix with float with a decimal value
		double d=100.454;//64 bit
		
		//booleans
		boolean bb=true;
		boolean bbb=false;
		boolean bbbb;
		
		//char
		
		char c='a';
		char cc=97;
				int n=97;
				char ccc=(char)n;//When an integer is given to a char then type casting is must
				int nn=cc;//when a char is assinged to int there is no need for type casting
				
				System.out.println((char)97);
				System.out.println((char)nn);
		
		
		
}
}
