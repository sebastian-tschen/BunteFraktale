package view;

import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener{
	
	private JMenuBar menu;
	private JButton eins;
	private JButton zwei;
	private JButton stop;
	
	public MainFrame(String titel){
		super(titel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		createMenu();
		setJMenuBar(menu);
		createButtons();
	}
	
	public static void main(String[] args){
		MainFrame test = new MainFrame("Test");
		test.setVisible(true);
	}
	
	private void createMenu(){
		JMenu fileMenu = new JMenu("Datei");
        fileMenu.add("Open");
        fileMenu.add("Save");
        fileMenu.addSeparator();
        fileMenu.add("Exit");
        menu = new JMenuBar();
        menu.add(fileMenu);
	}
	
	private void createButtons(){
		
	}

}

