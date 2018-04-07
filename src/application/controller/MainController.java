package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MainController implements EventHandler<ActionEvent>{
	
	
	public void handleChoose(ActionEvent event) {
		//TODO: Choose a pre-existing .txt file
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/CardView.fxml"));
			Main.stage.setScene(new Scene(root, 500, 600));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public void handleUpload(ActionEvent event) {
		//TODO: Choose PDF file and run corresponding extraction methods
		
		
	}


	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
