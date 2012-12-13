package Frames;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class Tabber implements Runnable {

	public void run() {

		JFrame fenster = new JFrame("Ihr JFrame");
		fenster.setSize(500, 500);
		fenster.setLocationRelativeTo(null);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTabbedPane tabLeiste = new JTabbedPane();
		JPanel panel = new JPanel();
		panel.add(new JButton("Button des ersten Tabs"));
		tabLeiste.addTab("Tab1", panel);

		JPanel panel2 = new JPanel();
		panel2.add(new JButton("Button des zweiten Tabs"));
		tabLeiste.addTab("Tab2", panel2);

		fenster.add(tabLeiste);


		fenster.setVisible(true);

	}
}
