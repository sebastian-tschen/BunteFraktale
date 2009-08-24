import javax.swing.SwingUtilities;

import Frames.MainFrame;
import Frames.OtherFrame;
import Frames.Tabber;


public class BunteFraktale {

	/**
	 * @param args 
	 * 
	 * 
	 * 
	 * subclipse: http://subclipse.tigris.org/update_1.6.x
	 */
	public static void main(String[] args) {
		
		
		
		SwingUtilities.invokeLater(new MainFrame());
		SwingUtilities.invokeLater(new OtherFrame());
		SwingUtilities.invokeLater(new Tabber());
		
		
	}

}
