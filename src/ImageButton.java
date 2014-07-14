import java.awt.*;
import java.awt.image.*;

public class ImageButton extends Button {
	protected BufferedImage image, imageh;
	protected int x, y, x2, y2;
	
	public ImageButton(int x, int y, int x2, int y2, String text, BufferedImage image, BufferedImage imageh) {
		super(x, y, x2-x, y2-y, text);
		this.image = image;
		this.imageh = imageh;
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void draw(Graphics g) {
		// Center Text
    	if(getCenter()) {
    		centerText(g);
    		setCenter(false);
    	}
    	
    	// Draw
    	if(getHover())
			g.drawImage(imageh, x, y, x2, y2, null);
		else
			g.drawImage(image, x, y, x2, y2, null);
        g.drawString(getText(), getTextX(), getTextY());
	}
}
