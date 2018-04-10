package application.controller;

import javafx.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
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
	
	public static File pdfFile;
	public static File txtFile;
	
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
		//TODO: 1. Set primaryLabel to next question in list.
		hideNode(yesButton);
		hideNode(noButton);
		hideNode(correctText);
		
		
		
	}
	
	
	public void handlePrevious(ActionEvent event) {
		//TODO: 1. Set primaryLabel to previous question in list.
		hideNode(yesButton);
		hideNode(noButton);
		hideNode(correctText);
		
		
		
	}
	
	public void handleFlip(MouseEvent event) {
		//TODO: 1. Set primaryLabel to answered question.
		//      2. Set secondaryLabel to question
		revealNode(yesButton);
		revealNode(noButton);
		revealNode(correctText);
		
		
	}
	
	public void handleYes(ActionEvent event) {
		//TODO: Register that the flashcard was answered correctly.
		hideNode(yesButton);
		hideNode(noButton);
		hideNode(correctText);
		
		
		
	}
	
	public void handleNo(ActionEvent event) {
		//TODO: Register that the flashcard was answered incorrectly.
		
		
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
