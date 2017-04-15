//File: OrdersProcessed.java
//Programmer: Jamie Jones
//Purpose: Create a new file to store Part Num, Quantity, and Total Price of parts. 
package edu.tridenttech.cpt187.jones.program7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OrdersProcessed 
{
	private String outPut;
	public OrdersProcessed(String outPutFile)
	{
		 outPut = outPutFile;
	}//END Constructor
	
	public void saveOneRecord(int partNum, int quantity, double totalCost) 
	{
		try
		{
			PrintWriter myPW = new PrintWriter(new FileWriter(outPut, true));
			myPW.printf("%d %d %.2f\n",partNum, quantity, totalCost);
			myPW.close();
		}//END try
		catch(IOException ex)
		{
			ex.printStackTrace();
		}//END catch
		
	}// END saveOneRecord
}//END OrdersProcessed
