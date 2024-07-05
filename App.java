package week6Assignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck deck = new Deck();
		Player player1 = new Player("Jimothy");
		Player player2 = new Player("Jamantha");
		Card plr1Card;
		Card plr2Card;
		
		
		
		deck.shuffle();
		
		for (int i = 0; i <52; i++) {
			
			if (i % 2 == 0) {
				player1.draw(deck);
				
			} else if (i % 2 == 1) { 
				player2.draw(deck);
				
			}
		}
		
		for (int i = 0; i < 26; i++) {
			plr1Card = player1.flip();
			plr2Card = player2.flip();
			
			System.out.println("It is the " + plr1Card.getName() + " vs the " + plr2Card.getName());
			
			if (plr1Card.getValue() > plr2Card.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1: " + player1.getName() + " gets the point");
				
				
			} else if (plr1Card.getValue() < plr2Card.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2: " + player2.getName() + " gets the point");
				
			} else if (plr1Card.getValue() == plr2Card.getValue()) {
				System.out.println("The flip was a tie, and no point was awarded");
				
			}
			
			System.out.println("The score is " + player1.getScore() + " to " +  player2.getScore());
			
		}
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " has won with " + player1.getScore() + " points!");
			
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " has won with " + player2.getScore() + " points!");
			
		} else if (player1.getScore() == player2.getScore()) {
			System.out.println("it is a draw between the two players with " + player1.getScore() + " points!");
			
		}
		
		
		
		
	}

}
