package LabworkWeek3;

public class TwoDimentionalRectangularArray {
//11.Write a program to display number matrix as follows using Two Dimensional Rectangular Array. 
// 1
// 2 3
	public static void main(String[] args) {
		int a=4,z=1;
		int matrix[][]=new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				matrix[i][j]=z;
				z++;
			}
		}
		System.out.println("Entered ("+a+" x "+a+") Matrix is: ");
		System.out.println("------------------------------------");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------");
	}
}
