package Teste;

import PuzzleN.*;

public class Teste{
	public static void main (String[]args) {
		//new GUI();
		//Menu menu = new Menu();
		//menu.iniciarMenu();
		
		
		/*Tabuleiro tabuleiro = new Tabuleiro(3);
	    tabuleiro.preencheArray();
		tabuleiro.misturaArray();
		tabuleiro.preencheMatriz();
		tabuleiro.exibeTabuleiro();*/
		
		Buttom butaum = new Buttom(3);
		butaum.preencheArray();
		butaum.preencheMatriz();
		butaum.exibeTabuleiroCorreto();
	}
}
