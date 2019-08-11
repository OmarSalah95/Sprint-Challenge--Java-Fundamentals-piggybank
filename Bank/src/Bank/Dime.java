package Bank;

public class Dime extends Coin
{
	public Dime(int amount)
	{
		super(amount);
	}

	@Override
	public double getValue()
	{
		return .10 * amount;
	}
}
