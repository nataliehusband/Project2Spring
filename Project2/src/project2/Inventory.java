package project2;

import java.util.*;

public class Inventory extends Superclass
{
	private String[][] nameArray = getArray();
	private int[] value = {getValue()};
	private List<String> arrayList;
	
	public Inventory(){
		Panel frame = new Panel("Hello"); 
		
	}
	
	// Turns the Array given from the Superclass
	// from the 2D Array
	
	public void arrayList(){
		for(int i = 0;i<value[0];i++){
			for(int j = 0;j<SUBJECTS;j++){
				arrayList.add(nameArray[i][j]);
			}
		}
		for (String e : arrayList)
	      {
	         System.out.println(e);
	      }
	}
}
