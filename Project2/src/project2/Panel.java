package project2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

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
	String[] endValues = new String[5];
	ImageIcon icon = new ImageIcon("error.jpg"); 
	Image newImg = icon.getImage(); 
	Image img = newImg.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); 	
	ImageIcon newIcon = new ImageIcon(img); 

	/*Image img = icon.getImage();
	BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
	Graphics g = bi.createGraphics(); 
	g.drawImage(img, 100, 100, WIDTH, HEIGHT, null); 
	ImageIcon newIcon = new ImageIcon(bi); */
	
	UIManager UI = new UIManager(); 
	
	//constructor
	Panel(String title)
	{
		super(title); 
		setSize(350, 400); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		getContentPane().setBackground(Color.decode("#003B64"));
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 25));
		
		//initializes all of the JLabels 
		intro = new JLabel("                    Product Information Sheet:                ");
		productName = new JLabel("Product Name:          "); 
		quantity = new JLabel("Quantity of Item:      ");
		price = new JLabel("Price of Item:          $"); 
		numericID = new JLabel("Numeric ID of item:  "); 
		category = new JLabel("Category: "); 
		space = new JLabel("                            ");
		
	
		add(intro); 
		intro.setForeground(Color.WHITE);
		add(productName);
		productName.setForeground(Color.WHITE);
		productAnswer.setSize(100,20);
		productAnswer.setBackground(Color.decode("#FFF200"));
		add(productAnswer);	
		
		add(quantity); 
		quantity.setForeground(Color.WHITE);
		quantityAns.setSize(100, 20);
		quantityAns.setBackground(Color.decode("#FFF200"));
		add(quantityAns);
		
		add(price);
		price.setForeground(Color.WHITE);
		priceAns.setSize(100, 20);
		priceAns.setBackground(Color.decode("#FFF200"));
		add(priceAns); 
		
		add(numericID); 
		numericID.setForeground(Color.WHITE);
		numericAns.setSize(100, 20);
		numericAns.setBackground(Color.decode("#FFF200"));
		add(numericAns); 
		
		
		add(category);
		category.setForeground(Color.WHITE);
		JComboBox box = new JComboBox(categoryOptions); //https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html
		//box.setSelectedIndex();
		box.setBackground(Color.decode("#FFF200"));
		add(box); 
		//categoryOptions.addActionListener(categoryOptions); 
		
		add(space);  
		
		finished.setBackground(Color.decode("#FFF200"));
		finished.setLocation(200, 200);
		add(finished); 
		finished.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int x, y, z; 
				pa = productAnswer.getText();
				//System.out.println(pa);
					
				qa = quantityAns.getText(); 
				try
				{
					x=1; 
					quant = Integer.parseInt(qa);
				}
				catch(NumberFormatException e1)
				{
					x=0; 
					UI.put("OptionPane.background", Color.red); //http://stackoverflow.com/questions/9064943/how-to-change-background-color-of-joptionpane
					JOptionPane.showMessageDialog(null, "Change your quantity to a number!     ", title, JOptionPane.INFORMATION_MESSAGE, newIcon); 
					//http://stackoverflow.com/questions/6975736/java-joptionpane-showmessagedialog-custom-icon-problem
				}
						
				//System.out.println(quant); 
						
				pra = priceAns.getText();
				try
				{
					y=1; 
					pri = Integer.parseInt(pra);
				}
				catch(NumberFormatException e1)
				{
					y=0; 
					UI.put("OptionPane.background", Color.red);
					JOptionPane.showMessageDialog(null, "Change your price to a number!     ", title, JOptionPane.INFORMATION_MESSAGE, newIcon);
				}
				//System.out.println(pri); 
						
				na = numericAns.getText(); 
				try
				{
					z=1; 
					num = Integer.parseInt(na);
				}
				catch(NumberFormatException e2)
				{
					z=0; 
					UI.put("OptionPane.background", Color.red);
					JOptionPane.showMessageDialog(null, "Chance your Numeric ID to a number!     ", title, JOptionPane.INFORMATION_MESSAGE, newIcon);
				}
				//System.out.println(num); 
							
				if(x==1 && y==1 && z==1)
				{	
					endValues[0] = productAnswer.getText();
					endValues[1] = quantityAns.getText();
					endValues[2] = priceAns.getText();
					endValues[3] = numericAns.getText();
					int i = box.getSelectedIndex();
					endValues[4] = categoryOptions[i];
					Inventory.addResult();
					Inventory.printResult();
					setVisible(false); 
				}
			}
		});
		setVisible(true);
	}
	
	
	public String getName()
	{
		return(endValues[0]);
	}
	public String getQuantity()
	{
		return(endValues[1]);
	}
	public String getPrice()
	{
		return(endValues[2]);
	}
	public String getID()
	{
		return(endValues[3]);
	}
	public String getCat()
	{
		return(endValues[4]);
	}
}
