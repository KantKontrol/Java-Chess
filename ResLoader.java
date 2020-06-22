import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class ResLoader {

	public static BufferedImage[][] getImage(){

		BufferedImage[][] readImages = new BufferedImage[6][2];

		try{

			BufferedImage img = ImageIO.read(new File("img/piece_sprite_sheet.png"));

			for(int y = 0; y < readImages[0].length;y++){
				for(int x = 0; x < readImages.length;x++){

					int imgX = 0;
					int imgY = 0;
					int size = 64;

					readImages[x][y] = img.getSubimage(imgX + (x * size), imgY + (y * size), size ,size);
				}
			}

		}catch(Exception e){
			System.out.println("Failed to get images" + e);

		}

		return readImages;
	}
}