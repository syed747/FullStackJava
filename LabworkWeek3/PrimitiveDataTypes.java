package LabworkWeek3;

public class PrimitiveDataTypes {
// 2.Write a program to print default values of all primitive types. 
	int i;
	byte b;
	short s;
	long l;
	float f;
	double d;
	boolean flag;
	char ch;
	public static void main(String[] args) {
		PrimitiveDataTypes ob =new PrimitiveDataTypes();
		System.out.println("the defalult value of byte is :"+ob.b);
		System.out.println("the default value of short is :"+ob.s);
		System.out.println("the default value of integer is :"+ob.i);
		System.out.println("the default value of long is :"+ob.l);
		System.out.println("the default value of float is :"+ob.f);
		System.out.println("the default value of double is :"+ob.d);
		System.out.println("the default value of boolean is :"+ob.flag);
		System.out.println("the default value of char is :"+ob.ch);

	}
}
