package Junitpackage;

public class BankAccount  
{

private Integer Balance;

public BankAccount(Integer InitialBalance)
{
	this.Balance=InitialBalance;
}

public Integer withdraw(Integer amount)
{
	if(Balance<amount)
	{
		throw new NotEnoughFundsException(amount,Balance);
	}
	
	Balance -= amount;

	return amount;
	
}
	
	
}
