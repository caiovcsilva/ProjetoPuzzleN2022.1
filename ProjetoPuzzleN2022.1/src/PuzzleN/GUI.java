package PuzzleN;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

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
	private JButton botaoSair;
	private JPanel panel;
	Font tipoFonte;

	public GUI() {
		window = new JFrame();
		//window.getContentPane().setBackground(new Color(51,51,25));
		
		//Isso tudo só pra fonte diferenciada.
		try {
		InputStream is = getClass().getResourceAsStream("/fontsAndImages/04B_30__.ttf");
		tipoFonte = Font.createFont(Font.TRUETYPE_FONT, is);
		//necessario colocar o F por problemas de overflow. Levando em conta que queremos trabalhar com um float.
		tipoFonte = tipoFonte.deriveFont(50f);
		is= getClass().getResourceAsStream("/fontAndImages/04B_30__.ttf");
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//TITULO DO JOGO
		labelTitulo = new JLabel(" OneBit Puzzle N!");
		labelTitulo.setOpaque(true);
		labelTitulo.setForeground(new Color(184,194,185));
		labelTitulo.setBackground(new Color(56,43,38 ));
		labelTitulo.setFont(tipoFonte);
		
		//botao de INICIAR
		botaoIniciar = new JButton(">Iniciar");
		botaoIniciar.addActionListener(this);
		botaoIniciar.setFont(tipoFonte);
		botaoIniciar.setBackground(new Color(56,43,38));
		botaoIniciar.setForeground(new Color(184,194,185));
		
		//BOTAO DE OPCOES
		botaoOpcoes = new JButton(">Opcoes");
		botaoOpcoes.addActionListener(this);
		botaoOpcoes.setBackground(new Color(56,43,38));
		botaoOpcoes.setForeground(new Color(184,194,185));
		botaoOpcoes.setFont(tipoFonte);
		
		//BOTAO DE SAIR
		botaoSair = new JButton(">Sair");
		botaoSair.addActionListener(this);
		botaoSair.setBackground(new Color(56,43,38));
		botaoSair.setForeground(new Color(184,194,185));
		botaoSair.setFont(tipoFonte);
		
		
		
		//Faz os botoes e etc aparecerem na tela.
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300 , 300));
		panel.setLayout(new GridLayout(0, 1));
		panel.setBackground(new Color(56,43,38 ));
		panel.add(labelTitulo);
		panel.add(botaoIniciar);
		panel.add(botaoOpcoes);
		panel.add(botaoSair);

		
		window.add(panel, BorderLayout.CENTER);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("One bit- Puzzle N!");
		window.pack();
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
