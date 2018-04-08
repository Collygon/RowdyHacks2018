package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import application.Main;

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
						sentences.add( currentLine.substring(lastPunctuation == 0 ? lastPunctuation : lastPunctuation+1, currentIndex).trim() );
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
		
		
		return cards;
	}
	
	public ArrayList<Card> makeCards(ArrayList<String> sentences) {
		ArrayList<Card> cards = new ArrayList<Card>();
		
		for( int a = 0; a < sentences.size(); a++) {
			cards.add(analyzeSentence(sentences.get(a)));
		}
		
		
		return cards;
	}
	
	
	public Card analyzeSentence(String sentence) {
		ArrayList<String> answer = new ArrayList<String>();
		String question = "";
		String[] words = sentence.split(" ");
		char[] tags = getTags(words);
		
		int lastVerb = findLastVerb(tags);
		
		int count = 0;
		for(int x = words.length-1; x >= lastVerb; x--) {
			if(tags[x] == 'n' && count < 2)
			{	answer.add(0,words[x]);
				words[x] = "_______";
				count++;
			}
		}
		
		for(int x = 0; x < words.length; x++) {
			question += words[x] + " ";
			
		}
		System.out.println("Question: "+question+"\nAnswer:"+answer);
		//TODO: Make a blank space in sentence and assign it to question
		//TODO: assign answer to answer
		return new Card(question,answer);
	}
	
	public int findLastVerb(char[] tags) {
		int lastVerb = 2;
		
		for(int x = tags.length-1; x >= 0; x--) {
			if(tags[x] == 'v'){
				lastVerb = x;
				break;
			}
		}
		return lastVerb;
	}

	public char getTag(String word) {
		
		if(Main.dictionary.isPreposition(word) || Main.dictionary.isPreposition(word.toLowerCase()))
			return 'p';
		if(Main.dictionary.isAdjective(word) || Main.dictionary.isAdjective(word.toLowerCase()))
			return 'a';
		
		if(Main.dictionary.isAdverb(word) || Main.dictionary.isAdverb(word.toLowerCase()))
			return 'v';
		
		if(Main.dictionary.isVerb(word) || Main.dictionary.isVerb(word.toLowerCase()))	
			return 'v';
		
		if(Main.dictionary.isNoun(word) || Main.dictionary.isNoun(word.toLowerCase()))
			return 'n';

		return ' ';
		
	}
	
	public char[] getTags(String[] words) {
		char[] tags = new char[words.length];
		
		for(int x = 0; x < words.length; x++) {
			tags[x] = getTag(words[x]);
		}
		
		return tags;
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
