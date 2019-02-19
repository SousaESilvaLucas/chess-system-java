package model.entities;

import boardgame.Position;
import model.entities.enums.Color;

public class King extends ChessPiece{

	public King() {
		
	}
	
	public King(Position position, Color color, Integer moveCount) {
		super(position, color, moveCount);
	}

	@Override
	public String toString() {
		return super.getColor() + " King" + super.position; 
	}
	
	@Override
	public boolean[][] possibleMoves() {
		// Implements possible moves
		return null;
	}

}
