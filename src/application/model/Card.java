package application.model;

public class Card {
	///////class variables////////
	String question;
	String answer;
	boolean faceUp = false;
	double priority = 1;
	
	/////constructors
	public Card(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	
	//////methods/////////
	

	//////getters and setters///////
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isFaceUp() {
		return faceUp;
	}

	public void setFaceUp(boolean faceUp) {
		this.faceUp = faceUp;
	}

	public double getPriority() {
		return priority;
	}

	public void setPriority(double priority) {
		this.priority = priority;
	}
	
}