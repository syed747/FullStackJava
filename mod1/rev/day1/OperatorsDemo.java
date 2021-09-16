package mod1.rev.day1;

public class OperatorsDemo {
public static void main(String[] args) {
	/*
	 * arthemitic operator
	 * relational operator
	 * logical operator
	 * 
	 */
	
	int i=10;
	int j=2;
	System.out.println("addition...:"+(i+j));
	System.out.println("syubstracting...:"+(i-j));
    System.out.println("multiplication...:"+(i*j));
    System.out.println("division.**quotent**...:"+(i/j));
    System.out.println("division-mod..**reminder**...:"+(i%j));
    
    int x=10;
    //x=x+1;
    System.out.println(x++);//this will print x first and then increment
	System.out.println(x);
	
	x=10;
	System.out.println(++x);//increment first and then prints
	System.out.println(x);
	
	x=10;
	System.out.println(x--);//this will print x first and then decrement
	System.out.println(x);
	
	x=10;
	System.out.println(--x);//decrement first and the print
	System.out.println(x);
	
	//x=x+5;
	x=10;
	//x=x+4;
	x+=4;
	System.out.println(x);
	
	x=10;
	//x=x*4;
	x*=4;
	System.out.println(x);
	
	x=10;
	//x=x-4;
	x-=4;
	System.out.println(x);
	
	x=10;
	//x=x/2;
	x/=2;
	System.out.println(x);
	
	x=11;
	//x=x%4;
	x%=4;
	System.out.println(x);
	
	//RELATIONAL OPERATORS
	
	int ii=10;
	int jj=20;
	
	System.out.println(ii==jj);
	System.out.println(ii!=jj);//negate of equals
	System.out.println(ii<jj);
	System.out.println(ii>jj);
	System.out.println(ii<=jj);
	System.out.println(ii>=jj);
	
	//LOGICAL OPERATORS && || !
	System.out.println(ii<jj && ii==100);
	
	System.out.println(ii>jj || ii==100);//even if one expression returns true, the return value will be true
	
	
	
    
}
}
