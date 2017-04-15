//FILE: IntegerArray
//Prog: Jamie Jones
//Purpose: load, display, calc avg, and count numbers below avg

package edu.tridentech.cpt187.Jones.Program5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class IntegerArray 
{
	private int[] empData = new int[100];
	private int empCount = 0;
	private int countBelowAvg;
	private double dataTotal;
	private double	calcAvg;
	
	
	IntegerArray(){} //NOTHING IN CONSTRUCTOR
	
		public void loadArray (String fileName)
		{
			try
			{
				Scanner infile = new Scanner (new FileInputStream(fileName));
				
				while (infile.hasNext())
				{
					empData[empCount] = infile.nextInt();
					++empCount;
				}
				
				infile.close();
			} //End Try
			
			catch (IOException ex)
			{
				empCount = -1;
				ex.printStackTrace();
			} //End Catch
			
		} //END loadArray
		
		public void displayArray()
		{
			for(int index = 0; index < empCount; ++index)
				System.out.printf("Data[%d]: %d\n", index, empData[index]);
		} //END displayArray
		
		public double calcAvg()
		{
			for (int index = 0; index < empCount; ++index)
			dataTotal += empData[index];
			calcAvg = dataTotal / empCount;
			return calcAvg;
		} //END calcAvg
		
		public int countBelowAvg()
		{
			for (int index = 0; index < empCount; ++index)
			if (empData[index] < calcAvg)
			countBelowAvg += 1;
			return countBelowAvg;
		} //END countBelowAvg

} //END IntegerArray

