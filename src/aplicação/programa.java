package aplicação;

import chess.ChessMatch;

public class programa {

	public static void main(String[] args) {
		
		//teste tabulerio//
		
		ChessMatch partida = new ChessMatch();
		UI.printBoard(partida.getPieces());
	}

}
