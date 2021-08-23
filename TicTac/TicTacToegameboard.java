package TicTac;

public class TicTacToegameboard {

	public static void main(String[] args) {
		
		char[] [] gameBoard = {{' ', '|', ' ', '|', ' '}, 
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}};	
		
		for(char[] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);//removed ln from println
			}
			System.out.println();
		}
	}

}
