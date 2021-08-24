package LabworkWeek3;

public class Question13 {
	public static void main(String[] args) {
		int total=0;

	int marks[][]= {
			{100,80,90,66},
			{90,90,100,75},
			{68,80,70,100},
			{88,85,90,85},
			{99,91,80,77},

	};
	System.out.println("Students "+"\tMaths"+"\tEnglish"+"\tScience"+"\tSocial");

	for(int i =0;i<marks.length;i++) {

		System.out.print("Student "+(i+1)+" : \t");
		for(int j = 0; j<marks[i].length;j++) {
			total+=marks[i][j];
			System.out.print(marks[i][j]+ "\t");
			
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("The Grand Total is : "+total);
}
}
