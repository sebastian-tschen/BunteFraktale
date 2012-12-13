package Frames;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OtherFrame implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		

		  // Erstellt das Swing-Fenster
      JFrame fenster = new JFrame("Hallo Welt mit Swing");
      // Swing anweisen, das Programm zu beenden, wenn das Fenster
      // geschlossen wird
      fenster.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   
      
      
      JPanel panel1=new JPanel();
      JButton eastButton = new JButton("Osten");
      JButton westButton = new JButton("Westen");
      JButton northButton = new JButton("Norden");
      JButton southButton = new JButton("Süden");
      JButton midButton = new JButton("Mitte");
      
      panel1.setLayout(new BorderLayout());
      panel1.add(eastButton, BorderLayout.EAST);
      panel1.add(westButton, BorderLayout.WEST);
      panel1.add(northButton, BorderLayout.NORTH);
      panel1.add(southButton, BorderLayout.SOUTH);
      panel1.add(midButton, BorderLayout.CENTER);
      fenster.getContentPane().add(panel1);

      // Zeigt das Fenster an
      fenster.setSize(300, 200);
      fenster.setBounds(300, 300, 300, 400);
      fenster.setVisible(true);
		
	}
	
	

}
