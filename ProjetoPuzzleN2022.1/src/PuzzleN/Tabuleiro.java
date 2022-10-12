package PuzzleN;//

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tabuleiro{
	protected int tamanho;
	protected String[] listaPecas;
	protected String[][] matrizPecas;
		
    public Tabuleiro(int tamanho){//construtor do método.
	setMatriz(tamanho);
}
    
    public int getTamanho() {
    	return this.tamanho;
    }
    
	public void setMatriz(int tamanho) { //define o tamanho da matriz do tabuleiro.
		if(tamanho == 3) {
			this.tamanho = tamanho;
		}
	}
	

	
	public String[][] getTabuleiro() {
		return this.matrizPecas;
	}
	
	
	public void setTabuleiro(String[][] tabuleiro) { 
		this.matrizPecas = tabuleiro;
	}
        
        public void preencheArray() { //Cria uma array com os valores do tabuleiro.
		String[] tempArray = new String[this.tamanho*this.tamanho]; //array que armazena a ordem dos elementos.
		for(int i = 0; i < this.tamanho*this.tamanho; i++) {
			tempArray[i] = String.valueOf(i + 1);
		}
		this.listaPecas = tempArray; 
		listaPecas[listaPecas.length - 1] = "  ";
	}
        
        public void preencheMatriz() {//Cria uma array bidimensional para o tabuleiro.
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
        
        public int getVazio() {//encontra e retorna o valor do valor vazio do tabuleiro.
        	int pos = 0;
    		for(int i = 0; i < this.listaPecas.length; i++) {
    			if(listaPecas[i].equals("  ")) {
    				pos = i;
    			}
    		}
    		return pos;
        }
	
        public void embaralhaArray() { //embaralha a lista 
            List<String> list =Arrays.asList(this.listaPecas); //embaralha o array que contém as pecas
            Collections.shuffle(list);
            list.toArray(this.listaPecas);
    	}
	
        public void exibeTabuleiro() { //Printa na tela os numeros da array em forma de uma matriz.
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
	
	public String[][] getMatrizCorreta(){
		String[][] matrizCorreta = new String[this.tamanho][this.tamanho];
		String[] listaPecas = new String[this.tamanho*this.tamanho];
		int contador = 0;
		
		for(int i = 0; i < this.tamanho*this.tamanho; i++) {
			listaPecas[i] = String.valueOf(i + 1);
		}
		listaPecas[listaPecas.length - 1] = "  ";
		
		for(int i = 0; i < this.tamanho; i++) {
            for(int k = 0; k < this.tamanho; k++) {
                matrizCorreta[i][k] = listaPecas[contador]; //escreve no console enquanto não há interface
                contador++;
            }
        }
		return matrizCorreta;
	}
	
	public String[] getListaPecas() {
		return this.listaPecas;
	}
	
	public String[] getListaCorreta() {
		String[] listaPecas = new String[this.tamanho*this.tamanho];
		
		for(int i = 0; i < this.tamanho*this.tamanho; i++) {
			listaPecas[i] = String.valueOf(i + 1);
		}
		listaPecas[listaPecas.length - 1] = "  ";
		return listaPecas;
	}
	
	public void setListaPecas(String[][] matriz) {
		int contador = 0;
		for(int i = 0; i < this.tamanho; i++) {
			for(int k = 0; k < this.tamanho; k++) {
				this.listaPecas[contador] = matriz[i][k];
				contador++;
			}
		}
	}
}
