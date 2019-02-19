package boardgame;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private int rows;		
	private int columns;	
	private List <Piece> pieces = new ArrayList<>();  
	
	public Board() {
		
	}
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public List<Piece> getPieces() {
		return pieces;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Position auxPosition = new Position();
		
		sb.append("  ");
		for (int j = 1; j <= columns; j++) {
			sb.append(j + " ");
		}
		sb.append("\n");
		
		for (int i = 1; i <= rows; i++) {
			sb.append(i + " ");
			for (int j = 1; j <= columns; j++) {
				auxPosition.setValues(i, j);
				if (thereIsAPiece(auxPosition)) {
					sb.append("P ");
				}
				else {
					sb.append("- ");
				}
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public Piece piece(int row, int column) {
		// gets piece at (row,column)
		return pieces.stream()
		.filter(p -> p.position.getRow() == row && p.position.getColumn() == column)
		.findFirst()
		.orElse(null);
	}
	
	public Piece piece(Position position) {
		// gets piece at (position)
		int row = position.getRow();
		int column = position.getColumn();
		
		return piece(row,column);
	}
	
	public void placePiece(Piece piece, Position position) {
		// places piece at position on the board
		piece.setPosition(position);
		pieces.add(piece);
	}
	
	public Piece removePiece(Position position) {
		// removes piece at position
		Piece removedPiece = piece(position);
		
		pieces.remove(removedPiece);
		return removedPiece;
	}
	
	public boolean positionExists(Position position) {
		// tests if position is inside the board
		
		if (position.getRow() >= 1 &&
				position.getRow() <= rows &&
				position.getColumn() >= 1 &&
				position.getColumn() <= columns) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public boolean thereIsAPiece(Position position) {
		// tests if there is a piece at position
		int row = position.getRow();
		int column = position.getColumn();
		if (piece(row, column) != null) {
			return true;
		}
		else {
			return false;
		}
	}
}
