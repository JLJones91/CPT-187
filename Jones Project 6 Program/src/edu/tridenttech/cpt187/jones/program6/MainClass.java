//FILENAME: MainClass.java
//PROG: Jamie Jones
//Purpose: Load and Test Arrays
package edu.tridenttech.cpt187.jones.program6;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		InventoryData newArray = new InventoryData();
		String fileName = "masterInventory.dat";
		int runProgram = ' ';
		int target;
		int qty;
		int totalCount = 0;
		int foundCount = 0;
		int notFoundCount = 0;
		//Load Arrays
		newArray.loadArrays(fileName);
			
		//bubbleSort
		newArray.bubbleSort();
			
		//Customer Input
		System.out.println("Press 1 to quit, or Enter Part Number" );
		runProgram = input.nextInt();
				
		while(runProgram != 1)
		{
			target = runProgram;
			++totalCount;
			
			//Run seqSearch
			int seqIndex = newArray.seqSearch(target);
			double seqPrice = newArray.getPrice(seqIndex);
						
			//Get seqPrice
			if(newArray.getPrice(seqIndex) >= 0)
			{
				System.out.printf("Sequential found Part Number %d. The price is $%.2f\n", target, seqPrice);
				System.out.println("Attempts to find Number: " + newArray.seqPassCount);
			}
			else
			{
				System.out.println("Sequential Could Not Find Part Number: " + target + ".");
				System.out.println("Attempts to find Number: " + newArray.seqPassCount);
			}
			
			//Run binSearch
			int binIndex = newArray.binSearch(target);
			double binPrice = newArray.getPrice(binIndex);
			
			//Get binPrice
			if(newArray.getPrice(binIndex) == -1)
			{
				System.out.println("Binary Could Not Find Part Number: " + target + ".");
				System.out.println("Attempts to find Number: " + newArray.binPassCount);
				++notFoundCount;
			}
			else
			{
				System.out.printf("Binary found Part Number %d. The price is $%.2f\n", target, binPrice);
				System.out.println("Attempts to find Number: " + newArray.binPassCount);
				
				//getQty
				System.out.println("How many parts would you like to purchase?");
				qty = input.nextInt();
				double cost = binPrice * qty;
				System.out.printf("%s%14s%15s%14s\n", "Part #", "Price", "QTY", "Cost");
				String dollar = "$";
				System.out.printf("%d%10s%.2f%14d%11s%.2f\n", target, dollar, binPrice, qty, dollar, cost);
				++foundCount;
			}
						
			System.out.println("Press 1 to quit, or Enter Part Number." );
			runProgram = input.nextInt();
			
		}//END while loop
		System.out.println("Total Parts Searched: " + totalCount + ". Total Parts Found: " + 
				foundCount + ". Total Parts NOT Found: " + notFoundCount + ".");
		System.out.println("Have a Nice Day!");
			
		input.close();

	}
}//END MainClass
