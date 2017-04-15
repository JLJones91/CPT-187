//FILE : Payroll.java
//PROG : Dave Jones
//PURP : Class for a payroll program. Only the employee array is programmed.
package edu.jones.acmepayroll;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Payroll 
{
	private int[] empNums = new int[1000];
	private int empCount = 0;
	
	Payroll(){}	//Currently nothing done in constructor
	
	public void loadEmpNums(String filename)
	{
		String lastName, firstName;
		char midInit;
		double salary;
		empCount = 0;		//Just to make sure!
		
		try
		{
			Scanner infile = new Scanner (new FileInputStream(filename));
			
			while (infile.hasNext())
			{
				//Read a complete record
				empNums[empCount] = infile.nextInt();
				lastName = infile.next();
				firstName = infile.next();
				midInit = infile.next().charAt(0);
				salary = infile.nextDouble();
				
				//Increment the count of elements
				++empCount;
			}
			
			infile.close();
		}
		catch (IOException ex)
		{
			//If file has problems, set the count to -1
			empCount = -1;
			ex.printStackTrace();
		}
	}//END loadEmpNums

	public int getEmpCount()
	{
		return empCount;
	}
	
	public int getOneEmpNum(int index)
	{
		if (index >= 0 && index < empCount)
			return empNums[index];
		else
			return -1;
	}
}//END class Payroll
