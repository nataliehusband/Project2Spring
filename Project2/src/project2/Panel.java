package project2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
	JTextField productAnswer = new JTextField(10); //http://www.wideskills.com/java-tutorial/java-jtextfield-class-example
	JTextField quantityAns = new JTextField(10); 
	JTextField priceAns = new JTextField(10); 
	JTextField numericAns = new JTextField(10); 
	JTextField categoryAns = new JTextField(10); 
	JButton finished = new JButton("Okay"); 
	
	//constructor
	Panel(String title)
	{
		super(title); 
		setSize(350, 400); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 25));
		
		//initializes all of the JLabels 
		productName = new JLabel("Product Name:        "); 
		quantity = new JLabel("Quantity of Item:     ");
		price = new JLabel("Price of Item:           "); 
		numericID = new JLabel("Numeric ID of item:"); 
		category = new JLabel("Category:                  "); 
	
		add(productName);
		productAnswer.setSize(100,20);
		add(productAnswer);	
		
		add(quantity); 
		quantityAns.setSize(100, 20);
		add(quantityAns);
		
		add(price);
		priceAns.setSize(100, 20);
		add(priceAns); 
		
		add(numericID); 
		numericAns.setSize(100, 20);
		add(numericAns); 
		
		add(category);
		categoryAns.setSize(100, 20);
		add(categoryAns); 
		
		finished.setLocation(200, 200);
		add(finished); 
		finished.addActionListener(null);

		setVisible(true);
	}
	
	public void ActionPerformed(ActionEvent e)
	{
		
	}
}
