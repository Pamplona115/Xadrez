package tabuleiro;

public class tab {
	
	private int linha;
	private int coluna;
	private peça[][] peças;
	
	public tab(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		peças = new peça[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	
}
