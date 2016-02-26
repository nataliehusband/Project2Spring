package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Superclass 
{
	private static File file = new File("Catalog");
	private static Scanner in;
	private final int SUBJECTS = 5;
	private int[] value = {0};
	private String[][] nameArray;
	
	public Superclass()
	{
		try 
		{
			in = new Scanner(file);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		String g;
		while(in.hasNextLine())
		{
			value[0] = value[0]+1;
			g=in.nextLine();
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
				System.out.print(nameArray[i][j] + "  ");
			}
			System.out.println("");
		}
		
	}
	
	public String[][] getArray()
	{
		
		return nameArray;
	}
	
	public int getValue()
	{
		return value[0];
	}
}
