package LabworkWeek3;

public class NumberList1to100 {
//15.(a)To generate a Prime number list between 1 to 100
public static void main(String[] args) {
	     int n=100;
	     String prime=" ";
	     for(int i=1;i<=n;i++){
	    	 int counter=0;
	    	 for(int j=i;j>=1;j--){
	    		 if(i%j==0){
	    			 counter=counter+1;
	    		 }
	    	 }
	                 if(counter==2){
	                 prime=prime+i+" ";
	     }
	     }
	     System.out.println("prime no. are:");
	     System.out.println("************************");
	     System.out.println(prime);
	     }
}
