package project2;

/* Best Buy Catalog 
 * Main Class
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mainClass 
{		
	/*
	 * Initialize 3 JButtons and a File object at compile
	 */
	private static File curFile;
	private static JButton view;
	private static JButton add;
	private static JButton exit;
	
	/*
	 * Main class that runs at compile
	 * run method is called
	 */
	
	public static void main(String[] args) throws IOException 
	{
		run();
	}
	
	/*
	 * Method run that declares a new JFrame, JPanel, the 3 buttons, an ImageIcon and a Jlabel.
	 * the jlabel is set to an image and the window its initialized. Then all of the buttons ]
	 * and labels are added to the windows and set sizes and colors. Then depending on what 
	 * button is pushed a different version of the class Panel is called. and if exit is 
	 * pressed the system closes.
	 */

	public static void run()
	{
	JPanel mainCard = new JPanel(new BorderLayout(8, 8));
	view = new JButton("View Inventory");
	add = new JButton("Add Product");
	exit = new JButton("Exit");
	
	
	ImageIcon image = new ImageIcon("logo.jpg");
	JLabel label = new JLabel();
	label.setIcon(image);
	
	JFrame window = new JFrame("Best Buy");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.getContentPane().add(mainCard);
	window.setSize(1000, 400);
	window.setLocationRelativeTo(null);
	
	
	mainCard.setBackground(Color.decode("#133048"));
	view.setBackground(Color.decode("#fff200"));
	view.setOpaque(true);
	view.setBorderPainted(false);
	view.setFont(new Font("TimesRoman", Font.BOLD, 30));
	add.setBackground(Color.decode("#fff200"));
	add.setOpaque(true);
	add.setBorderPainted(false);
	add.setFont(new Font("TimesRoman", Font.BOLD, 30));
	add.setPreferredSize(new Dimension(240, 50));
	exit.setFont(new Font("TimesRoman", Font.BOLD, 36));
	exit.setBackground(Color.decode("#fff200"));
	exit.setOpaque(true);
	exit.setBorderPainted(false);
	exit.setPreferredSize(new Dimension(1,100));
	
	view.addActionListener(new ActionListener()
	{ 
			public void actionPerformed(ActionEvent e)
		{
			JFileChooser choose = new JFileChooser();
			File f = null;
			try {
				f = new File(new File("Catalog.txt").getCanonicalPath());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		    choose.setSelectedFile(f);
		    choose.showOpenDialog(null);
		    curFile = choose.getSelectedFile();
			while(curFile == null){
				
			}
			window.dispose();
			Inventory inventory = new Inventory("view");
		}
	}
	);
	
	add.addActionListener(new ActionListener()
	{ 
			public void actionPerformed(ActionEvent e)
		{
			JFileChooser choose = new JFileChooser();
			File f = null;
			try {
				f = new File(new File("Catalog.txt").getCanonicalPath());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		    choose.setSelectedFile(f);
		    choose.showOpenDialog(null);
		    curFile = choose.getSelectedFile();
			while(curFile == null){
				
			}
			window.dispose();
			Inventory inventory = new Inventory("add");
		}
	}
	);
	
	exit.addActionListener(new ActionListener()
	{ 
			public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	);
	
	mainCard.add(label, BorderLayout.LINE_START);		
	mainCard.add(view, BorderLayout.CENTER);
	mainCard.add(add, BorderLayout.LINE_END);
	mainCard.add(exit, BorderLayout.PAGE_END);
	
	
	window.setVisible(true);
	
	
	// Returns the current file that is called in the File
	}
	
	public static File GetFile(){
		return curFile;
	}
	
	}
