package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Dictionary {

	TreeSet<String> nouns = new TreeSet<String>();
	TreeSet<String> verbs = new TreeSet<String>();
	TreeSet<String> adverbs = new TreeSet<String>();
	TreeSet<String> adjectives = new TreeSet<String>();
	TreeSet<String> prepositions = new TreeSet<String>();
	
	public Dictionary() {
		initializeNouns();
		initializeVerbs();
		initializeAdverbs();
		initializeAdjectives();
		initializePrepositions();
	}
	
	public boolean isPreposition(String word) {
		if(prepositions.contains(word))
			return true;
		return false;
	}
	
	public boolean isNoun(String word) {
		if( nouns.contains(word) )
			return true;
		return false;
	}
	public boolean isVerb(String word) {
		if( verbs.contains(word) )
			return true;
		return false;
	}
	public boolean isAdverb(String word) {
		if( adverbs.contains(word) )
			return true;
		return false;
	}
	public boolean isAdjective(String word) {
		if( adjectives.contains(word) )
			return true;
		return false;
	}
	
	  ////////////////////////////////////////////////////////////////////
	 //each of the initialize methods populate trees based on txt files//
	////////////////////////////////////////////////////////////////////
	public void initializePrepositions() {
		File file = new File("prepositions.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			String currentLine;
			while(scanner.hasNextLine()) {
				currentLine = scanner.nextLine();
				prepositions.add(currentLine);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initializeNouns() {
		File file = new File("91K nouns.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			String currentLine;
			while(scanner.hasNextLine()) {
				currentLine = scanner.nextLine();
				nouns.add(currentLine);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initializeVerbs() {
		File file = new File("31K verbs.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			String currentLine;
			while(scanner.hasNextLine()) {
				currentLine = scanner.nextLine();
				verbs.add(currentLine);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initializeAdverbs() {
		File file = new File("6K adverbs.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			String currentLine;
			while(scanner.hasNextLine()) {
				currentLine = scanner.nextLine();
				adverbs.add(currentLine);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initializeAdjectives() {
		File file = new File("28K adjectives.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			String currentLine;
			while(scanner.hasNextLine()) {
				currentLine = scanner.nextLine();
				adjectives.add(currentLine);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////

	////////getters and setters/////////
	public TreeSet<String> getNouns() {
		return nouns;
	}

	public void setNouns(TreeSet<String> nouns) {
		this.nouns = nouns;
	}

	public TreeSet<String> getVerbs() {
		return verbs;
	}

	public void setVerbs(TreeSet<String> verbs) {
		this.verbs = verbs;
	}

	public TreeSet<String> getAdverbs() {
		return adverbs;
	}

	public void setAdverbs(TreeSet<String> adverbs) {
		this.adverbs = adverbs;
	}

	public TreeSet<String> getAdjectives() {
		return adjectives;
	}

	public void setAdjectives(TreeSet<String> adjectives) {
		this.adjectives = adjectives;
	}
	
}
