package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private Integer row;
	
	public ChessPosition() {
		
	}
	
	public ChessPosition(char column, Integer row) {
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}
	
	@Override
	public String toString() {
		return  "("+ column + row +")";
	}
	
	protected Position toPosition() {
		// Parses (Integer row, char column) to Position
		int positionRow = 8 - this.row + 1;	// 1 --> 8; 2 --> 7, 3 --> 6, etc
		int positionColumn = 0;
		
		switch (this.column) {		
		case 'a':
			positionColumn = 1;	
			break;
		case 'b':
			positionColumn = 2;
			break;
		case 'c':
			positionColumn = 3;
			break;
		case 'd':
			positionColumn = 4;
			break;
		case 'e':
			positionColumn = 5;
			break;
		case 'f':
			positionColumn = 6;
			break;
		case 'g':
			positionColumn = 7;
			break;
		case 'h':
			positionColumn = 8;
			break;
		}
		return new Position(positionRow, positionColumn);
	}
	
	protected static ChessPosition fromPosition(Position position) {
		// Parses Position to Chess Position
		int positionRow = position.getRow();
		int positionColumn = position.getColumn();
		
		int chessRow = 8 - positionRow + 1;
		
		char chessColumn = 0;
		switch (positionColumn) {		
		case 1:
			chessColumn = 'a';
			break;
		case 2:
			chessColumn = 'b';
			break;
		case 3:
			chessColumn = 'c';
			break;
		case 4:
			chessColumn = 'd';
			break;
		case 5:
			chessColumn = 'e';
			break;
		case 6:
			chessColumn = 'f';
			break;
		case 7:
			chessColumn = 'g';
			break;
		case 8:
			chessColumn = 'h';
			break;
		}
		
		return new ChessPosition(chessColumn, chessRow);
	}
}
