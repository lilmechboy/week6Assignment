package week6Assignment;

public class Card {
	
	
	
	public int value;
	public String name;
	
	public Card() {};

	
	public Card(int value, String name) {
		
		this.value = value;
		this.name = name;
	}
	
	
	public int getValue() {
		
		return value;
	}
	
	
	public void setValue(int value) {
		
		this.value = value;
	}
	
	
	public String getName() {
		
		return name;
	}
	
	
	public void setName(String name) {
		
		this.name = name;
	}
}
