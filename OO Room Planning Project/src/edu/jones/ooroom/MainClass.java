//FILE : MainClass.java
//PROG : Dave Jones
//PURP : Driver for a simple room calculator

package edu.jones.ooroom;

public class MainClass 
{
	public static void main(String[] args)
	{
		//Create two RoomPlanner objects. Ordinarily, we would input the dimensions
		//to use for each one, but here we'll simply hard-code them.
		RoomPlanner roomOne = new RoomPlanner(33, 20);
		RoomPlanner roomTwo = new RoomPlanner(40, 15);
		
		System.out.println("Welcome to Room Planner 101!\n");
		System.out.print("The dimensions of the first room are:\n");
		roomOne.displayRoomDimensions();
		System.out.print("The dimensions of the second room are:\n");
		roomTwo.displayRoomDimensions();
		
		System.out.printf("\nThe area of room one is %.1f square feet.\n", roomOne.computeRoomArea());
		System.out.printf("\nThe area of room two is %.1f square feet.\n", roomTwo.computeRoomArea());
		
	}//END main
}//END class Main
