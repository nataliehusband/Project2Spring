package project2;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JFrame //http://chortle.ccsu.edu/java5/notes/chap56/ch56_11.html
{
	JPanel newpanel; 
	JLabel newlabel; 
	
	//constructor
	Panel(String title)
	{
		super(title); 
		setSize(600, 600); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		
		setLayout( new FlowLayout() ); 
		newlabel = new JLabel("Welcome to Swing"); 
		add(newlabel); 	
	}
}
