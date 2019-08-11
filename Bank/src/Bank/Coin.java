package Bank;

public abstract class Coin
{
	protected int amount;

	public Coin()
	{
		this.amount = 1;
	}

	public Coin(int amount)
	{
		this.amount = amount;
	}

	public abstract double getValue();

}
