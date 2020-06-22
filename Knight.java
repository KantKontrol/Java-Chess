import java.awt.image.BufferedImage;

public class Knight extends Piece{


	public Knight(int xLoc, int yLoc, String imageURL, String teamString){
		super(xLoc,yLoc,imageURL,teamString);

		this.setPointVal(3);
	}


}