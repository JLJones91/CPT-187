//FILE : MainClass.java
//PROG : Dave Jones
//PURP : Demo use of procedural programming concepts
//		 using a simple set of methods to compute or
//       display parameters of a room

package edu.jones.procroom;

public class MainClass 
{
	public static void main(String[] args)
	{
		int roomOneLength = 33;
		int roomOneWidth = 20;
		int roomTwoLength = 40;
		int roomTwoWidth = 15;
		double roomOneArea = 0.0;
		double roomTwoArea = 0.0;
		
		//Here we will simulate inputting the four dimensions
		
		//Display both rooms' dimensions
		System.out.println("The dimensions of room #1 are:");
		displayRoomDimensions (roomOneLength, roomOneWidth);
		System.out.println("\nAnd the dimensions of room #2 are:");
		displayRoomDimensions (roomTwoLength, roomTwoWidth);
		
		//Calculate both room areas and then display both, but use calls to the method in the output
		roomOneArea = computeRoomArea (roomOneLength, roomOneWidth);
		roomTwoArea = computeRoomArea (roomTwoLength, roomTwoWidth);
		
		System.out.printf("\nThe area of room one is %.1f square feet.\n", computeRoomArea(roomOneLength, roomOneWidth));
		System.out.printf("\nThe area of room two is %.1f square feet.\n", computeRoomArea(roomTwoLength, roomTwoWidth));
		
	}//END main
	
	public static double computeRoomArea(int length, int width)
	{
		return length * width;
	}
	
	public static void displayRoomDimensions(int length, int width)
	{
		System.out.printf("Room length: %d\n", length);
		System.out.printf("Room width: %d\n", width);
	}//END displayRoomDimensions
}//END class RoomPlanning
