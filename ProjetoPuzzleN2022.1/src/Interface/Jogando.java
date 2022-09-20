package Interface;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Interface.GerarTabuleiro;
import PuzzleN.Peca;

public class Jogando extends JFrame {
	
	//Metodo que faz o GerarTabuleiro rodar.
	public void jogando(int tamanhoMatriz){
		
	  	Peca tabuleiro = new Peca(tamanhoMatriz);
	  	
	    SwingUtilities.invokeLater(() -> {
	    	
	    	setVisible(true);
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	setTitle("Puzzle N- Caio e Sérgio");
	    	setLocationRelativeTo(null);
	    	setResizable(false);
	    	add(new GerarTabuleiro(tabuleiro.getTamanho(), 600, 60, tabuleiro), BorderLayout.CENTER);
	    	pack();
	    });
	    
	  }
}