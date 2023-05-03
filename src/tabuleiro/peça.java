package tabuleiro;

public class peça {
	
	protected posição lugar;
	private tab tabuleiro;
	
	public peça(tab tabuleiro) {
		this.tabuleiro = tabuleiro;
		lugar = null;
	}

	protected tab getTabuleiro() {
		return tabuleiro;
	}
	
	
}
