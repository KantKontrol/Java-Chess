import java.awt.image.BufferedImage;

public class Rook extends Piece{


	public Rook(int xLoc, int yLoc, String imageURL, String teamString){
		super(xLoc,yLoc,imageURL,teamString);

		this.setPointVal(5);
	}


}