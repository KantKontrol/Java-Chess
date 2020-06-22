import java.awt.image.BufferedImage;

public class Pawn extends Piece{


	public Pawn(int xLoc, int yLoc, String imageURL, String teamString){
		super(xLoc,yLoc,imageURL,teamString);

		this.setPointVal(1);
	}


}