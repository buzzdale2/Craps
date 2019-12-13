// Michael Teesdale 

public class Dealer extends Player
{
	   private enum Status {CONTINUE, WON, LOST}
	   
	   private static final int snakeEyes = 2;
	   private static final int trey = 3;      
	   private static final int seven = 7;     
	   private static final int eleven = 11; 
	   private static final int boxCars = 12;
	   
	   private Player player;
	   public Dealer(Player player)
	   {
		   this.player = player;
	   }
	   
	   Dice dice1 = new Dice();
	   int dice;
	   Status gameStatus;
	   int gamePoint = 0;
	   
	   public void results(int i)
	   {
		   switch(i)
		   {
		   case seven:
			   gameStatus = Status.WON;
			   System.out.println("Dealer: Seven! Lucky!\n");
			   System.out.println("Dealer: You win!\n"); 
			   player.setWinningBalance();
			   System.out.print(player.getPlayerName() + "'s new balance is: $" + player.getBalance() + "\n");
			   break;
		   case eleven:
			   gameStatus = Status.WON;
			   System.out.println("Dealer: Eleven! Lucky!\n");
			   System.out.println("Dealer: You win!\n"); 
			   player.setWinningBalance();
			   System.out.print(player.getPlayerName() + "'s new balance is: $" + player.getBalance() + "\n");
			   break;
			   
		   case snakeEyes:
			   gameStatus = Status.LOST;
			   System.out.println("Dealer: Snake Eyes! You lose!");
			   player.setLosingBalance();
			   System.out.print(player.getPlayerName() + "'s new balance is: $" + player.getBalance() + "\n");
		   case trey:
			   gameStatus = Status.LOST;
			   System.out.println("Dealer: Trey! You lose!");
			   player.setLosingBalance();
			   System.out.print(player.getPlayerName() + "'s new balance is: $" + player.getBalance() + "\n");
		   case boxCars:
			   gameStatus = Status.LOST;
			   System.out.println("Dealer: Box Cars! You lose!");
			   player.setLosingBalance();
			   System.out.print(player.getPlayerName() + "'s new balance is: $" + player.getBalance() + "\n");
			   break;
			   
		   default:
			   gameStatus = Status.CONTINUE;
			   gamePoint = i;
			   System.out.printf("Dealer: The point is %d%n",  gamePoint);
			   System.out.print("\n");
			   break;
		   }
		   
		   while (gameStatus == Status.CONTINUE)
		   {
			   i = dice1.rollDice();
			   
			   if (i == gamePoint)
			   {
				   gameStatus = Status.WON;
				   System.out.print("The next roll is: " + dice1.getDiceSum() + "\nDealer: You win!\n");
				   player.setWinningBalance();
				   System.out.print(player.getPlayerName() + "'s new balance is: $" + player.getBalance() + "\n");
			   }
			   
			   else 
			   {
				   if (i == seven) 
				   {
					   gameStatus = Status.LOST;
					   System.out.println("The next roll is: " + dice1.getDiceSum() + "\nDealer: You Lose!\n");
					   player.setLosingBalance();
					   System.out.print(player.getPlayerName() + "'s new balance is: $" + player.getBalance() + "\n");
					   
				   }
			   }   
		   }
	   }
}