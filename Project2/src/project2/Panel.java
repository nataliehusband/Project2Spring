package project2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JFrame //http://chortle.ccsu.edu/java5/notes/chap56/ch56_11.html
{
	JPanel newpanel; 
	JLabel intro, productName, quantity, price, numericID, category, space; 
	String pa, qa, pra, na, ca;  
	String[] categoryOptions = {"Appliances", "TV & Home Theater", "Computers & Tablets", "Cell Phones", "Cameras & Camcorders", "Audio"
			+ "Car Electronics & GPS", "Video Games, Movies & Music", "Health, Fitness & Beauty", "Connected Home & Housewares",
			"Toys, Games & Drones", "Wearable Technology"}; 
	int quant, pri, num; 
	JTextField productAnswer = new JTextField(10); //http://www.wideskills.com/java-tutorial/java-jtextfield-class-example
	JTextField quantityAns = new JTextField(10); 
	JTextField priceAns = new JTextField(10); 
	JTextField numericAns = new JTextField(10); 
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
		intro = new JLabel("                    Product Information Sheet:                ");
		productName = new JLabel("Product Name:          "); 
		quantity = new JLabel("Quantity of Item:      ");
		price = new JLabel("Price of Item:            "); 
		numericID = new JLabel("Numeric ID of item: "); 
		category = new JLabel("Category: "); 
		space = new JLabel("                            ");
	
		add(intro); 
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
		JComboBox box = new JComboBox(categoryOptions); //https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html
		//box.setSelectedIndex();
		add(box); 
		//categoryOptions.addActionListener(categoryOptions); 
		
		add(space); 
		finished.setLocation(200, 200);
		add(finished); 
		finished.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int x, y, z; 
					pa = productAnswer.getText();
					System.out.println(pa);
				
					qa = quantityAns.getText(); 
					try
					{
						x=1; 
						quant = Integer.parseInt(qa);
					}
					catch(NumberFormatException e1)
					{
						x=0; 
						JOptionPane.showMessageDialog(null, "Change your quantity to a number!");
					}
					
					System.out.println(quant); 
					
					pra = priceAns.getText();
					try
					{
						y=1; 
						pri = Integer.parseInt(pra);
					}
					catch(NumberFormatException e1)
					{
						y=0; 
						JOptionPane.showMessageDialog(null, "Change your price to a number!");
					}
					System.out.println(pri); 
					
					na = numericAns.getText(); 
					try
					{
						z=1; 
						num = Integer.parseInt(na);
					}
					catch(NumberFormatException e2)
					{
						z=0; 
						JOptionPane.showMessageDialog(null, "Chance your Numeric ID to a number!");
					}
					System.out.println(num); 
					
					int i = box.getSelectedIndex(); 
					System.out.println(categoryOptions[i]);
					
				if(x==1 && y==1 && z==1)
				{	
					setVisible(false); 
				}
			}
		});

		setVisible(true);
	}
}
