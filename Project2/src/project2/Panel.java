package project2;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JFrame //http://chortle.ccsu.edu/java5/notes/chap56/ch56_11.html
{
	JPanel newpanel; 
	JLabel productName; 
	JLabel quantity; 
	JLabel price; 
	JLabel numericID; 
	JLabel category; 
	JTextField blah = new JTextField(10); //http://www.wideskills.com/java-tutorial/java-jtextfield-class-example
	
	//constructor
	Panel(String title)
	{
		super(title); 
		setSize(600, 600); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container myContentPane = getContentPane();
	    myContentPane.setLayout(null);
		setLocationRelativeTo(null); 
		
		//initializes all of the JLabels 
		productName = new JLabel("Store Product Name: "); 
		quantity = new JLabel("Quantity of Item: ");
		price = new JLabel("Price of Item: "); 
		numericID = new JLabel("Numeric ID of item: "); 
		category = new JLabel("Category: "); 
		
		//adds all of the JLabels to the frame
		blah.setLocation(200,5);
		blah.setSize(100,20);
		add(blah);	
		
		
		

	
		
		
		setVisible(true);
	}
}
