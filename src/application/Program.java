package application;

import boardgame.Board;
import boardgame.Position;
import model.entities.King;

public class Program {

	public static void main(String[] args) {
		
		final int chessBoardRows = 8;
		final int chessBoardColumns = 8;
		Position [][] BoardPositions = 
				new Position[chessBoardRows + 1][chessBoardColumns + 1];
		/* We create a bigger matrix to improve readability of chess positions
		 * No 0-index */
		
		for (int i = 1; i <= chessBoardRows; i++) {
			for (int j = 1; j <= chessBoardColumns; j++) {
				BoardPositions[i][j] = new Position(i,j);
			}
		}
		
		Board chessBoard = new Board(chessBoardRows, chessBoardColumns);
		
		chessBoard.placePiece(new King(), BoardPositions[1][1]);
		chessBoard.placePiece(new King(), BoardPositions[2][2]);
		chessBoard.placePiece(new King(), BoardPositions[3][3]);
		chessBoard.placePiece(new King(), BoardPositions[4][4]);
		System.out.println(chessBoard);
		
		
		System.out.println(chessBoard.positionExists(new Position (9,0)));

	}

}
