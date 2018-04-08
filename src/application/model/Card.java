package application.model;

public class Card {
	///////class variables////////
	String question;
	String answer;
	double priority = 1;
	public int timesAsked = 0;
	public int timesCorrect = 0;
	
	/////constructors
	public Card(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	
	//////methods/////////
	public double calculatePercentage() {
		return (timesCorrect/timesAsked)*100;
	}
	

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

	public double getPriority() {
		return priority;
	}
	public void setPriority(double priority) {
		this.priority = priority;
	}

	public int getTimesAsked() {
		return timesAsked;
	}
	public void setTimesAsked(int timesAsked) {
		this.timesAsked = timesAsked;
	}

	public int getTimesCorrect() {
		return timesCorrect;
	}
	public void setTimesCorrect(int timesCorrect) {
		this.timesCorrect = timesCorrect;
	}
	
	
}