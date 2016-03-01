package project2;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.*;
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
	JLabel[] label = new JLabel[7]; 
	String[] string = 
		{
		"                                      Product Information Sheet:                           ",
		"       Product Name:                  ",
		"       Quantity of Item:             #",
		"       Price of Item:                  $",
		"       Numeric ID of item:         #",
		"       Category:                          ",
		"             "
		};
	FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 25);
	String pa, qa, pra, na, ca;  
	String[] categoryOptions = 
		{
		"Appliances",
		"TV & Home Theater",
		"Computers & Tablets",
		"Cell Phones",
		"Cameras & Camcorders",
		"Audio, Car Electronics, & GPS",
		"Video Games, Movies & Music", 
		"Health, Fitness & Beauty", 
		"Connected Home & Housewares                        ",
		"Toys, Games & Drones",
		"Wearable Technology"}; 
	//String[] nameOptions = Inventory.getNames();
	int quant, pri, num; 
	JTextField[] Answer = new JTextField[5];
	JButton finished = new JButton("Add"); 
	JButton Exit = new JButton("Exit");
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
		setSize(600, 500); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		getContentPane().setBackground(Color.decode("#003b64"));
		setLayout(layout);
		
		//initializes all of the JLabels
		
		for(int i = 0; i<string.length; i++){
			label[i] = new JLabel(string[i]);
			label[i].setFont(new Font("TimesRoman", Font.PLAIN, 18));
		}
		for(int i = 0; i<Answer.length;i++){
			Answer[i] = new JTextField(20);
			Answer[i].setFont(new Font("TimesRoman", Font.PLAIN, 18)); 
		}
		
	
		add(label[0]); 
		label[0].setForeground(Color.WHITE);
		add(label[1]);
		label[1].setForeground(Color.WHITE);
		
		String names[]=list.toArray(new String[list.size()]);
		JComboBox box1 = new JComboBox(names);
		
		if(command == "add"){
			Answer[0].setSize(100,20);
			Answer[0].setBackground(Color.decode("#FFF200"));
			add(Answer[0]);	
		}
		if(command == "view")
		{

			
			box1.setSize(100,20);
			box1.setBackground(Color.decode("#FFF200"));
			add(box1); 
			Answer[1].setEditable(false);
			Answer[2].setEditable(false);
			Answer[3].setEditable(false);
			box.setEditable(false);

			
			

		}
		
		
		
		add(label[2]); 
		label[2].setForeground(Color.WHITE);
		Answer[1].setSize(100, 20);
		Answer[1].setBackground(Color.decode("#FFF200"));
		add(Answer[1]);
		
		add(label[3]);
		label[3].setForeground(Color.WHITE);
		Answer[2].setSize(100, 20);
		Answer[2].setBackground(Color.decode("#FFF200"));
		add(Answer[2]); 
		
		add(label[4]); 
		label[4].setForeground(Color.WHITE);
		Answer[3].setSize(100, 20);
		Answer[3].setBackground(Color.decode("#FFF200"));
		add(Answer[3]); 
		
		add(label[5]);
		label[5].setForeground(Color.WHITE);
		
		if(command == "add"){
		//box.setSelectedIndex();
		box.setBackground(Color.decode("#FFF200"));
		add(box); 
		//categoryOptions.addActionListener(categoryOptions); 
		}
		if(command == "view"){
			Answer[4].setBackground(Color.decode("#FFF200"));
			Answer[4].setEditable(false);
			Answer[4].setSize(100,20);
			add(Answer[4]);
		}
		
		add(label[6]);  
		if(command == "view"){
			finished.setText("View");
		}
		finished.setBackground(Color.decode("#FFF200"));
		finished.setPreferredSize(new Dimension(200,75));
		finished.setFont(new Font("TimesRoman", Font.BOLD, 36));
		add(finished); 
		finished.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if(command == "add"){
							int x, y, z; 
							pa = Answer[0].getText();
							//System.out.println(pa);
						
							qa = Answer[1].getText(); 
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
							
							pra = Answer[2].getText();
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
							
							na = Answer[3].getText(); 
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
								endValues[0] = Answer[0].getText();
								endValues[1] = Answer[1].getText();
								endValues[2] = Answer[2].getText();
								endValues[3] = Answer[3].getText();
								int i = box.getSelectedIndex();
								endValues[4] = categoryOptions[i];
								Inventory.setResult(endValues[0], endValues[1], endValues[2], endValues[3], endValues[4] );
								Inventory.printResult();
								for(int j = 0; j<Answer.length;j++){
									Answer[j].setText("");
								}
							}
						}
						if(command == "view")
						{
							
							Answer[1].setText((String) prodName.get(box1.getSelectedIndex()*5+1));
							Answer[2].setText((String) prodName.get(box1.getSelectedIndex()*5+2));
							Answer[3].setText((String) prodName.get(box1.getSelectedIndex()*5+3));
							Answer[4].setText((String) prodName.get(box1.getSelectedIndex()*5+4));
							
							
						}
					}
				}
		);
		
		Exit.setBackground(Color.decode("#FFF200"));
		Exit.setPreferredSize(new Dimension(200,75));
		Exit.setFont(new Font("TimesRoman", Font.BOLD, 36));
		add(Exit);
		Exit.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					System.exit(9);
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