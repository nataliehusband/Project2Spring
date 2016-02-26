package project2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Inventory extends Superclass
{
	private String[][] nameArray = getArray();
	private int[] value = {getValue()};
	private static List<String> arrayList = new ArrayList();
	private static Panel frame = new Panel("BEST BUY CATALOG SHEET");
	private static PrintWriter out;
	
	public Inventory(){
		arrayList(); 
	}
	
	// Turns the Array given from the Superclass
	// from the 2D Array
	//003b64
	private void arrayList(){
		for(int i = 0;i<value[0];i++){
			for(int j = 0;j<SUBJECTS;j++){
				arrayList.add(nameArray[i][j]);
			}
		}
		/*for (String e : arrayList)
	      {
	         System.out.println(e);
	      }
	      */
	}
	
	public static void addResult(){
		arrayList.add(frame.getName());
		arrayList.add(frame.getQuantity());
		arrayList.add(frame.getPrice());
		arrayList.add(frame.getID());
		arrayList.add(frame.getCat());
		for (String e : arrayList)
	      {
	         //System.out.println(e);
	      }
		
	}
	
	public static void printResult(){
		try {
			out = new PrintWriter(file);
			
		} catch (FileNotFoundException e1) {
			System.out.println("File not Available");
		}
		for (String e: arrayList){
			
			out.println(e);
		}
		out.close();
	}
}
