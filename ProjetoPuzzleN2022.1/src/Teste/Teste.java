package Teste;

import Interface.*;
import PuzzleN.*;
import fontsAndImages.*;
import java.awt.Font;
import javax.swing.UIManager;
public class Teste{
	public static void main (String[]args) {
		Fonts fontManager = new Fonts();
        Font minecraftFontBold = fontManager.CarregarFonte("/fontsAndImages/Minecraft.ttf", Font.PLAIN, 30);

        UIManager.put("Button.font",minecraftFontBold);
        UIManager.put("Label.font",minecraftFontBold);
        new MenuInter();    
        }    
}
