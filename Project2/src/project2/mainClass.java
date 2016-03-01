package project2;

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
	private static File curFile;
	//Inventory inventory = new Inventory();
	/*static Panel frame = new Panel("Hello"); 
	static Superclass start = new Superclass();
	 */
	
	private static JButton view;

	private static JButton add;

	private static JButton exit;
	
	public static void main(String[] args) throws IOException 
	{
		run();
	}
		public static void run(){
		JFrame frame = new JFrame();
		
		JPanel mainCard = new JPanel(new BorderLayout(8, 8));
		view = new JButton("View");
		add = new JButton("Add");
		exit = new JButton("Exit");
		frame.add(mainCard);
		
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
		view.setFont(new Font("TimesRoman", Font.BOLD, 36));
		add.setBackground(Color.decode("#fff200"));
		add.setFont(new Font("TimesRoman", Font.BOLD, 36));
		add.setPreferredSize(new Dimension(240, 50));
		exit.setFont(new Font("TimesRoman", Font.BOLD, 36));
		exit.setBackground(Color.decode("#fff200"));
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
		
		/*JFileChooser choose = new JFileChooser();
		File f = new File(new File("Catalog.txt").getCanonicalPath());
	    choose.setSelectedFile(f);
	    choose.showOpenDialog(null);
	    curFile = choose.getSelectedFile();
		while(curFile == null){
			
		}
		Inventory inventory = new Inventory("view");
		
		*/
		//Inventory inventory1 = new Inventory();
		//JOptionPane.showMessageDialog(null, "Welcome to this program!");
		
		
	}
	
	public static File GetFile(){
		return curFile;
	}
	
	}
