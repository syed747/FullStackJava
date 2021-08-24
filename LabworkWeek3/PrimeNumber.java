package LabworkWeek3;

public class PrimeNumber {
//4.Write a program to find weather a number is Prime or not?
public static void main(String[] args) {
	int num=7;
	int temp=0;
	for(int i=2;i<=num-i;i++) {
				if(num%i==0) {
					
					temp=temp+1;
				}
				if(temp==0) {
						System.out.println("is prime number"+num);
				}
				else {
					System.out.println("is not a prime number"+num);
				}
					
        	}
		}
}