package boardgame;

public abstract class Piece {

	protected Position position;
	protected Board board;
	
	public Piece() {
	
	}

	public Piece(Board board) {
		this.board = board;
		this.position = null ;
	}

	protected Board getBoard() {
		return board;
	}
	
	public Position getPosition() {
		return position;
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		// Checks if a position is available, i.e. if it exists
		return false;
	}
	
	public boolean isThereAnyPossibleMove() {
		// Check-mate implementation?
		return false;
	}
	
}
