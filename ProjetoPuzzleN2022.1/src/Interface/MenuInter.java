
package Interface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import PuzzleN.Peca;
import Interface.Jogando;



public class MenuInter extends JFrame implements ActionListener {
	
    JButton botaoIniciar = new JButton("Iniciar!");
    JButton botaoOpcoes = new JButton("Config!");
    JButton botaoRanking = new JButton("Ranking!");
    JButton botaoSair = new JButton("Sair!");
    JLabel Titulo= new JLabel("Puzzle N!");
   
    public MenuInter() {
    	
    	setTitle("Puzzle N- Caio e Sérgio");
    	setSize(500,500);

    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setVisible(true);
    	setLocationRelativeTo(null);
    	setLayout(null);
    	setResizable(false);
    	getContentPane().setBackground(Color.LIGHT_GRAY);

    	add(Titulo);
    	Titulo.setBounds(135,80,300,100);
    	

        
    	add(botaoIniciar);
    	botaoIniciar.setBounds(200,261,313,50);
        
    	add(botaoOpcoes);
    	botaoOpcoes.setBounds(200,311,313,50);
        
    	add(botaoRanking);
    	botaoRanking.setBounds(200,361,313,50);
    	
    	add(botaoSair);
		botaoSair.setBounds(200,411,313,50);
        
        
		botaoIniciar.addActionListener(this);
		botaoOpcoes.addActionListener(this);
		botaoRanking.addActionListener(this);
		botaoSair.addActionListener(this);

    }
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==botaoIniciar) {
			this.dispose();
			Jogando jogando = new Jogando();
			jogando.jogando(3);
		}
		
		else if(e.getSource()==botaoOpcoes) {
			this.dispose();
			
		}
		
		else if(e.getSource()==botaoRanking) {
			this.dispose();
			
		}
		
		else if(e.getSource()==botaoSair) {
			System.exit(0);
		}
		
	}
}

