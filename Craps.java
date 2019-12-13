// Michael Teesdale

import java.util.Scanner;

public class Craps {

	private static int wage;
	private static int balance;

	public static void main(String[] args) {
		
		String playerName = null;
		Player player = new Player();
		player.setPlayerName(playerName);
		Dice dice = new Dice();
		
		while (player.getBalance() == 0)
		{
			System.out.print("Welcome to craps, " + player.getPlayerName() + "!\n");
			System.out.print(player.getPlayerName() + "\n");
			
			player.setBalance(balance);
			System.out.print(player.getPlayerName() + "'s balance is: $"
					+ player.getBalance() + "\n");
			
			player.setWage(wage);
			
			System.out.print(player.getPlayerName() 
					+ " has placed a wage of: $" + player.getWage() + "\n" 
					+ player.getPlayerName() + "'s balance is now $" + player.getBalance() + "\n");
			
			while (0 < player.getBalance()) {
				
				System.out.print(player.getPlayerName() + " throws the dice!\n" 
						+ player.getPlayerName() + " rolls a " + dice.rollDice() + "\n");
						
						Dealer dealer = new Dealer(player);
						Crowd crowd = new Crowd();
						
						dealer.results(dice.getDiceSum());
						crowd.crowdCommentary(dice.getDiceSum());
						
						Scanner confirmNextGame = new Scanner(System.in);
						System.out.print("Would you like to play again? Enter '1' for yes, or '0' for no. ");
						int confirm = confirmNextGame.nextInt();
						
						if (player.getWage() > player.getBalance())
						{
							System.out.println("Your wage is exceeds the amount in your balance.\n");
							
						}
						
						if (confirm == 1)
						{
							while (player.getBalance() > 0)
							{
								
								dealer.results(dice.getDiceSum());
								crowd.crowdCommentary(dice.getDiceSum());
								break;
							}
							if (0 >= player.getBalance())
							{
								System.out.println("You have insufficient funds to play. Thanks for playing. ");
							}
						}
						
						else
						{
							System.out.println("Thanks for playing, come play again soon.\n");
							System.out.print(player.getPlayerName() + "'s final balance is: $" + player.getBalance());
							break;
						}
					}
			}	
	}
}
