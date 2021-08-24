package Labworkweek2;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
		int rows,numbers=1,counter,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of rows");
		rows=input.nextInt();
		for(counter = 1;counter<=rows;counter++) {
			for(j=1; j<=counter;j++) {
				System.out.print(numbers+' ');//be care full this '' not this ""
				//and print not println
				numbers++;
				
			}
			//for new line
			System.out.println();
		}

		
    }
}
