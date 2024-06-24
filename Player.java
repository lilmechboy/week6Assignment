package week6Assignment;

import java.util.*;

public class Player {

	
	// hand probably an arrayLIST
	List<Card> hand = new ArrayList<Card>();
	String name;
	int score = 0;

	
	//
	
	
	public void describe() {
		
		System.out.println("Player : " + name);
		System.out.println("Score : " + score);
		
		for (int i = 0; i < hand.size(); i++) {
			// blah blah blah something something
		}
			
	}
		
		
	public void flip() {
			
	}
		
	// potential errors until later, gotta fix this deck?
	public void draw(Deck deck) {
		hand.add(deck.draw(deck));
	}
		
		
	public void incrementScore() {
			score = score +1;
	}
	
	
	public void getHand() {
		
	}
	
	public void setHand() {
		
	}
	
	
	public int getScore() {
		
		return score;
	}
	
	public void setScore(int score) {
		
		this.score = score;
	}
	
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
}
