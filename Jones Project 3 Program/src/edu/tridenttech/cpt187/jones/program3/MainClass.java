//FILE: MainClass.java
//PROG: Jamie Jones
//PURP: Simualte an elevator moving up and down, 
		//load and unload passengers

package edu.tridenttech.cpt187.jones.program3;

import java.util.Scanner;

public class MainClass 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Elevator myRide = new Elevator(18, 1, 99, 1, 0);
	
		int curntFloor;		//Current Floor Elevator is on
		int	curntPass;	 	//Number of passengers on elevator
		int numbOn;			//Number of people getting on
		int numbOff;		//Number of people getting off
		int destFloor;		//Destination Floor
		
		curntFloor = myRide.getCurrentFloor();
		curntPass = myRide.getNumOnBoard();
	
		System.out.println("You are on floor # " + curntFloor +".");
		System.out.println("Number of Current Riders: " + curntPass);
		
		//# of Passengers getting on
		numbOn = 15; 
		myRide.loadElevator(numbOn);
	
		//Move Elevator
		destFloor = 50;
		myRide.moveElevator(destFloor);
		
		//# of Pass getting off Elevator
		numbOff = 10; 
		myRide.unLoadElevator(numbOff);
				
		//# of Pass getting on
		numbOn = 7; 
		myRide.loadElevator(numbOn);
		
		//Move Elevator
		destFloor = 25;
		myRide.moveElevator(destFloor);
		
		//# of Pass getting off Elevator
		//numbOff > numOnBoard
		numbOff = 50; 
		myRide.unLoadElevator(numbOff);
						
		//# of Pass getting on
		//numbOn > maxRiders
		numbOn = 25; 
		myRide.loadElevator(numbOn);
		
		//Move Elevator
		//destFloor > maxFloor
		destFloor = 125;
		myRide.moveElevator(destFloor);
	
		//Move Elevator
		//destFloor < minFloor
		destFloor = -25;
		myRide.moveElevator(destFloor);
		
		//Move Elevator
		//destFloor = curntFloor
		destFloor = 25;
		myRide.moveElevator(destFloor);
		
		//Move Elevator
		destFloor = 75;
		myRide.moveElevator(destFloor);
		
		//# of Pass getting off Elevator
		numbOff = 5; 
		myRide.unLoadElevator(numbOff);
								
		//# of Pass getting on
		numbOn = 2; 
		myRide.loadElevator(numbOn);
		input.close();
		
		//Move Elevator
		destFloor = 1;
		myRide.moveElevator(destFloor);
		
		//# of Pass getting off Elevator
		numbOff = 15; 
		myRide.unLoadElevator(numbOff);
	
	}//End class
}// End MainClass
