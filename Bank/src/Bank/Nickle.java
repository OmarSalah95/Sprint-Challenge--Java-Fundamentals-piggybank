package Bank;

public class Nickle extends Coin
{
	public Nickle(int amount)
	{
		super(amount);
	}

	@Override
	public double getValue()
	{
		return .05 * amount;
	}
}
