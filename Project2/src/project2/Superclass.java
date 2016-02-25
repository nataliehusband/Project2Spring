package project2;

import java.io.*;
import java.util.*;

public class Superclass
{
	private static File file = new File("Catalog");
	private static Scanner in;
	private final int SUBJECTS = 5;
	private int value;
	private String[][] nameArray;
	
	public Superclass(){
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		value = 1;
		nameArray = new String[value][SUBJECTS];
		while(in.hasNextLine()){
			for(int i = 0;i<value;i++){
				for(int j = 0;j<SUBJECTS;j++){
					String q = in.nextLine();
					q.trim();
					nameArray[i][j] = q;
					System.out.print(nameArray[i][j] + "  ");
				}
				System.out.println("");
			}
		}
	}
}
