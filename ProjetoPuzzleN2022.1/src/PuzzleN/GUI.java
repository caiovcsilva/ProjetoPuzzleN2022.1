package PuzzleN;


import fontsAndImages.Fonts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class GUI implements ActionListener{
	private JFrame window;
	private JLabel labelTitulo;
	private JButton botaoIniciar;
	private JButton botaoOpcoes;
	private JPanel panel;
	Fonts tipoFonte;

	public GUI() {
		window = new JFrame();
		//window.getContentPane().setBackground(new Color(51,51,25));
		
		tipoFonte = new Fonts();
		
		labelTitulo = new JLabel(" OneBit Puzzle N!");
		labelTitulo.setOpaque(true);
		labelTitulo.setForeground(new Color(184,194,185));
		labelTitulo.setBackground(new Color(56,43,38 ));
		labelTitulo.setFont(tipoFonte.fonte(tipoFonte.pixel, 0, 14));
		
		
		
		botaoIniciar = new JButton("Iniciar");
		botaoIniciar.addActionListener(this);
		botaoOpcoes = new JButton("Opcoes");
		botaoOpcoes.addActionListener(this);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300 , 300));
		panel.setLayout(new GridLayout(0, 1));
		panel.setBackground(new Color(56,43,38 ));
		panel.add(labelTitulo);
		panel.add(botaoIniciar);
		panel.add(botaoOpcoes);

		
		window.add(panel, BorderLayout.CENTER);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("One bit- Puzzle N!");
		//window.setFont(fontePixelada);
		window.pack();
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
