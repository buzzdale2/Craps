// Michael Teesdale

import java.security.SecureRandom;

public class Dice {
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public int sum;
	
	public int rollDice() {
	      // pick random die values
	      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
	      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

	      final int sum = die1 + die2; // sum of die values

	      // display results of this roll
	     // System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
	      this.sum = sum;
	      return sum; 
	   } 
	
	public int getDiceSum()
	{
		return sum;
	}
}
