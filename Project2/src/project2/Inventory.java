package project2;

/* 
 * Best Buy Catalog 
 * Sub Class of Superclass
 * 
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;


public class Inventory extends Superclass
{
	
	/*
	 * initializes an ArrayLsit object called arrayList and a printwriter
	 * at compile.initialize array of ints called value and Strings called 
	 * catNames when instantiated.
	 */
	
	private static ArrayList arrayList;
	private static PrintWriter out;
	private int[] value = {getValue()};
	private String[] catNames;
	
	/*
	 * Blank Constructor
	 */
	public Inventory(){
		
	}
	
	/*
	 * Constructor Inventory
	 * requires a parameter of a String
	 * arrayLsit is a new ArrayList object and catNames is a new
	 * String Array with length of value[0] passed from Superclass
	 * then the method arrayList is called and a for loop is ran
	 * that resets catNames from whatever it previously may have been
	 * and sets it to the next String in the array List that is a 
	 * category name.
	 */
	
	public Inventory(String s)
	{
		arrayList = new ArrayList();
		catNames = new String[value[0]];
		arrayList(); 
		int[] j = {0};
		//Panel.setArray(nameArray);
		
		for(int i = 0; i < arrayList.size()/5;i++)
		{
			catNames[i] = "";
			catNames[i]=(String) arrayList.get(j[0]);
			j[0] = j[0]+5;
			Panel.setList(catNames[i]);
			Panel.setArray(arrayList);
			//System.out.println(i);
			//System.out.println(catNames[i]);
		}
		Panel frame = new Panel("Best Buy Catalog",s);
	}
	
	
	/* Method arrayList
	 * takes the 2 Dimensional
	 * from Superclass and puts every String in to 
	 * an Array List.
	 */

	
	private void arrayList()
	{
		for(int i = 0;i<value[0];i++)
		{
			for(int j = 0;j<SUBJECTS;j++)
			{
				arrayList.add(nameArray[i][j]);
			}
		}
		/*for (String e : arrayList)
	      {
	         System.out.println(e);
	      }
	      */
	}
	
	/* Method setResult  
	 * Needs 5 strings, when called, it adds each
	 * String to the array list in order.
	 */
	
	public static void setResult(String a, String b, String c, String d, String e ){
		arrayList.add(a);
		arrayList.add(b);
		arrayList.add(c);
		arrayList.add(d);
		arrayList.add(e);
		
		
	}
	
	/* 
	 * A method where PrintWriter is created that prints to the file that was read
	 * earlier in the program. then it read the Array List and prints
	 * each entry in to the file. Then the PrintWriter closes.
	 */
	
	
	public static void printResult(){
		try {
			out = new PrintWriter(file);
			
		} catch (FileNotFoundException e1) {
			System.out.println("File not Available");
		}
		for (Object e: arrayList){
			
			out.println(e);
		}
		out.close();
	}
	/*public String[] getProductName(){
		return(Names);
	}*/

	
	
	
}
