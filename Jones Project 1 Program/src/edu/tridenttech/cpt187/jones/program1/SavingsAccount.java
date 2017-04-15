//FILE: SavingsAccount.java
//PROG: Jamie Jones
//PURP: Simulate a simple bank savings account that allows deposits and withdraws

package edu.tridenttech.cpt187.jones.program1;

public class SavingsAccount 
{
	//The class's instance variables
	private String accountNumber;
	private	double	balance;
	private	double	rate;
	
	public SavingsAccount(String acctNo, double startingBalance, double startingRate)
	{
		accountNumber = acctNo;
		balance = startingBalance;
		rate = startingRate;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
			return balance;
	}		
	
	public double getRate()
	{
		return rate;	
	}
	
	public void setAccountNumber (String newAcctNumb)
	{
		newAcctNumb = accountNumber;
	}
	
	public void setRate (double newIntRate)
	{
		newIntRate = rate;
	}
	public void addToBalance (double amount)
	{
		balance += amount;
	}
	
	public void withdrawFromBalance(double amount)
	{
		balance -= amount;
	}
	
	
}//END class Savings Account
