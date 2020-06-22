import java.awt.Graphics;
import java.awt.Color;


public class Square {

	final int squareWidth = 64;
	final int squareHeight = 64;

	private int xLoc = 0;
	private int yLoc = 0;

	private int filled;

	private Piece currentPiece = null;


	public Square(int xLoc, int yLoc, int filled){

		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.filled = filled;
	}


	public void draw(Graphics g){

		if(filled == 1){
			g.setColor(Color.gray);
			g.fillRect(xLoc, yLoc, squareWidth, squareHeight);

			if(currentPiece != null)
				currentPiece.draw(g);
		}
		else{
			g.setColor(Color.lightGray);
			g.fillRect(xLoc, yLoc, squareWidth, squareHeight);

			if(currentPiece != null)
				currentPiece.draw(g);
		}
	}

	public int getX(){ return xLoc; }
	public int getY(){ return yLoc; }
	public void setPiece(Piece currentPiece){
		this.currentPiece = currentPiece;
		this.currentPiece.setLoc(xLoc, yLoc);

	}
	public Piece getPiece(){ return currentPiece; }

}