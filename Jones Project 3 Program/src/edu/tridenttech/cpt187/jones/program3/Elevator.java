//FILE: Elevator.java
//PROG: Jamie Jones
//Purp: Simulate an elevator moving up and down, 
		//and loading and unloading passengers

package edu.tridenttech.cpt187.jones.program3;

public class Elevator 
{
	//The Class's instance Variables
	private int	numOnBoard;
	private	int	maxCapacity;
	private int	currentFloor;
	private	int	destFloor;
	private	int	maxFloor;
	private	int	minFloor;
	
	public Elevator (int maxRiders, int curntFloor, int highestFloor, int lowestFloor, int curntPass)
	{
		maxCapacity = maxRiders;
		currentFloor = curntFloor;
		maxFloor = highestFloor;
		minFloor = lowestFloor;
		numOnBoard = curntPass;
	}

	public int getNumOnBoard()
	{
		return numOnBoard;
	}

	public int getMaxCapacity()
	{
		return maxCapacity;
	}

	public int	getCurrentFloor()
	{
		return currentFloor;
	}

	public int getDestFloor()
	{
		return destFloor;
	}

	public int getMaxFloor() 
	{
		return maxFloor;
	}

	public int getMinFloor()
	{
		return minFloor;
	}
	
	//Begin loadElevator
	public void loadElevator(int numbOn)
	{
		System.out.println("Number of Passengers getting on: " + numbOn);
		
		if (numbOn > maxCapacity - numOnBoard)
		{
			System.out.println("I'm sorry. This elevator has a limit of " + maxCapacity + " people. With " 
					+ numOnBoard + " current passegners, " + numbOn + " is above the maximum for safe travel!");
			numbOn = maxCapacity - numOnBoard;
			System.out.println(numbOn + " will be allowed to ride.");
			numOnBoard += numbOn;
			System.out.println("Total Passengers Boarded: " + numOnBoard + ".");
		}
		
		else
		{
			numOnBoard += numbOn;
			System.out.println("Total Passengers Boarded: " + numOnBoard + ".");
		}
	}// loadElevator
	
	//Begin unLoadElevator
	public void unLoadElevator (int numbOff)
	{
			if (numbOff < numOnBoard)
			{	
				numOnBoard -= numbOff;
				System.out.println(numbOff + " passengers exiting elevator");	
			}
			
			else
			{	
				System.out.println("All " + numOnBoard + " passenger(s) are leaving the elevator");
				numOnBoard -= numbOff;
				while (numOnBoard < 0 )
				{
					numOnBoard = 0;
				}
			}
			
			System.out.println("Remaining Passengers: " + numOnBoard);
	}//End unLoadElevator
	
	//Begin Move Elevator
	public void moveElevator (int destFloor)
	{
		if (currentFloor == destFloor)
		{
		System.out.println("You are already on that floor");
		}
		
		else if (maxFloor < destFloor)
		{
			System.out.println("I'm sorry you cannot go there!");
			System.out.println("The highest floor in this building is " + maxFloor + ".");
		}
		
		else if (minFloor > destFloor)
		{
			System.out.println("I'm Sorry you cannot go there!");
			System.out.println("The lowest floor in this building is " + minFloor + ".");
		}
		
		else if (destFloor > currentFloor)
		{
			System.out.println("Going up! Leaving from floor " + currentFloor);
			while (currentFloor <(destFloor-1))
			{
				currentFloor ++;
				System.out.println("Passing Floor " + currentFloor);
			}
			currentFloor ++;
			System.out.println("You have arrived at floor " + currentFloor);
		}
		
		else if (destFloor < currentFloor)
		{
			System.out.println("Going Down! Leaving from floor " + currentFloor);
			while (currentFloor >(destFloor+1))
			{
				currentFloor --;
				System.out.println("Passing Floor " + currentFloor);
			}
			currentFloor --;
			System.out.println("You have arrived at floor " + currentFloor);
		}
		destFloor = currentFloor;
		
	}//End moveElevator
		
}// End class Elevator