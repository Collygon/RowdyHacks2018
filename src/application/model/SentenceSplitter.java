package application.model;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SentenceSplitter
{

private ArrayList<String> Pronouns = new ArrayList<String>();
private ArrayList<String> Articles = new ArrayList<String>();
private ArrayList<String> Prepositions = new ArrayList<String>();
private ArrayList<String> currSentence = new ArrayList<String>();


	public void readFile(String fileName)
	{
		File input = new File(fileName);
		Scanner scanner;
		
		try 
		{
			String currLine;
			scanner = new Scanner(input);
			
			while (scanner.hasNextLine())
			{
				currLine = scanner.nextLine();
				createSentenceArray(currLine);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void lookForPunctuation(String currLine)
	{
		while()
		{
			
		}
	}
	
}