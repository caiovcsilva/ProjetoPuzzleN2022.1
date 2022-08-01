package PuzzleN;
import java.util.*;

public class Menu {
	private int dificuldade = 1;
	
	public int getDificuldade() {
		return dificuldade;
	}
	
	public void iniciarMenu() {
		Scanner sc= new Scanner(System.in);
		System.out.println("JOGAR -1");
		System.out.println("OPCOES -2");
		int input = sc.nextInt();
		
		switch (input) {
		case 1:jogar(); break;
		case 2: opcoes(); break;
		default: sair();
		}
	}
	
	
	
	public void jogar() {
		Tabuleiro jogoAtivo = new Tabuleiro(dificuldade);
		jogoAtivo.iniciar();
	}
	
	public void acessarRanking() {
		
	}
	
	public void opcoes() {

	}
	
	public void acessarCreditos() {
		
	}
	
	public void sair() {
		
	}
}