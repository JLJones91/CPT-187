//FILENAME : InventoryData.java
//PROG : Jamie Jones
//PURPOSE : Load Arrays, perform seqSearch and BiSearch, 

package edu.tridenttech.cpt187.jones.program6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class InventoryData 
{
	private int[] partNum = new int[200];
	private double[] price = new double[200];
	private int partCount = 0;
	int binPassCount = 0;
	int seqPassCount = 0;
	
	public void loadArrays (String fileName)
	{
		try
		{
			Scanner infile = new Scanner (new FileInputStream(fileName));
			
			while (infile.hasNext())
			{
				partNum[partCount] = infile.nextInt();
				price[partCount] = infile.nextDouble();
				++partCount;
			}
			
			infile.close();
		} //End Try
		
		catch (IOException ex)
		{
			partCount = -1;
			ex.printStackTrace();
		} //End Catch
		
	} //END loadArray
	
	public void bubbleSort()
	{
		int last = partCount - 1;
		while(last > 0)
		{
			int ind = 0; 
			int swap = -1;
			while (ind < last)
			{
				if(partNum[ind] > partNum[ind +1])
				{
					int numTemp = partNum[ind];
					double priceTemp = price[ind];
					partNum[ind] = partNum[ind + 1];
					partNum[ind + 1] = numTemp;
					price[ind] = price[ind + 1];
					price[ind + 1] = priceTemp;
					swap = 1;
				}
				else
				{
					++ind;
				}
			}//END inner while loop
			if (swap == 0)
				{
					last = 0;
				}
				else
				{
					last = last -1;
				}
			
		}//END outer while loop
	}//END bubbleSort
	
	public int seqSearch(int target)
	{
		int ind = 0;
		int location = -1;
		while (ind < partCount)
		{
			if(target == partNum[ind])
			{
				location = ind;
				ind = partCount;
				++seqPassCount;
			}
			else
			{
				++ind;
				++seqPassCount;
			}
		}//END WHILE
		return location;
	}//END seqSearch
	
	public int binSearch(int target)
	{
		int first = 0;
		int last = partCount - 1;
		boolean found = false;
		
		while (first <= last && !found)
		{
			int mid = (first + last)/2;
			if(partNum[mid] == target)
			{
				found = true;
				return mid;
			}
			else if (partNum[mid] < target)
			{
				first = mid + 1;
				++binPassCount;
			}
			else
				last = mid  - 1;
				++binPassCount;
			if(!found)
			{
				mid = -1;
			}
		}//END while
		return -1;
	}//END binSearch
	
	public double getPrice(int index)
	{
		if (index >=0)
		{
		return price[index];
		}
	else
		return -1;
	}//END getPrice
	
}//END Class
