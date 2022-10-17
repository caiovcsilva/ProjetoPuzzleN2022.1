package PuzzleN;//

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tabuleiro{
	protected int tamanho;
	protected String[] listaPecas;
	protected String[][] matrizPecas;
		
    public Tabuleiro(int tamanho){
	setMatriz(tamanho);
}
    
    public int getTamanho() {
    	return this.tamanho;
    }
    
	public void setMatriz(int tamanho) {
		if(tamanho == 3) {
			this.tamanho = tamanho;
		}if(tamanho == 2) {
			this.tamanho = tamanho;
		}
		if(tamanho == 4) {
			this.tamanho = tamanho;
		}
	}
	

	
	public String[][] getTabuleiro() {
		return this.matrizPecas;
	}
	
	
	public void setTabuleiro(String[][] tabuleiro) { 
		this.matrizPecas = tabuleiro;
	}
        
        public void preencheArray() {
		String[] tempArray = new String[this.tamanho*this.tamanho]; 
		for(int i = 0; i < this.tamanho*this.tamanho; i++) {
			tempArray[i] = String.valueOf(i + 1);
		}
		this.listaPecas = tempArray; 
		listaPecas[listaPecas.length - 1] = "  ";
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
        
        public int getVazio() {
        	int pos = 0;
    		for(int i = 0; i < this.listaPecas.length; i++) {
    			if(listaPecas[i].equals("  ")) {
    				pos = i;
    			}
    		}
    		return pos;
        }
	
        public void embaralhaArray() {
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
        
	public void misturaArray() {
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
                matrizCorreta[i][k] = listaPecas[contador];
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
