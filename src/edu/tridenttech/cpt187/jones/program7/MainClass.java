//Filename: MainClass.java
//Programmer: Jamie Jones
//Purpose: input file, run and test methods from InventoryData.java, displays price, asks for quantity, displays part numb, price, quantity, and total. displays count for part searches.

package edu.tridenttech.cpt187.jones.program7;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		InventoryData newArray = new InventoryData();
		String fileName = "masterInventory.dat";
		int runProgram = ' ';
		int target;
		int totalCount = 0;
		int foundCount = 0;
		int notFoundCount = 0;
		
		//Load Arrays
		newArray.loadArrays(fileName);
			
		//bubbleSort
		newArray.bubbleSort();
			
		//Customer Input
		System.out.println("Welcome to PartMaster 2000!\nYou can search for any Part Number in the system! Upon finding "
				+ "the Part requested,\nthe Price will be displayed and You will be prompted to enter the Quantity of Parts "
				+ "required.\nThe Part Number, Cost, Quantity Requested, and the Sales Total will then be displayed.\nThis will "
				+ "continue as long as You wish. The search will end by pressing '9'.\nTotal Searches, Found Item Total, "
				+ "and Not Found Item Total will be displayed upon quitting!\n");
		
		System.out.println("Enter Part Number or Press 9 to quit" );
		runProgram = input.nextInt();
						
		while(runProgram != 9)
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
			}
			else
			{
				System.out.println("Sequential Could Not Find Part Number: " + target + ".");
			}
			
			//Run binSearch
			int binIndex = newArray.binSearch(target);
			double binPrice = newArray.getPrice(binIndex);
			
			//Get binPrice
			if(newArray.getPrice(binIndex) == -1)
			{
				System.out.println("Binary Could Not Find Part Number: " + target + ".");
				++notFoundCount;
			}
			else
			{
				System.out.printf("Binary found Part Number %d. The price is $%.2f\n", target, binPrice);
				
				//getQty
				System.out.println("How many parts would you like to purchase?");
				int qty = input.nextInt();
				double cost = binPrice * qty;
				System.out.printf("%s%14s%15s%14s\n", "Part #", "Price", "QTY", "Cost");
				String dollar = "$";
				System.out.printf("%d%10s%.2f%14d%11s%.2f\n", target, dollar, binPrice, qty, dollar, cost);
				++foundCount;
			}
						
			System.out.println("Press 9 to quit, or Enter Part Number." );
			runProgram = input.nextInt();
		}//END while loop
		
		System.out.printf("Total Parts Searched: %d.\n", totalCount);
		System.out.printf("Total Parts Found: %d.\n", foundCount);
		System.out.printf("Total Parts NOT Found: %d.\n", notFoundCount);
		System.out.println("Have a Nice Day!");
		System.out.println("~PartMaster 2000");
		input.close();
	}
}//END MainClass