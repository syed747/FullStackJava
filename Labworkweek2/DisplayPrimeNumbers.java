package Labworkweek2;

public class DisplayPrimeNumbers {
	   public static void main(String[] args) {
		      int i=0;
		      int num =0;
		      //empty string
		      String primeNumbers = "";
		      
		      for (i=1; i<=100;i++) {
		      }
		          int counter= +1;
		          for(num=i;num>=1;num--);
		        {
		            if(i%num==0)
		          {	
		        	counter =counter+1;
		        }
	       }
	        if(counter==2) 
	        {
	        	//appended the prime number to he string
	        	primeNumbers = primeNumbers + i +"";
	        }
	      System.out.println("Prime numbers from 1 to 100 are:");
	      System.out.println(primeNumbers);
	   }
	   
	}
