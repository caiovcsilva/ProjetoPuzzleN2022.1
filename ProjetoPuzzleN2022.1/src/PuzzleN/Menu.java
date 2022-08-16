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
		System.out.println("Altere a dificuldade do jogo! Escolha entre 1 a 3.");
		Scanner sc= new Scanner(System.in);
		this.dificuldade = sc.nextInt();
		
	}
	
	public void acessarCreditos() {
		
	}
	
	public void sair() {
		
	}
}