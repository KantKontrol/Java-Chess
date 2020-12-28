import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game extends JPanel implements ActionListener{

	private Main m;
	private Board board;
	private Timer t;


	BufferedImage[][] pieceImages;

	private int turnID = 0; //0 for white, 1 for black

	public Game(Main m){
		this.m = m;
		pieceImages = ResLoader.getImage();

		board = new Board(m);
		startTimer();
		calculateTurn();
	}

	public void calculateTurn(){

		if(this.turnID == 0){
			System.out.println("Whites turn");
		}
		else {
			System.out.println("Blacks turn");
		}

	}

	public void startTimer(){
		t = new Timer(1000, this);
		t.start();
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == t){
			m.repaint();
		}
	}




	public void draw(Graphics g){
		board.draw(g);
		System.out.println("DRAWING");
	}

}