/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 2
 */

public class BattleFishingBoat implements BattleShip 
{
	
	public BattleFishingBoat()
	{
		//Constructor not required as the Fishing boat serves the function
			// of performing fire() and move() methods
	}

	public void fire()
	{
		System.out.println("BattleFishingBoat fires!");
	}
	
	public void move()
	{
		FishingBoat fb = new FishingBoat();
		fb.sail();
	}
}
