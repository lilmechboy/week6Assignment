package week6Assignment;

import java.util.*;

public class Deck {
	
	
//	ArrayList<Card> deck = new ArrayList<Card>();
	

	
	public List<Card> cards = new ArrayList<Card>();
	
	private List<Card> deckHolder = new ArrayList<Card>();
	private String name = "";
	private Card holder;
	private Random rand = new Random();
	
			
	public Deck() {
		
		String[] suits = { "Spades" , "Hearts" , "Diamonds" , "Clubs" };
		String[] titles = { "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten" , "Jack" , "Queen" , "King" , "Ace" };

		//nested for loop
		
		// this isn't correct, it will increment but not capture all values
		//but now it is correct
		for (int i = 0; i < titles.length; i++) {
			
			for (int j = 0; j < suits.length; j++) {
				name = titles[i] + " of " + suits[j];
				//System.out.println(name);
				holder = new Card(i+2, name);
				cards.add(holder);
			}
		}		
		shuffle();
		
	}
	
	
	public void shuffle() {
		
		//somehow shuffle them bitches up : complete? 
		//yes, complete, figured out the problems the null value exception as well
		
		while ( cards.size() > 0) {
			holder = cards.remove(rand.nextInt((cards.size())));
			deckHolder.add(holder);
		}
		cards.addAll(deckHolder);
		deckHolder.clear();
		
	}
	
	public Card draw() {
		
		// we want to check the deck size in the player class before the card is drawn
		holder = cards.get(0);
		
		cards.remove(0);
		
		return holder;
	}
	
	// I don't think I need getters or setters here

}