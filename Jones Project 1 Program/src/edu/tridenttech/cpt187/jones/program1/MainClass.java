//FILE: MainClass.java
//PROG: Jamie Jones
//PURP: Simulate a real bank savings account using the class SavingsAccount. 

package edu.tridenttech.cpt187.jones.program1;

import java.util.Scanner;

public class MainClass 
{
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		SavingsAccount myAccount = new SavingsAccount("aBc123", 4000.00, .4);
		String	userName = "";
		String	acctNumb = "";
		double	currentBalance;
		double	currentRate;
		double	addAmount;
		double	removeAmount;
		double	intEarned;
		double	endBal;
		int	x=1;
		
		currentBalance = myAccount.getBalance();
		currentRate = myAccount.getRate();
		
		System.out.println("What is your first name?");
		userName = input.nextLine();		
		acctNumb = myAccount.getAccountNumber();
		
		System.out.println("Thank you, " + userName + ". Your account details are:");
		System.out.printf("%10s%20s%20s\n", "Account Number", "Starting Balance", "Interest Rate");
		System.out.printf("%14s%20.2f%20.2f\n", acctNumb, currentBalance, currentRate);
			
		System.out.println(userName + ", how much would you like to add to your account?");
		addAmount = input.nextDouble();
		myAccount.addToBalance(addAmount);
		
		System.out.println(userName + ", how much would you like to remove from your account?");
		removeAmount = input.nextDouble();
		myAccount.withdrawFromBalance(removeAmount);
		
		System.out.println(userName + ", for Account Number: " + acctNumb);
		System.out.printf("With a starting balance of $%.2f,\n", currentBalance);
		System.out.printf("You added $%.2f,\n", addAmount);
		System.out.printf("and removed $%.2f.\n", removeAmount);
		System.out.printf("The new balance after deposit is $%.2f.\n", myAccount.getBalance());
		System.out.println("At an interest rate of " + currentRate + "%.");
		
		intEarned = myAccount.getBalance() * currentRate / 100;
		endBal = myAccount.getBalance() + intEarned;
		
		System.out.printf("%5s%10s%10s%10s\n", "Month", "Starting", 
				"Interest", "Ending");
		System.out.printf("%3s%11s%9s%13s\n", "#", "Balance", 
				"Earned", "Balance");
		System.out.printf("%3s%11.2f%9.2f%13.2f\n", x, myAccount.getBalance(), intEarned, endBal); 		
		
		while(x <= 11) 
		{
			double	newBal;
			double earnedInt;
			
			x+=1;
			newBal = endBal; 
			earnedInt = newBal*currentRate/100; 
			endBal = newBal + earnedInt;
			
			System.out.printf("%3s%11.2f%9.2f%13.2f\n", x, newBal, earnedInt, endBal);
		}	
		
		
		input.close();
	} 
	
	public static void applyInterest(SavingsAccount theAccount)
	{
			double currentBalance = theAccount.getBalance();
			double currentRate = theAccount.getRate();
			double interestEarned = currentBalance * currentRate;
			theAccount.addToBalance(interestEarned);
	}//END applyInterest
	
}//END MainClass
