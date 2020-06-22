import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class Piece {

	private String teamString = "none"; //none, WHITE, BLACK
	private int pointVal = 0;
	private BufferedImage pieceImage;
	private int xLoc = 0;
	private int yLoc = 0;

	public Piece(int xLoc, int yLoc, String imageURL, String teamString){
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.pieceImage = pieceImage;
		this.teamString = teamString;

		loadImage(imageURL);
	}

	public void loadImage(String imageURL){ //this function loads the piece image

		try{
			this.pieceImage = ImageIO.read(new File(imageURL));
		}
		catch(Exception e){
			System.out.println("Error loading piece image at url: " + imageURL);
		}
	}

	public void draw(Graphics g){

		g.drawImage(pieceImage, xLoc, yLoc, null);
	}

	public void setPointVal(int pointVal){
		this.pointVal = pointVal;
	}

	public String getTeamString(){ return teamString; }
	public int getVal() { return pointVal; }
	public int getX(){ return xLoc; }
	public int getY(){ return yLoc; }
	public void setLoc(int x, int y){ this.xLoc = x; this.yLoc = y; }

}