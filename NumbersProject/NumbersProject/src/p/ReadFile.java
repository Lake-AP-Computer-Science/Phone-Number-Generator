package p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class ReadFile 
{
	
	public static ArrayList<String>getList() throws Exception
	{
		ArrayList<String>list = new ArrayList<String>();
		
		FileReader fstream = new FileReader("AllWords.txt");
		BufferedReader in = new BufferedReader(fstream);
		
		String value = ""; 
		while( value != null)
		{
		    value = in.readLine();
		    if(value != null)
		    {
		    	list.add(value);
		    }
		}
		
		in.close();
		
		return list;
	}
}