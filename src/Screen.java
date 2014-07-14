import java.awt.*;
import java.awt.event.*;

/**
 * @author Mcat12
 */
public interface Screen {
    public void displayOutput(Graphics g);
    
    public Screens getScreenType();
    
    public Screen getScreen();
    
    public Screen respondToUserInput(KeyEvent key);
    
    public Screen respondToUserInputReleased(KeyEvent key);
    
    public Screen respondToUserInputHover(MouseEvent mouse);
    
    public Screen respondToUserInputClick(MouseEvent mouse);
    
    public Screen respondToUserInput(MouseWheelEvent mouse);
    
    public Screen windowClosingEvent(WindowEvent window);
}
