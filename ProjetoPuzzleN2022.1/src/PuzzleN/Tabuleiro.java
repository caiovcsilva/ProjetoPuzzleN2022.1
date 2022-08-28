package PuzzleN;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tabuleiro{
	public int tamanho;
	private String []pecas;
	private String[][] totalPecas;
	
	
	
	private Peca[][] arrayCasa = new Peca[tamanho][tamanho]; // neste exemplo são o tamanho inserido pelo usuário

	public Tabuleiro(int tamanho) {
		setTamanho(tamanho);
	}
	
	public int setTamanho(int tamanho) {
		return this.tamanho = tamanho;
	}
	
	
	public Peca getCasa(int linha, int coluna){
		return arrayCasa[linha][coluna];
	}

	public void setCasa(int linha, int coluna, Peca peca){
		arrayCasa[linha][coluna] = peca;

	}
	
	public void alocarPosicoes() { 
		String[] tempArray = new String[this.tamanho*this.tamanho]; 
		for(int i = 0; i < this.tamanho*this.tamanho; i++) {
			tempArray[i] = "[" + String.valueOf(i + 1) + "]";
		}
		this.pecas = tempArray; 
		pecas[pecas.length - 1] = "[ ]";
	}

	public void iniciarTabuleiro() {
		
		
	}
	
	public void misturarNumeros() { 
        List<String> list =Arrays.asList(this.pecas); 
        Collections.shuffle(list);
        list.toArray(this.pecas);
	}
	
	public void exibeTabuleiro() { 
        for(int i = 0; i < this.tamanho; i++) {
            for(int j = 0; j < this.tamanho; j++) {
                System.out.print(this.totalPecas[i][j] + "\t"); 
            }
            System.out.println();
        }
	}
	
}
