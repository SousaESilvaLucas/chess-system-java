package model.entities;

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
	
	protected void toPosition() {
		// Parses (Integer row, char column) to Position
	}
	
	protected static ChessPosition fromPosition(Position position) {
		// Parses Position to Chess Position
		return new ChessPosition();
	}
}
