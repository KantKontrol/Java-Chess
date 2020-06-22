import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;

class Main extends JFrame{

    final int SCREEN_WIDTH = 600;
    final int SCREEN_HEIGHT = 600;

    Game game;


    public void setup(){

		setupScreen();

		game = new Game();



		this.setContentPane(new DrawingPanel());

		this.repaint();

    }

    public void setupScreen(){

		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}


	public class DrawingPanel extends JPanel{
		public void paintComponent(Graphics g){
			game.draw(g);
		}
	}

    public static void main(String args[]){
        Main m = new Main();
        m.setup();
    }
}