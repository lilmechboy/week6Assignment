package week6Assignment;

import java.util.*;

public class Deck {
	
	
//	ArrayList<Card> deck = new ArrayList<Card>();
	

	
	List<Card> cards = new ArrayList<Card>();
	
	
	private List<Card> deckHolder = new ArrayList<Card>();
	private String name = "";
	private Card holder;
	private Random rand = new Random();
			
	public Deck() {
		
		String[] suits = { "Spades" , "Hearts" , "Diamonds" , "Clubs" };
		String[] titles = { "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten" , "Jack" , "Queen" , "King" , "Ace" };

		//nested for loop
		
		// this isn't correct, it will increment but not capture all values
		for (int i = 0; i < titles.length; i++) {
			
			for (int j = 0; j < suits.length; j++) {
				
				name = titles[i] + " of " + suits[j];
				holder = new Card(i+2, name);
				cards.add(holder);
			}
		}
	}
	
	// I think I could put the 4 loop right here
	
	public void shuffle() {
		
		//somehow shuffle them bitches up
		
		for (int i = 0; i < cards.size(); i++) {
			
			holder = cards.get(rand.nextInt(i));
			deckHolder.add(holder);
		}
		
		
	}
	
	public Card draw(Deck cards) {
		
		// we want to check the deck size in the player class before the card is drawn
		holder = this.cards.get(0);
		
		this.cards.remove(0);
		
		return holder;
	}
	
	public Deck getCards() {
		
		return (Deck) cards;
	}
	
	public void setCards(Deck cards) {
		
		this.cards = (List<Card>) cards;
	}
}