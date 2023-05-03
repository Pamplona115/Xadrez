package chess;

import tabuleiro.Piece;
import tabuleiro.Board;

public class ChessPiece extends Piece{
	
	private cores cor;

	public ChessPiece(Board board, cores cor) {
		super(board);
		this.cor = cor;
	}

	public cores getCor() {
		return cor;
	}
	
}
