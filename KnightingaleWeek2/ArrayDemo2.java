package KnightingaleWeek2;

public class ArrayDemo2 {
	public static void main(String[] args) {
		//single dimensional array
		//one row and multiple columns..
		int i[]= {34,45,56,567,87};
		//we have initialized an array with values
		
		System.out.println(i[4]);
		
		System.out.println(i.length);//return the size of the array
		
		for(int x=0;x<i.length;x++) {
			System.out.print(i[x]+"\t");
		}
		System.out.println();
		
		//new for loop introduced in jdk 5 - enhanced for loop
		//enhanced for loop is used only for arrays and collection
		for(int y:i) {// no need to do increment nor condition check
			System.out.print(y+"\t");
		}
		System.out.println();
		String arr[]=new String[5];//declaring a array with a default initialization
		
		arr[0]="hello";//i am assigning some value to 0th index
		arr[1]="hai";
		arr[2]="world";
		
		for(String x:arr) {
			System.out.println(x);
		}
		
		//two dimensional array
		
		int twod[][]= {
				{10,20,30},
				{100,200,300},
				{1000,2000,3000}
		};
		
		System.out.println(twod[2][1]);
		System.out.println("**************************************");
		
		for(int x[]:twod) {//returns one row
			for(int y:x) {//reads values one by one from the row
				System.out.print(y+"\t");
			}
			System.out.println();
		}
		
		System.out.println("*********************************");
		for(int x=0;x<twod.length;x++) {//twod.length will return the number of rows...
			for(int z=0;z<twod[x].length;z++) {//twod[x].length will return the number of columns in that row
				System.out.print(twod[x][z]+"\t");
			}
			System.out.println();
		}
		
	}
}
