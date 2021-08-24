package Labworkweek2;

public class PrintAsiciiValue {
    public static void main(String[] args) {
		char ch='h';
		int ascii=ch;
		//you can also cast char into int 
		int castascii=(int) ch;
		System.out.println("the ascii value of "+ch+ "is"+ascii);
		System.out.println("the ascii value of "+ch+"is"+castascii);
	}
}
