//FILE : RoomPlanner.java
//PROG : Dave Jones
//PURP : Class for a simple room layout calculator

package edu.jones.ooroom;

public class RoomPlanner 
{
	private int roomLength = 0;
	private int roomWidth = 0;
	
	RoomPlanner (int length, int width)
	{
		roomLength = length;
		roomWidth = width;
	}
	
	public double computeRoomArea()
	{
		return roomLength * roomWidth;
	}//END computeRoomArea
	
	public void displayRoomDimensions()
	{
		System.out.printf("Room length: %d\n", roomLength);
		System.out.printf("Room width: %d\n", roomWidth);
	}//END displayRoomDimensions

}//END class RoomPlanner
