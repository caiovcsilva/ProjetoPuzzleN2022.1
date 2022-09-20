package PuzzleN;

public class Peca extends Tabuleiro{
	
	private String vazio;
	private int linha;
	public int coluna;
	private String numeroDaPeca;
	private String[][] matrizDasPecas;
	
	public Peca(int tamanho) {
		super(tamanho);
		// TODO Auto-generated constructor stub
	}
	
	
	public void encontrarVazio() { //método para achar o espaço vazio e usá-lo na movimentação
		this.matrizPecas = super.getTabuleiro();
		int linha = 0;
		int coluna = 0;
		for(int i = 0; i != this.matrizPecas.length; i++) {
			for(int k = 0; k != this.matrizPecas.length; k++) {
				if(this.matrizPecas[i][k] == "  ") {
					linha = i;
					coluna = k;
				}
			}
		}
		this.linha = linha;
		this.coluna = coluna;
	}
	
	//Movimentos das peças dependem disso.
	public void mexeDireita() {
		encontrarVazio();
		
		if(coluna != 0) {
			this.vazio = this.matrizPecas[linha][coluna];
			this.numeroDaPeca = this.matrizPecas[linha][coluna - 1];
			this.matrizPecas[linha][coluna] = this.numeroDaPeca;
			this.matrizPecas[linha][coluna - 1] = this.vazio;
		}
		super.setTabuleiro(this.matrizPecas);
		super.setListaPecas(matrizPecas);
	}
	
	
	public void mexeEsquerda() {
		encontrarVazio();
		
		if(coluna != super.getTamanho() - 1) {
			this.vazio = this.matrizPecas[linha][coluna];
			this.numeroDaPeca = this.matrizPecas[linha][coluna + 1];
			this.matrizPecas[linha][coluna] = this.numeroDaPeca;
			this.matrizPecas[linha][coluna + 1] = this.vazio;
		}
		super.setTabuleiro(this.matrizPecas);
		super.setListaPecas(matrizPecas);
	}
	
	
	public void mexeBaixo() {
		encontrarVazio();

		if(linha != 0) {
			this.vazio = this.matrizPecas[linha][coluna];
			this.numeroDaPeca = this.matrizPecas[linha - 1][coluna];
			this.matrizPecas[linha][coluna] = this.numeroDaPeca;
			this.matrizPecas[linha - 1][coluna] = this.vazio;
		}
		super.setTabuleiro(this.matrizPecas);
		super.setListaPecas(matrizPecas);
	}
	
	
	public void mexeCima() {
		encontrarVazio();
		
		if(linha != super.getTamanho() - 1) {
			this.vazio = this.matrizPecas[linha][coluna];
			this.numeroDaPeca = this.matrizPecas[linha + 1][coluna];
			this.matrizPecas[linha][coluna] = this.numeroDaPeca;
			this.matrizPecas[linha + 1][coluna] = this.vazio;
		}
		super.setTabuleiro(this.matrizPecas);
		super.setListaPecas(matrizPecas);
	}


	public boolean terminaJogo() {
		int contador = 0;
		String[][] matrizCorreta = super.getMatrizCorreta();
		for(int i = 0; i < super.getTamanho(); i++) {
			for(int k = 0; k < super.getTamanho(); k++) {
				if(this.matrizPecas[i][k].equals(matrizCorreta[i][k])) {
					contador++;
				}
			}
		}
		if(contador == super.getTamanho()*super.getTamanho()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
