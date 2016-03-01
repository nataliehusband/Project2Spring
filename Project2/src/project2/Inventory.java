package project2;

/*
 * Best Buy Catalog View/Add
 * 
 * 
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Inventory extends Superclass
{
	
	private int[] value = {getValue()};
	private static ArrayList arrayList = new ArrayList();
	private static PrintWriter out;
	private String[] catNames = new String[value[0]];
	
	public Inventory(String s){
		arrayList(); 
		int[] j = {0};
		//Panel.setArray(nameArray);
		for(int i = 0; i < arrayList.size()/5;i++){
			
			catNames[i]=(String) arrayList.get(j[0]);
			j[0] = j[0]+5;
			Panel.setList(catNames[i]);
			Panel.setArray(arrayList);
			//System.out.println(catNames[i]);
		}
		Panel frame = new Panel("Best Buy Catalog",s);
	}
	
	// Turns the Array given from the Superclass
	// from the 2D Array
	
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
	
	public static void setResult(String a, String b, String c, String d, String e ){
		arrayList.add(a);
		arrayList.add(b);
		arrayList.add(c);
		arrayList.add(d);
		arrayList.add(e);
		
		
	}
	
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
