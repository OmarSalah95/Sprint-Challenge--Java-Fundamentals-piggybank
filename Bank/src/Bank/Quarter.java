package Bank;

public class Quarter extends Coin
{
	public Quarter(int amount)
	{
		super(amount);
	}

	@Override
	public double getValue()
	{
		return .25 * amount;
	}
}
