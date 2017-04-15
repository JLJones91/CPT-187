//File : MainClass.java
//Prog : Jamie Jones
//Purp : To load and test an array

package edu.tridentech.cpt187.Jones.Program5;

public class MainClass 
{
	public static void main(String[] args) 
	{
		IntegerArray newArray = new IntegerArray();
		String fileName = "example.dat";
		
		newArray.loadArray(fileName);
		
		newArray.displayArray();
		
		//I Went 4 decimal places with the Average, to clean up the display a bit, hope that is ok.
		System.out.printf("The Average is: %.4f\n", newArray.calcAvg()); 
		System.out.println("The Amount of Numbers Below Average is: " + newArray.countBelowAvg());
	}

} //END MainClass