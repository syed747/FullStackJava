package Labworkweek2;

import java.util.Scanner;

public class FindAreaofTriangle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("enter the width of the triangle:");
        double base=scanner.nextDouble();
        
        System.out.println("enter the height of the triangle");
        double height=scanner.nextDouble();
        
        //area = (width*height)/2
        double area =(base*height)/2;
        System.out.println("area of the triangle is:"+area);
}
}
