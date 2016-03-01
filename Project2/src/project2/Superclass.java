package project2;

import java.io.*;
import java.util.*;

public class Superclass
{
	protected static File file = mainClass.GetFile();
	private static Scanner in;
	public final int SUBJECTS = 5;
	private int[] value = {0};
	protected String[][] nameArray;
	private String g;
	
	public Superclass(){
		
		Initialize();
		
	}
	
	
	 
	public void Initialize()
	{
		
		try 
		{
			in = new Scanner(file);
		} 
		catch (FileNotFoundException e) 
		{
			
		}
		
		while(in.hasNextLine()){
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
		
		for(int i = 0;i<value[0];i++){
			for(int j = 0;j<SUBJECTS;j++){
				String q = in.nextLine();
				q.trim();
				nameArray[i][j] = q;
				//System.out.print(nameArray[i][j] + "  ");
			}
			//System.out.println("");
		}
	}
	

	
	
	public int getValue(){
		return value[0];
	}
	
	
	
}
