package Interface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import PuzzleN.Peca;
import Interface.Jogando;
import Interface.MenuInter;

public class Opcoes extends JFrame implements ActionListener{

    JButton botaoDificuldadeFacil = new JButton("FACIL!");
    JButton botaoDificuldadeNormal = new JButton("MEDIO!");
    JButton botaoDificuldadeDificil = new JButton("DIFICIL!");
    JButton botaoVoltar = new JButton("Voltar!");
    JLabel Titulo= new JLabel("Configs!");
    JLabel Dificuldade= new JLabel("Dificuldade:");
    
    public int dificuldade = 3;
    public void setDificuldade(int dificuldade) {
    	this.dificuldade = dificuldade;
    }

	public void Opcoes() {
		setTitle("Puzzle N- Caio e Sérgio");
		setSize(500,500);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.LIGHT_GRAY);

		add(Titulo);
		Titulo.setBounds(10,10,300,100);
		add(Dificuldade);
		Dificuldade.setBounds(10,50,300,100);
		
		add(botaoDificuldadeFacil);
    	botaoDificuldadeFacil.setBounds(10,140,250,40);
        
    	add(botaoDificuldadeNormal);
    	botaoDificuldadeNormal.setBounds(10,175,250,40);
        
    	add(botaoDificuldadeDificil);
    	botaoDificuldadeDificil.setBounds(10,210,250,40);
    	
    	add(botaoVoltar);
		botaoVoltar.setBounds(200,411,313,50);
		
		botaoDificuldadeFacil.addActionListener(this);
		botaoDificuldadeNormal.addActionListener(this);
		botaoDificuldadeDificil.addActionListener(this);
		botaoVoltar.addActionListener(this);
	    }
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==botaoVoltar) {
			this.dispose();
			new MenuInter();
		}
		if(e.getSource()==botaoDificuldadeFacil) {
			this.dispose();
			setDificuldade(2);
			new MenuInter();
		}
		if(e.getSource()==botaoDificuldadeNormal) {
			this.dispose();
			new MenuInter();
		}
		if(e.getSource()==botaoDificuldadeDificil) {
			this.dispose();
			new MenuInter();
		}
	}
	}
	

