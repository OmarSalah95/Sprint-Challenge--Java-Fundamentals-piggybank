package Bank;

public class Dollar  extends Coin
{
	public Dollar(int amount)
	{
		super(amount);
	}

	@Override
	public double getValue()
	{
		return amount;
	}
}
