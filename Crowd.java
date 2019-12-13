// Michael Teesdale

public class Crowd extends Dice{
	
	   private static final int snakeEyes = 2;
	   private static final int trey = 3;      
	   private static final int seven = 7;     
	   private static final int eleven = 11; 
	   private static final int boxCars = 12;
	   private static final int four = 4;
	   private static final int five = 5;
	   private static final int six = 6;
	   private static final int eight = 8;
	   private static final int nine = 9;
	   private static final int ten = 10;
	 
	   public void crowdCommentary(int i)
	   {
		   switch(i)
		   {
		   case seven:
		   case eleven:
			   System.out.println("\nCrowd: Nice Win!\n");
			   break;
		   
		   case snakeEyes:
		   case trey:
		   case boxCars:
			   System.out.println("\nCrowd: Boooo, get off the table!\n");
			   break;
			   
		   case four:
		   case five:
		   case six:
		   case eight:
		   case nine:
		   case ten:
			   System.out.println("\nCrowd: You got this!\n");
			   
	   }
	   }

}
