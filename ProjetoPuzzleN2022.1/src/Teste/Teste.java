package Teste;

import Interface.*;
import PuzzleN.*;
import fontsAndImages.*;
import java.awt.Font;
import javax.swing.UIManager;
public class Teste{
	public static void main (String[]args) {
		//new GUI(); 
		//Menu menu = new Menu();
		//menu.iniciarMenu();
		
		
            //Tabuleiro tabuleiro = new Tabuleiro(3);
	    //tabuleiro.preencheArray();
		//tabuleiro.misturaArray();
		//tabuleiro.preencheMatriz();
		//tabuleiro.exibeTabuleiro();
		
		//Buttom butaum = new Buttom(3);
		//butaum.preencheArray();
		//butaum.preencheMatriz();
		//butaum.exibeTabuleiroCorreto();
                
                Fonts fontManager = new Fonts();
                Font minecraftFontBold = fontManager.CarregarFonte("/fontsAndImages/Minecraft.ttf", Font.PLAIN, 13);
                
                UIManager.put("Button.font",minecraftFontBold);
                new MenuInter().setVisible(true);
                
        }    
}
