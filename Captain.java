public class Captain
{
	private BattleShip battleship;
	
	public Captain(BattleShip battleship)
	{
		this.battleship = battleship;
	}

	public void setBattleship(BattleShip battleship)
	{
		this.battleship = battleship;
	}
	
	public void fire()
	{
		battleship.fire();
	}
	
	public void move()
	{
		battleship.move();
	}
}
