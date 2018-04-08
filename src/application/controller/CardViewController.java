package application.controller;

import javafx.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.model.Card;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

public class CardViewController implements EventHandler<ActionEvent>, Initializable{
	
	@FXML
	Button yesButton;
	
	@FXML
	Button noButton;
	
	@FXML
	Text correctText;
	
	@FXML
	Button uploadButton;
	
	@FXML
	Label primaryLabel;
	
	@FXML
	Label secondaryLabel;
	
	@FXML
	Label scoreLabel;
	
	@FXML
	Label niceLabel;
	
	@FXML
	Label wrongLabel;
	
	public static File pdfFile;
	public static File txtFile;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		hideNode(yesButton);
		hideNode(noButton);
		hideNode(correctText);
		hideNode(niceLabel);
		hideNode(wrongLabel);
		
		

	}
	
	//Sets the opacity of a node so that it isn't shown
	public void hideNode(Node node) {
		node.setOpacity(0.0);
	}
	
	//Sets the opacity of a node so that it is shown
	public void revealNode(Node node) {
		node.setOpacity(1.0);
	}
	
	public void handleChoose(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		txtFile = fileChooser.showOpenDialog(null);
		
		if( txtFile!=null )
			System.out.println( txtFile.getAbsolutePath() );
		else
			System.out.println("User chose to cancel operation");
	}
	
	public void handleUpload(ActionEvent event) { 
		FileChooser fileChooser = new FileChooser();
		pdfFile = fileChooser.showOpenDialog(null);
		
		if( pdfFile!=null )
			System.out.println( pdfFile.getAbsolutePath() );
		else
			System.out.println("User chose to cancel operation");
	}
	
	
	public void handleNext(ActionEvent event) {
		nextCard();
		secondaryLabel.setText("");
		primaryLabel.setText(Main.deck.cards.get(Main.deck.getCurrentCard()).getQuestion());
		hideNode(yesButton);
		hideNode(noButton);
		hideNode(correctText);
		hideNode(niceLabel);
		hideNode(wrongLabel);
	}
	
	
	public void handlePrevious(ActionEvent event) {
		previousCard();
		updateScore(Main.deck.cards.get(Main.deck.getCurrentCard()));
		secondaryLabel.setText("");
		primaryLabel.setText(Main.deck.cards.get(Main.deck.getCurrentCard()).getQuestion());
		hideNode(yesButton);
		hideNode(noButton);
		hideNode(correctText);	
		hideNode(niceLabel);
		hideNode(wrongLabel);
	}
	
	public void handleFlip(MouseEvent event) {
		secondaryLabel.setText(Main.deck.cards.get(Main.deck.getCurrentCard()).getQuestion());
		primaryLabel.setText(Main.deck.cards.get(Main.deck.getCurrentCard()).getAnswer());
		revealNode(yesButton);
		revealNode(noButton);
		revealNode(correctText);		
	}
	
	public void handleYes(ActionEvent event) {
		correctAnswer(Main.deck.cards.get(Main.deck.getCurrentCard()));
		hideNode(yesButton);
		hideNode(noButton);
		hideNode(correctText);
		revealNode(niceLabel);
	}
	
	public void handleNo(ActionEvent event) {
		hideNode(yesButton);
		hideNode(noButton);
		hideNode(correctText);
		hideNode(wrongLabel);
			
	}
	
	public void correctAnswer(Card c) {
		c.setTimesCorrect(c.getTimesCorrect() + 1);
	}
	
	public void viewAnswer(Card c) {
		c.setTimesAsked(c.getTimesAsked() + 1);
	}
	
	public void updateScore(Card c) {
		scoreLabel.setText("Times Correct: "+c.getTimesCorrect()+
						   " Times Viewed: "+c.getTimesAsked()+ 
						   " Score: %"+c.calculatePercentage());
	}
	
	public void nextCard() {
		if(Main.deck.getCurrentCard() < Main.deck.getCards().size())
			Main.deck.setCurrentCard(Main.deck.getCurrentCard() + 1);
		else if(Main.deck.getCurrentCard() == Main.deck.getCards().size())
			Main.deck.setCurrentCard(0);
	}
	
	public void previousCard() {
		if(Main.deck.getCurrentCard() > 1)
			Main.deck.setCurrentCard(Main.deck.getCurrentCard() - 1);
		else if(Main.deck.getCurrentCard() == 0)
			Main.deck.setCurrentCard(Main.deck.getCards().size() - 1);
			
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}