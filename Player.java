// Michael Teesdale

import java.util.Scanner;


public class Player{
	
	private String playerName;
	private int balance;
	public int newBalance;
	
	private int wage;

	public void setPlayerName(String playerName)
	{
		Scanner setPlayerName = new Scanner(System.in);
		System.out.println("What's your name? ");
		playerName = setPlayerName.nextLine();
		this.playerName = playerName;
	}
	
	public String getPlayerName()
	{
		return playerName;
	}
	
	public void setBalance(int balance)
	{
		Scanner setBalance = new Scanner(System.in);
		System.out.print("What is your bank balance? ");
		balance = setBalance.nextInt();
		this.balance = balance;
	}
	
	public void setWage(int wage)
	{
		Scanner setWage = new Scanner(System.in);
		System.out.print("What is the wage you would like to set? ");
		wage = setWage.nextInt();
		if (wage > balance)
		{
			throw new IllegalArgumentException("Your wage exceeds your balance. Please"
					+ " enter an amount equal to or less than your currect balance.");
		}
		
		if (wage < balance)
		{
			balance = balance - wage;
			this.balance = balance;
		}
		
		this.wage = wage;
	}
	
	public void setWinningBalance()
	{
		balance = (this.wage * 2) + this.balance;
		this.balance = balance;
	}
	
	public void setLosingBalance()
	{
		balance = this.balance - this.wage;
		this.balance = balance;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public int getWage()
	{
		return wage;
	}
}
