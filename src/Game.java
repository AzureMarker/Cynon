import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

/**
 * @author Mcat12
 */
public class Game extends JFrame implements KeyListener, MouseListener, MouseMotionListener, MouseWheelListener, WindowListener {
	private static final long serialVersionUID = 3935942281452509181L;
	
	// Double Buffering
    Image dbImage;
    Graphics dbg;
	
    // Screen Size
    int GWIDTH = 400, GHEIGHT = 300;
    Dimension screenSize = new Dimension(GWIDTH, GHEIGHT);
    
	// Game
	@SuppressWarnings("unused")
	private static Game game;
    static Screen screen;
    Screens screens;
	
    /**
     * Game Constructor
     */
    public Game() {
    	this.setTitle("Game");
        this.setSize(screenSize);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addWindowListener(this);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addMouseWheelListener(this);
        this.setVisible(true);
        screen = new MainMenu(screenSize);
    }
    
    /**
     * Program Entrance
     * @param args
     */
	public static void main(String[] args) {
		game = new Game();
	}
	
	/**
	 * Double Buffers window
	 */
	@Override
    public void paint(Graphics g) {
        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();
        draw(dbg);
        g.drawImage(dbImage, 0, 0, this);
    }
    
	/**
	 * Draws the current screen
	 * @param g
	 */
    public void draw(Graphics g) {
        super.paint(g);
        if(screen != null)
        	screen.displayOutput(g);
        repaint();
    }
	
	@Override
	public void keyPressed(KeyEvent key) {
		screen = screen.respondToUserInput(key);
	}
	
	@Override
	public void keyReleased(KeyEvent key) {
		screen = screen.respondToUserInputReleased(key);
	}
	
	@Override
	public void mousePressed(MouseEvent mouse) {
		screen = screen.respondToUserInputClick(mouse);
	}
	
	@Override
	public void mouseMoved(MouseEvent mouse) {
		screen = screen.respondToUserInputHover(mouse);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {}
	@Override
	public void mouseDragged(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
}
