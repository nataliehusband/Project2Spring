package project2;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class mainClass 
{		
	private static File curFile;
	Inventory inventory = new Inventory();
	/*static Panel frame = new Panel("Hello"); 
	static Superclass start = new Superclass();
	 */
	public static void main(String[] args) throws IOException 
	{
		JFileChooser choose = new JFileChooser();
		File f = new File(new File("Catalog.txt").getCanonicalPath());
	    choose.setSelectedFile(f);
	    choose.showOpenDialog(null);
	    curFile = choose.getSelectedFile();
		while(curFile == null){
			
		}
		Inventory inventory1 = new Inventory();
		
		
		//Inventory inventory1 = new Inventory();
		//JOptionPane.showMessageDialog(null, "Welcome to this program!");
		
		
	}
	
	public static File GetFile(){
		return curFile;
	}
	
	}
