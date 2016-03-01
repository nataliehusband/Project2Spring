package project2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
	//String[] nameOptions = Inventory.getNames();
	int quant, pri, num; 
	JTextField productAnswer = new JTextField(10); //http://www.wideskills.com/java-tutorial/java-jtextfield-class-example
	JTextField quantityAns = new JTextField(10); 
	JTextField priceAns = new JTextField(10); 
	JTextField numericAns = new JTextField(10); 
	JTextField categoryAns = new JTextField(10);
	JButton finished = new JButton("Okay"); 
	String[] endValues = new String[5];
	protected static ArrayList<String> list=new ArrayList<String>(); // FRom stackoverFlow
	protected static String[][] catalogArray;
	JComboBox box = new JComboBox(categoryOptions); //https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html
	static String command;
	static ArrayList prodName;
	//private List prodName = (List)Inventory.getList();
	
	//constructor
	Panel(String title, String com)
	{
		
		super(title); 
		String command = com;
		setSize(350, 400); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		getContentPane().setBackground(Color.decode("#003b64"));
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 25));
		
		
		//initializes all of the JLabels 
		intro = new JLabel("                    Product Information Sheet:                ");
		productName = new JLabel("Product Name:          "); 
		quantity = new JLabel("Quantity of Item:      ");
		price = new JLabel("Price of Item:           $"); 
		numericID = new JLabel("Numeric ID of item: "); 
		category = new JLabel("Category: "); 
		space = new JLabel("                            ");
		
	
		add(intro); 
		intro.setForeground(Color.WHITE);
		add(productName);
		productName.setForeground(Color.WHITE);
		
		String names[]=list.toArray(new String[list.size()]);
		JComboBox box1 = new JComboBox(names);
		
		if(command == "add"){
			productAnswer.setSize(100,20);
			productAnswer.setBackground(Color.decode("#FFF200"));
			add(productAnswer);	
		}
		if(command == "view")
		{

			
			box1.setSize(100,20);
			box1.setBackground(Color.decode("#FFF200"));
			add(box1); 
			quantityAns.setEditable(false);
			priceAns.setEditable(false);
			numericAns.setEditable(false);
			box.setEditable(false);

			
			

		}
		
		
		
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
		
		if(command == "add"){
		//box.setSelectedIndex();
		box.setBackground(Color.decode("#FFF200"));
		add(box); 
		//categoryOptions.addActionListener(categoryOptions); 
		}
		if(command == "view"){
			categoryAns.setBackground(Color.decode("#FFF200"));
			categoryAns.setEditable(false);
			categoryAns.setSize(100,20);
			add(categoryAns);
		}
		
		add(space);  
		
		finished.setBackground(Color.decode("#FFF200"));
		finished.setLocation(200, 200);
		add(finished); 
		finished.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if(command == "add"){
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
								JOptionPane.showMessageDialog(null, "Change your quantity to a number!");
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
								JOptionPane.showMessageDialog(null, "Change your price to a number!");
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
								JOptionPane.showMessageDialog(null, "Chance your Numeric ID to a number!");
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
								Inventory.setResult(endValues[0], endValues[1], endValues[2], endValues[3], endValues[4] );
								Inventory.printResult();
								setVisible(false); 
							}
						}
						if(command == "view")
						{
							
							quantityAns.setText((String) prodName.get(box1.getSelectedIndex()*5+1));
							priceAns.setText((String) prodName.get(box1.getSelectedIndex()*5+2));
							numericAns.setText((String) prodName.get(box1.getSelectedIndex()*5+3));
							categoryAns.setText((String) prodName.get(box1.getSelectedIndex()*5+4));
							
							
						}
					}
				}
		);

		setVisible(true);
	}
	
	
	public String getName(){
		return(endValues[0]);
	}
	public String getQuantity(){
		return(endValues[1]);
	}
	public String getPrice(){
		return(endValues[2]);
	}
	public String getID(){
		return(endValues[3]);
	}
	public String getCat(){
		return(endValues[4]);
	}
	
	public static void setList(String s){
		list.add(s);
	}
	
	public static void setArray(ArrayList arrayList){
		prodName = arrayList;
		System.out.println();
	}
}