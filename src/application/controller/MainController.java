package application.controller;

import java.io.File;
import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;

public class MainController implements EventHandler<ActionEvent>{
	
	public static File pdfFile;
	public static File txtFile;
	
	public void handleChoose(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		txtFile = fileChooser.showOpenDialog(null);
		
		if( txtFile!=null ) {
			System.out.println( txtFile.getAbsolutePath() );
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/CardView.fxml"));
				Main.stage.setScene(new Scene(root, 500, 600));
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		else
			System.out.println("User chose to cancel operation");
		
	}
	
	public void handleUpload(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		pdfFile = fileChooser.showOpenDialog(null);
		
		if( pdfFile!=null ) {
			System.out.println( pdfFile.getAbsolutePath() );
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/CardView.fxml"));
				Main.stage.setScene(new Scene(root, 500, 600));
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		else
			System.out.println("User chose to cancel operation");
		
	}


	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
