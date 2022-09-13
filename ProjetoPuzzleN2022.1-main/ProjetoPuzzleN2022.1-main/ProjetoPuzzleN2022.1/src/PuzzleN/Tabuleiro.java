package PuzzleN;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import PuzzleN.Buttom;

public class Tabuleiro{
	protected int tamanho;
	protected String[] listaPecas;
	protected String[][] matrizPecas;
	
	
	public Tabuleiro(int tamanho){
		setMatriz(tamanho);
	}
	
	
	public void setMatriz(int tamanho) { 
		if(tamanho == 3 || tamanho == 4) {
			this.tamanho = tamanho;
		}
	}
	
	
	public String[][] getTabuleiro() {
		return this.matrizPecas;
	}
	
	
	public void setTabuleiro(String[][] tabuleiro) { 
		this.matrizPecas = tabuleiro;
	}
	
	
	public void preencheArray() { //cria uma lista coms os valores
		String[] tempArray = new String[this.tamanho*this.tamanho]; //array temporário que armazena a ordem
		for(int i = 0; i < this.tamanho*this.tamanho; i++) {
			tempArray[i] = "[" + String.valueOf(i + 1) + "]";
		}
		this.listaPecas = tempArray; 
		listaPecas[listaPecas.length - 1] = "[ ]";
	}
	
	
	public void preencheMatriz() {
		int contador = 0;
		String[][] matrizTemp = new String[this.tamanho][this.tamanho];
        for(int i = 0; i < this.tamanho; i++) {
            for(int k = 0; k < this.tamanho; k++) {
                matrizTemp[i][k] = this.listaPecas[contador]; 
                contador++;
            }
        }
        this.matrizPecas = matrizTemp;
	}
	
	
	public void misturaArray() { //comando que embaralha a lista
        List<String> list =Arrays.asList(this.listaPecas); 
        Collections.shuffle(list);
        list.toArray(this.listaPecas);
	}
	
	
	public void exibeTabuleiro() { 
        for(int i = 0; i < this.tamanho; i++) {
            for(int j = 0; j < this.tamanho; j++) {
                System.out.print(this.matrizPecas[i][j] + "\t"); 
            }
            System.out.println();
        }
	}
	
	
}
