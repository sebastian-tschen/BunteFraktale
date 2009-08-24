package Frames;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame implements Runnable{

	@Override
	public void run() {

		  // Erstellt das Swing-Fenster
        JFrame fenster = new JFrame("Hallo Welt mit Swing");
        // Swing anweisen, das Programm zu beenden, wenn das Fenster
        // geschlossen wird
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Fügt den "Hallo Welt"-Text hinzu
        JLabel label = new JLabel("Hallo Welt");
        fenster.getContentPane().add(label);

        // Zeigt das Fenster an
        fenster.setSize(300, 200);
        fenster.setVisible(true);

		
	}

}
