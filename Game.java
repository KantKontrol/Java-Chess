import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Game extends JPanel{


	private Board board;


	BufferedImage[][] pieceImages;

	public Game(){

		pieceImages = ResLoader.getImage();

		board = new Board();



	}




	public void draw(Graphics g){
		board.draw(g);
		System.out.println("DRAWING");
	}

}