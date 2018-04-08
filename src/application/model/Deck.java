package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
		ArrayList<Card> cards = new ArrayList<Card>();
		
		File input = new File(fileName);
		Scanner scanner;
		try {
			scanner = new Scanner(input);
			String currentLine,leftovers = "";
			int currentIndex = 0, lastPunctuation = 0;
			ArrayList<String> sentences = new ArrayList<String>();
			
			while(scanner.hasNextLine()) {
				currentLine = leftovers+scanner.nextLine();
				
				for(int a = 0; a < currentLine.length(); a++) {
					switch(currentLine.charAt(a)) {
					case'.':
					case'!':
					case'?':
						sentences.add( currentLine.substring(lastPunctuation, currentIndex+1) );
						lastPunctuation = currentIndex;
					default:
						currentIndex++;
					}
				}
				
				leftovers = currentLine.substring(lastPunctuation+1);
				
				currentIndex = 0;
				lastPunctuation = 0;
			}
			
			cards = makeCards(sentences);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ArrayList<Card>();
	}
	
	public ArrayList<Card> makeCards(ArrayList<String> sentences) {
		ArrayList<Card> cards = new ArrayList<Card>();
		
		for( int a = 0; a < sentences.size(); a++) {
			cards.add(analyzeSentence(sentences.get(a)));
		}
		
		return cards;
	}
	
	
	public Card analyzeSentence(String sentence) {
		String answer = "";
		String question = "";
		
		String[] words = sentence.split(" ");
		
		//TODO: Make a blank space in sentence and assign it to question
		//TODO: assign answer to answer
		return new Card(question,answer);
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
