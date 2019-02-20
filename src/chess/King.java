package chess;

import boardgame.Board;

public class King extends ChessPiece{

	public King() {
		
	}
	
	public King(Board board, Color color, Integer moveCount) {
		super(board, color, moveCount);
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
