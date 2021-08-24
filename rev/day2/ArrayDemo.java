package mod1.rev.day2;

public class ArrayDemo {
	public static void main(String[] args) {
		//single dimensional and two dimensional
		//uneven 
		
		int []arr= {10,20,30,40};
		int [][]twoarr= {
				{10,20,30},
				{30,50,60,50},
				{1,3,56,89,90}
		};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("......................................................");
		for(int i=0;i<twoarr.length;i++)//twwoarr.length - count of rows
		{
			for(int j=0;j<twoarr[i].length;j++)//twoarr[i].length - count of columns of that particular row
			{
				System.out.print(twoarr[i][j]+"\t");
			}
			System.out.println();
		}
		
		//enhanced for loop - introduce in jdk5
		System.out.println("..............................enhanced loop");
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		
		System.out.println("..................................................");
		for(int i[]:twoarr)//this returns each row as a single dimensional array 
		{
			{
		for(int j:i) {
					System.out.print(j+"\t");
		}
			System.out.println();
			}		
		}
	}
}