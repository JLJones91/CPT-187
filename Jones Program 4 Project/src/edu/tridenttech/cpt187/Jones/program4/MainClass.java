//FILE : MainClass.java
//PROG : Jamie Jones
//PURP : Simulate a high speed train move between stops while loading and unloading passengers within the given parameters. 

package edu.tridenttech.cpt187.Jones.program4;

public class MainClass {

	public static void main(String[] args) 
	{
		final int STATIONCOUNT = 30;
		final int	MAXPERSONS = 200;
		final int	STARTSTATION  = 1;
		
		BulletTrain trainOne = new BulletTrain(STATIONCOUNT, MAXPERSONS, STARTSTATION);
		
		//Load initial Passnegers
		trainOne.loadPeople(trainOne.genRandNumber(MAXPERSONS));
	
		for (int ct = 0; ct < STATIONCOUNT; ++ct)
		{
			System.out.println("\nAll aboard Train Number One!");
			trainOne.moveToStation(trainOne.getCurrentStation() + 1);
			//unLoadPeople
			trainOne.unLoadPeople(trainOne.genRandNumber(trainOne.getPeopleOnBoard()));
			//loadPeople
			trainOne.loadPeople(trainOne.genRandNumber(300));
			
		}// End For loop		
		
	}//END main
}//END MainClass
