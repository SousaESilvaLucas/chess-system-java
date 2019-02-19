package boardgame;

public abstract class Piece {

	protected Position position;
	
	public Piece() {
	
	}

	public Piece(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
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
