package Labworkweek2;

public class SumofArrayValues {
    public static void main(String[] args) {
		int[] array = {10,20,30,40,50,10};
		int sum=0;
		//advanced for the loop
		for(int num:array) {
			sum=sum+num;
		}
		System.out.println("sum of array elements is:"+sum);
	}
}
