package fontsAndImages;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class Fonts {
	
	
	public Font CarregarFonte( String caminhoFonte, int tipoFonte, float tamanhoFonte) {
                Font minhaFonte = null;
                
		try{
                    
                    minhaFonte = Font.createFont(
                    Font.TRUETYPE_FONT, getClass().getResourceAsStream(caminhoFonte)).deriveFont(tipoFonte,tamanhoFonte);                                              
             
                }catch(IOException ex){
                        ex.printStackTrace();
                    
                }catch(FontFormatException ex){
                        ex.printStackTrace();
                }
                
                return minhaFonte;
        }
}