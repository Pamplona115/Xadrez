package tabuleiro;

public class Piece {
	
	protected posição lugar;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		lugar = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
