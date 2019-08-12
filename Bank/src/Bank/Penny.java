package Bank;

public class Penny  extends Coin
{
	public Penny(int amount)
	{
		super(amount);
	}

	@Override
	public double getValue()
	{
		return .01 * amount;
	}
}
