package iit.ju.oop.inheritance;

public class Account {
	private String name;
	private int amount;
	
	public Account(String name,int amount)
	{
		this.name=name;
		this.amount=amount;
	}
	public String getName()
	{
		return name;
	}
	public void deposite(int amount)
	{
		this.amount+=amount;
	}
	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int amount)
	{
		this.amount=amount;
	}
}
