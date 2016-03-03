package project2;

/* Best Buy Catalog 
 * Super Class of Inventory
 * 
 * 
 * 
 */
import java.io.*;
import java.util.*;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Superclass
{
	// Initilaize some variables and objects 
	// File, Scanner, an int Subjects which is final
	// a String with 1 index that is declared as 0,
	// a 2D array and a String.
	
	protected static File file;
	private static Scanner in;
	public final int SUBJECTS = 5;
	private int[] value = {0};
	protected String[][] nameArray;
	private String g;
	
	// Constructor that calls initialize method 
	// and sets file to the File found in main.
	
	public Superclass()
	{
		file = mainClass.GetFile();
		Initialize();
		
	}
	
	/*
	 * Method Initialize that reads from a file and sets all the information
	 * in to a 2 dimensional array
	 */
	
	public void Initialize()
	{
		
		try 
		{
			in = new Scanner(file);
		} 
		catch (FileNotFoundException e) 
		{
			
		}
		//value[0] = 0;
		while(in.hasNextLine())
		{
			value[0] = value[0]+1;
			g=in.nextLine();
			//System.out.println(value[0]);
		}
		
		value[0] = value[0]/5;
		nameArray = new String[value[0]][SUBJECTS];
		
		try 
		{
			in = new Scanner(file);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		for(int i = 0;i<value[0];i++)
		{
			for(int j = 0;j<SUBJECTS;j++)
			{
				String q = in.nextLine();
				q.trim();
				nameArray[i][j] = q;
				//System.out.print(nameArray[i][j] + "  ");
			}
			//System.out.println("");
		}
	}
	
	/*
	 * method get Value that returns the value of value[0] that is found in the 
	 * Initialize class.
	 */
	
	public int getValue()
	{
		return value[0];
	}
	
	
	
}
