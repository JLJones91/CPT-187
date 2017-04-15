//FILE : MainClass.java
//PROG : Dave Jones - CPT 187
//PURP : Demo reading a file of sales values to accumulate total sales
//     : Uses file employeeSales.dat
package edu.jones.fileinput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
		String salesID;
		double salesIn;
		double totalSales = 0.0;
		
		try
		{
			String filename = "employeeSales.dat";
			Scanner infile = new Scanner(new FileInputStream(filename));
			
		
			while (infile.hasNext())
			{
				salesID = infile.next();
				salesIn = infile.nextDouble();
				totalSales += salesIn;
				
				//System.out.printf ("Employee #%s sold $%.2f\n", salesID, salesIn);
			}
			
			//Close the file
			infile.close();
			
			System.out.printf("The total sales for the company is $%.2f.\n", totalSales);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
			//System.out.printf("Exception message: %s", ex.getMessage());
		}
	}
}//END MainClass
