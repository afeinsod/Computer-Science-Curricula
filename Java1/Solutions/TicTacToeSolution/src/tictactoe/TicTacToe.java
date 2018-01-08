package tictactoe;

import java.util.Scanner;

public class TicTacToe
{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		initBoard();
		displayBoard();
                boolean xTurn=true;
                
                System.out.println("Welcome to Tic Tac Toe!");
                
                while (!tieGame() && !gameWon()) {
                    if (xTurn) {
                        System.out.println("It's X's turn. Where do you want to go?");
                        System.out.println("(Type 2 numbers 0-2, separated by a space. The first is the row, the second is the column)");
                        String input = keyboard.nextLine();
                        int r = Integer.parseInt(input.substring(0,1));
                        int c = Integer.parseInt(input.substring(2,3));
                        xTurn(r,c);
                    }
                    else {
                        System.out.println("It's O's turn. Where do you want to go?");
                        System.out.println("(Type 2 numbers 0-2, separated by a space. The first is the row, the second is the column)");
                        String input = keyboard.nextLine();
                        int r = Integer.parseInt(input.substring(0,1));
                        int c = Integer.parseInt(input.substring(2,3));
                        oTurn(r,c);
                    }
                    xTurn=!xTurn;
                    displayBoard();
                }
                
	}

        public static boolean tieGame() {
            boolean tie=true;
            for ( int r=0; r<3; r++ ) {
			for ( int c=0; c<3; c++ ) {
				if (board[r][c] == ' ') {
                                    tie = false;
                                }
                        }
            }
            if (tie) {
                System.out.println("It's a tie!");
            }
            return tie;
        }
        
        public static boolean gameWon() {
            boolean win = false; 
            char winner=' ';
            for ( int r=0; r<3; r++ ) {
                if ((board[r][0] == board[r][1]) && (board[r][1] == board[r][2]) && (board[r][2] != ' ')) {
                 win = true;
                 winner=board[r][0];
                }
            }
            for ( int c=0; c<3; c++ ) {
                if ((board[0][c] == board[1][c])  && (board[1][c] == board[2][c])&& (board[2][c] != ' ')){
                    win = true;
                    winner=board[0][c];
                }
            }
            if ((board[0][0] == board[1][1])  && (board[1][1] == board[2][2])&& (board[2][2] != ' ')){
                    win = true;
                    winner=board[0][0];
                }
            if ((board[0][2] == board[1][1])  && (board[1][1] == board[2][0])&& (board[2][0] != ' ')){
                    win = true;
                    winner=board[0][2];
                }
            if (win) {
                System.out.println(winner + " is the winner!");
            }
            return win;
        }
        
        public static void xTurn(int r, int c) {
            board[r][c] = 'X';
        }
        
        public static void oTurn(int r, int c) {
            board[r][c] = 'O';
        }
        
        
	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

}
