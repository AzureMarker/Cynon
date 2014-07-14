import java.awt.*;
import java.awt.event.*;

/**
 * @author Mcat12
 */
public class MainMenu implements Screen {
	Dimension screenSize;
	
	public MainMenu(Dimension screenSize) {
		this.screenSize = screenSize;
	}
	
	@Override
	public void displayOutput(Graphics g) {
		// Shows a grid with 50x50 blocks
		g.setColor(Color.GRAY);
		for(int i = 0; i < screenSize.width; i = i + 50) {
			g.drawLine(i, 0, i, screenSize.height);
		}
		for(int i = 0; i < screenSize.height; i = i + 50) {
			g.drawLine(0, i, screenSize.width, i);
		}
	}
	
	@Override
	public Screens getScreenType() {
		return Screens.MAINMENU;
	}
	
	@Override
	public Screen getScreen() {
		return this;
	}
	
	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return this;
	}
	
	@Override
	public Screen respondToUserInputReleased(KeyEvent key) {
		return this;
	}
	
	@Override
	public Screen respondToUserInputHover(MouseEvent mouse) {
		return this;
	}
	
	@Override
	public Screen respondToUserInputClick(MouseEvent mouse) {
		return this;
	}
	
	@Override
	public Screen respondToUserInput(MouseWheelEvent mouse) {
		return this;
	}
	
	@Override
	public Screen windowClosingEvent(WindowEvent window) {
		return this;
	}
}
