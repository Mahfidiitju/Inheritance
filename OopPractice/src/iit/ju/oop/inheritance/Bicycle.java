package iit.ju.oop.inheritance;

public class Bicycle {
	public int gear;
	public int speed;
	public int cadence;
	
	public void setCandence(int newValue)
	{
		cadence=newValue;
	}
	public void setGear(int value)
	{
		gear=value;
	}
	public void applyBrake(int decrement)
	{
		speed-=decrement;
	}
		public void speedup(int increment)
	{
		speed+=increment;
		
	}

	
		
}
