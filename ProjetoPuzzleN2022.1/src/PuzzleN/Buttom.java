package PuzzleN;

public class Buttom extends Tabuleiro {
		public Buttom(int tamanho) {
			super(tamanho);
			
		}

	public void exibeTabuleiroCorreto() { 
        for(int i = 0; i < super.tamanho; i++) {
            for(int j = 0; j < super.tamanho; j++) {
                System.out.print(super.matrizPecas[i][j] + "\t"); 
            }
            System.out.println();
        }
	
	// exibe as posições corretas da matriz desejada no jogo.
	}
}
