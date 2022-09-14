package PuzzleN;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tabuleiro{
	protected int tamanho;
	protected String[] listaPecas;
	protected String[][] matrizPecas;
		
	
	public void setMatriz(int tamanho) { 
		if(tamanho == 3) {
			this.tamanho = tamanho;
		}
	}
	
        public Tabuleiro(int tamanho){
		setMatriz(tamanho);
	}
	
	public String[][] getTabuleiro() {
		return this.matrizPecas;
	}
	
	
	public void setTabuleiro(String[][] tabuleiro) { 
		this.matrizPecas = tabuleiro;
	}
	
	
	
	public void preencheMatriz() {
		int var = 0;
		String[][] inter = new String[this.tamanho][this.tamanho];
        for(int i = 0; i < this.tamanho; i++) {
            for(int k = 0; k < this.tamanho; k++) {
                inter[i][k] = this.listaPecas[var]; 
                var++;
            }
        }
        this.matrizPecas = inter;
	}
        
        public void preencheArray() { 
		String[] tempArray = new String[this.tamanho*this.tamanho]; 
		for(int i = 0; i < this.tamanho*this.tamanho; i++) {
			tempArray[i] = "[" + String.valueOf(i + 1) + "]";
		}
		this.listaPecas = tempArray; 
		listaPecas[listaPecas.length - 1] = "[ ]";
	}
	
	
	
        public void exibeTabuleiro() { 
        for(int i = 0; i < this.tamanho; i++) {
            for(int j = 0; j < this.tamanho; j++) {
                System.out.print(this.matrizPecas[i][j] + "\t"); 
            }
            System.out.println();
            }
	}
        
	public void misturaArray() { //comando que embaralha a lista
        List<String> list =Arrays.asList(this.listaPecas); 
        Collections.shuffle(list);
        list.toArray(this.listaPecas);
	}
	
	
	
}
