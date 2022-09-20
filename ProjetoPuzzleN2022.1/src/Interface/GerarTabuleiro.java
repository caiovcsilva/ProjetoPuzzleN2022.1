package Interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import fontsAndImages.*;

import PuzzleN.*;

public class GerarTabuleiro extends JPanel implements ActionListener{
	
	private Peca tabuleiro;
	private static final Color CorPecinha = new Color(221, 121, 115);
	private static final Color CorPecinhaCerta = new Color(255, 189, 3);
	private int tamanho;
	private int tamanhoPeca;
	private int margem;
	private int tamanhoMatriz; 
	private int dimensao;
	private boolean fimDeJogo;
	private JButton botaoAjuda;
	private JButton voltar;
	
	
	public GerarTabuleiro(int tam, int dim, int mar, Peca tab) {
		
		Fonts fontManager = new Fonts();
        Font minecraftFontBold = fontManager.CarregarFonte("/fontsAndImages/Minecraft.ttf", Font.PLAIN, 30);
		
		this.tamanho = tam;
		this.margem = mar;
		this.dimensao = dim;
		this.tabuleiro = tab;
		this.botaoAjuda = new JButton("Ajuda");
		this.voltar = new JButton("Voltar");
		
		
		add(botaoAjuda);
		botaoAjuda.addActionListener(this);
		
		
	    this.tamanhoMatriz = (dim - 2 * this.margem);
	    this.tamanhoPeca = this.tamanhoMatriz / this.tamanho;
	    
	    setPreferredSize(new Dimension(dimensao, dimensao + margem));
	    setBackground(Color.LIGHT_GRAY);
	    setForeground(CorPecinha);
	    
	    //Tentei fazer a fonte funcionar com o Graphics2D, mas ainda não consegui. Caio, pode dar uma olhada?
	    setFont(new Font("minecraftFontBold", Font.PLAIN, 40));
	    
	    fimDeJogo = false;
	    
	 
	    //Interação do jogo com os cliques do usuário. Também bugado.
	    addMouseListener(new MouseAdapter() {
	        @Override
	        public void mousePressed(MouseEvent e) {
	        	
	          if (fimDeJogo) {
	            novoJogo();
	            
	          } else {
	        	  
	            // posição do clique
	            int eixoX = e.getX() - margem;
	            int eixoY = e.getY() - margem;
	            
	            // verifica se teve um clique.
	            if (eixoX < 0 || eixoX > tamanhoMatriz  || eixoY < 0  || eixoY > tamanhoMatriz)
	              return;
	            
	            // encontra a posicao da peça clicada
	            int yClique = eixoX / tamanhoPeca;
	            int xClique = eixoY / tamanhoPeca;
	            
	            // definicao da posição da peça vazia.
	            int yVazio = tabuleiro.getVazio() % tamanho;
	            int xVazio = tabuleiro.getVazio() / tamanho;
	            
	            
	            if(xClique == xVazio - 1 && yClique == yVazio) {
	            	tabuleiro.mexeBaixo();
	            }
	            else if(xClique == xVazio + 1 && yClique == yVazio) {
	            	tabuleiro.mexeCima();
	            }
	            else if(xClique == xVazio && yClique == yVazio - 1) {
	            	tabuleiro.mexeDireita();
	            }
	            else if(xClique == xVazio && yClique == yVazio + 1) {
	            	tabuleiro.mexeEsquerda();
	            }
	            
	            fimDeJogo = tabuleiro.terminaJogo();
	            
	          }
	          
	          // repinta o tabuleiro na tela.
	          repaint();
	        }
	      });
	    novoJogo();
	}
	
	
	private void novoJogo() {
		fimDeJogo = false;
		tabuleiro.preencheArray();
		tabuleiro.embaralhaArray();
		tabuleiro.preencheMatriz();
	}
	
	
	private void desenhaMatriz(Graphics2D g) {
		
	    for (int i = 0; i < tabuleiro.getListaPecas().length; i++) {
	      // conversao do array unidimensional para uma bi.
	      int r = i / tamanho;
	      int c = i % tamanho;
	      // conversao feita na interface
	      int x = margem + c * tamanhoPeca;
	      int y = margem + r * tamanhoPeca;
	      
	   // verifica a peça vazia para saber se o jogo terminou.
	      if(tabuleiro.getListaPecas()[i].equals("  ")) {
	        if (fimDeJogo) { 
	          g.setColor(Color.white);
	          desenhaNumeros(g, "\u2715", x, y);
	        }
	        continue;
	      }
	      
	      // organizar/posicionar as peças.
	      if(tabuleiro.getListaPecas()[i].equals(tabuleiro.getListaCorreta()[i])) {
	    	  g.setColor(CorPecinhaCerta); //destaca as peças na posição correta.
	      }
	      else {
	    	  g.setColor(getForeground());
	      }
	      g.fillRect(x, y, tamanhoPeca, tamanhoPeca);
	      g.setColor(Color.black);
	      g.drawRect(x, y, tamanhoPeca, tamanhoPeca);
	      g.setColor(Color.white);
	      
	      desenhaNumeros(g, String.valueOf(tabuleiro.getListaPecas()[i]), x , y);
	    }
	  }

	
	  private void mensagemFimJogo(Graphics2D g) {
	    if (fimDeJogo) {
	      g.setFont(getFont().deriveFont(Font.BOLD, 18));
	      g.setColor(Color.WHITE);
	      String s = "PARABENS! VOCE GANHOU!";
	      g.drawString(s, (getWidth() - g.getFontMetrics().stringWidth(s)) / 2,
	          getHeight() - margem);
	    }
	  }
	  
	  
	  private void desenhaNumeros(Graphics2D g, String s, int x, int y) {
	    FontMetrics fm = g.getFontMetrics();
	    int ascendente = fm.getAscent();
	    int descendente = fm.getDescent();
	    g.drawString(s,  x + (tamanhoPeca - fm.stringWidth(s)) / 2, 
	        y + (ascendente + (tamanhoPeca - (ascendente + descendente)) / 2));
	  }
	  
	  

	  protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    Graphics2D g2D = (Graphics2D) g;
	    g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    desenhaMatriz(g2D);
	    mensagemFimJogo(g2D);
	  }


	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==botaoAjuda) {
			//Colocamos um popup com imagem resolvido do jogo?
		}		
		
	}
}