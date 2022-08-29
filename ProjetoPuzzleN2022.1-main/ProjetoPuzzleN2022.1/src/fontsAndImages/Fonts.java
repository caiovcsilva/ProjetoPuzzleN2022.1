package fontsAndImages;

import java.awt.Font;
import java.io.InputStream;

public class Fonts {
	private Font font= null;
	public String pixel="04B_30__";
	
	
	public Font fonte( String nomeDaFonte, int estilo, float tamanho) {
		try {
			//tenta carregar a fonte
			InputStream is = getClass().getResourceAsStream(nomeDaFonte);
			this.font = Font.createFont(Font.TRUETYPE_FONT, is);			
		} catch (Exception ex) {//caso falhe.
			System.err.println( nomeDaFonte + "Deu bronca chefe.");
			font = new Font("Arial", Font.PLAIN,900000);
		}
		Font tfont = font.deriveFont(estilo, tamanho);
		return tfont;
	}
	
	
}
