package week6Assignment;

import java.util.*;

public class Player {

	
	// hand probably an arrayLIST
	List<Card> hand = new ArrayList<Card>();
	String name;
	int score;

	
	//
	public Player() {
		score = 0;
	}
	
	public Player(String name) {
		this.name = name;
		score = 0;
		
		
	}
	
	public void describe() {
		
		System.out.println("Player : " + name);
		System.out.println("Score : " + score);
		
		for (int i = 0; i < hand.size(); i++) {
			// blah blah blah something something
		}
			
	}	
		
	public Card flip() {
		return hand.remove(0);
				
	}
		
	// potential errors until later, gotta fix this deck?
	// I don't think that I need the deck input
	// I am required to have them
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
		
		
	public void incrementScore() {
			score = score +1;
	}

	
	public int getScore() {
		
		return score;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
}
