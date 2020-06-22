import java.awt.image.BufferedImage;

public class King extends Piece{


	public King(int xLoc, int yLoc, String imageURL, String teamString){
		super(xLoc,yLoc,imageURL,teamString);

		this.setPointVal(-1);
	}


}