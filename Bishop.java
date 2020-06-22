import java.awt.image.BufferedImage;

public class Bishop extends Piece{


	public Bishop(int xLoc, int yLoc, String imageURL, String teamString){
		super(xLoc,yLoc,imageURL,teamString);

		this.setPointVal(3);
	}


}