package application.controller;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class CardViewController implements EventHandler<ActionEvent>, Initializable{
	
	@FXML
	Button yesButton;
	
	@FXML
	Button noButton;
	
	@FXML
	Text correctText;
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		hideNode(yesButton);
		hideNode(noButton);
		hideNode(correctText);
		
		

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
		//TODO: Choose .txt file that has been generated from a PDF already
		
		
		
	}
	
	public void handleUpload(ActionEvent event) {
		//TODO: Choose PDF file 
		
		
		
	}
	
	
	public void handleNext(ActionEvent event) {
		//TODO: 1. Set primaryLabel to next question in list.
		//      2. Set yesButton, noButton, and correctText to invisible.
		
		
		
	}
	
	
	public void handlePrevious(ActionEvent event) {
		//TODO: 1. Set primaryLabel to previous question in list.
        //      2. Set yesButton, noButton, and correctText to invisible.
		
	}
	
	public void handleFlip(ActionEvent event) {
		//TODO: 1. Set primaryLabel to answered question.
		//      2. Set secondaryLabel to question
		//      3. Set yesButton, noButton, and correctText to invisible.
		
		
	}
	
	public void handleYes(ActionEvent event) {
		//TODO: Register that the flashcard was answered correctly.
		
		
		
	}
	
	public void handleNo(ActionEvent event) {
		//TODO: Register that the flashcard was answered incorrectly.
		
		
		
	}


	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
