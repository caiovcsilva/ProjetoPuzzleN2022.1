package PuzzleN;
import java.util.Random;


public class Tabuleiro extends Menu{
	
	//tamanho de nosso tabuleiro. Nesse caso, no facil, um 3x3.
	private int tamanhoTabuleiro = 3;
	//Objeto que vamos usar para dispor as peças aleatorialmente no tabuleiro.
	private static final Random rand = new Random();
	//para saber quais peças estão em qual lugar.
	private Peca [][] quadrados;
	//quando o jogo acabar, é true.
	private boolean fimDeJogo;
	
	
	public Tabuleiro(int dificuldade) {
		setTamanhoTabuleiro(dificuldade);
		this.quadrados = new Peca[this.tamanhoTabuleiro][this.tamanhoTabuleiro];
	}
	
	
	
	public void setTamanhoTabuleiro(int dificuldade) {
		if ( dificuldade == 2) { 
			++this.tamanhoTabuleiro;
		}else if (dificuldade == 3) {
			this.tamanhoTabuleiro += 2;
		}
	}
	

	
	public void iniciar() {
		int tabuleiroNxN = this.tamanhoTabuleiro*this.tamanhoTabuleiro;
		Random valorRandomPecas = new Random();
		int X_random;
		int Y_random;
		
		for (int n=1;tabuleiroNxN>n;n++) {
			do {
				X_random = valorRandomPecas.nextInt(this.tamanhoTabuleiro-1);
			 	Y_random = valorRandomPecas.nextInt(this.tamanhoTabuleiro-1);
			} while(quadrados[X_random][Y_random].hasNumeroPeca);
			quadrados[X_random][Y_random].setnumeroDaPeca(n);
		}
	}
	

	
}
