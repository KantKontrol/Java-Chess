import java.awt.image.BufferedImage;

public class Queen extends Piece{


	public Queen(int xLoc, int yLoc, String imageURL, String teamString){
		super(xLoc,yLoc,imageURL,teamString);


		this.setPointVal(9);
	}


}