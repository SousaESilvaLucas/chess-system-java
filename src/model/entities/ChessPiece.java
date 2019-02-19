package model.entities;

import boardgame.Piece;
import boardgame.Position;
import model.entities.enums.Color;

public abstract class ChessPiece extends Piece {

	private Color color;
	private Integer moveCount;
	
	public ChessPiece() {
		
	}

	public ChessPiece(Position position, Color color, Integer moveCount) {
		super(position);
		this.color = color;
		this.moveCount = moveCount;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Integer getMoveCount() {
		return moveCount;
	}
	
	public ChessPosition getChessPosition() {
		return new ChessPosition();
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		return false;
		
	}

	protected void increaseMoveCount() {
		
	}
	
	protected void decreaseMoveCount() {
		
	}
}
