package application.model;

import java.util.ArrayList;

public class Deck {
	////////class variables//////
	ArrayList<Card> cards = new ArrayList<Card>();
	
	////constructors//////
	public Deck(String fileName) {
		cards = generateCards(fileName);
	}
	
	//////methods////////
	public ArrayList<Card> generateCards(String fileName) {
		//TODO: read in from file and make flash cards with cprresponding questions and answers
		
		return new ArrayList<Card>();
	}
	
	//////getters and setters//////
	
}
