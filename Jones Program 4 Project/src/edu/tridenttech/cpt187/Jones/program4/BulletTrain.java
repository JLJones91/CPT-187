//FILE : BulletTrain.java
//PROG : Jamie Jones
//PURP : Class simulates a high speed railway train, with multiple stops
//and able to load and unload passengers

package edu.tridenttech.cpt187.Jones.program4;

import java.util.Random;

public class BulletTrain 
{
	private int peopleOnBoard;			//Number of pax on train
	private int maxCapacity;			//Max capacity of entire train
	private int currentStation;			//Number of the station the train is stopped at
	private int numStations;			//Number of stations serviced by this train
	private int destStation;			//Number of the next station to stop at
	private Random ranNumGenerator;		//generate random numbers for passenger loading/unloading
	
	public BulletTrain(int stationCount, int maxPersons, int startStation)
	{
		numStations = stationCount;
		maxCapacity = maxPersons;
		currentStation = startStation;
		destStation = currentStation;
		peopleOnBoard = 0;				
		ranNumGenerator = new Random();
	}
	
	public int getPeopleOnBoard()
	{
		return peopleOnBoard;
	}
	
	public int getMaxCapcity()
	{
		return maxCapacity;
	}
	
	public int getCurrentStation()
	{
		return currentStation;
	}
	
	public int getNumStations()
	{
		return numStations;
	}
	
	public int getDestStation()
	{
		return destStation;
	}
	
	public int genRandNumber(int maxNum)
	{
		return ranNumGenerator.nextInt(maxNum + 1);
	}
	
	public void moveToStation(int nextStation)
	{

		if (nextStation <= numStations)
		{	
		destStation = nextStation;
		}
		else
		{
			destStation = currentStation - numStations + 1;
		}
		
		System.out.printf("Leaving station #%d for station #%d with %d passengers.\n",
				currentStation, destStation, peopleOnBoard);
		
		currentStation = destStation;
	}//END moveToStation
	
	public void loadPeople (int genRandNumber)
	{
		if (genRandNumber + peopleOnBoard <= maxCapacity)
		{
		System.out.println("Number of Passengers Boarding: " + genRandNumber);
		}
		else
		{
			System.out.println("Sorry the Max Capacity is " + maxCapacity + " people. " 
					+ genRandNumber + " is to many additional people. ");
			
			genRandNumber = maxCapacity - peopleOnBoard;
			System.out.println("Only " + genRandNumber + " People can Board ");
		}
		
		peopleOnBoard += genRandNumber;
		System.out.println("Total Passengers on Train: " + peopleOnBoard + ".");
	}//End loadPeople
	
	public void unLoadPeople (int genRandNumber)
	{
		System.out.println("Number of Passengers Leaving: " + genRandNumber);
	
		peopleOnBoard -= genRandNumber;
		System.out.printf("Total People on Train: %d.\n", peopleOnBoard);
		
	}// End unLoadPeople
	
}//END class BulletTrain
