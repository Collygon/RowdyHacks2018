package application.model;

import java.util.ArrayList;

public class Deck {
	////////class variables//////
	public ArrayList<Card> cards = new ArrayList<Card>();
	public int currentCard = 0;
	
	////constructors//////
	public Deck(String fileName) {
		cards = generateCards(fileName);
	}
	
	//////methods////////
	public ArrayList<Card> generateCards(String fileName) {
		//TODO: read in from file and make flash cards with corresponding questions and answers
		
		return new ArrayList<Card>();
	}

	
	//////getters and setters//////
	public ArrayList<Card> getCards() {
		return cards;
	}
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public int getCurrentCard() {
		return currentCard;
	}
	public void setCurrentCard(int currentCard) {
		this.currentCard = currentCard;
	}
	
	
}
