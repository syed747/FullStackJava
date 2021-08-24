package Labworkweek2;

public class PyramidExampleReverse {
	public static void main(String[] args) {
        int term=6;
        for(int i=1;i<=term;i++) {
     	   {
						for(int j=term;j>=i;j--)
                     {
                     	    System.out.print("* ");//it should be print not println
                     }
                     System.out.println();//new line
            }
        }
    }
}