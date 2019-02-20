package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;
	
	public ChessPiece() {
		
	}

	public ChessPiece(Board board, Color color, int moveCount) {
		super(board);
		this.color = color;
		this.moveCount = moveCount;
	}

	public Color getColor() {
		return color;
	}

	public int getMoveCount() {
		return moveCount;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		return false;
		
	}

	protected void increaseMoveCount() {
		
	}
	
	protected void decreaseMoveCount() {
		
	}
}
