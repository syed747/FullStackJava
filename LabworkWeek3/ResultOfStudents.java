package LabworkWeek3;

import java.util.Scanner;

public class ResultOfStudents {
//13.Write a Program to calculate result of students.(take no of- 
//	 -student as rows and marks as columns of two Dimensional Array)
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of STUDENTS  : ");
		int a=scan.nextInt();
		System.out.print("Enter the number of SUBJECT  : ");
		int b=scan.nextInt();
		System.out.println("------------------------------------");
		System.out.println("Please enter the Name and the Marks of the students......:");
		System.out.println("------------------------------------");
		String matrix[][]=new String[a][b+1];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b+1; j++) {
				if(j==0)
				{
				System.out.print("Enter name of Student  :  ");
				matrix[i][j]=scan.next();
				}
				else
				{
				System.out.print("Enter marks of subject ("+(j)+")  :  ");
				matrix[i][j]=scan.next();
				}
			}
			System.out.println(".................................");
		}
		System.out.println("Result of the students is: ");
		System.out.println("------------------------------------");
		for (String o[]: matrix) {
			for (String k : o) {
				System.out.print(k+"\t");
			}
			System.out.println(" ");
		}
	}
}
