package application;

import application.model.Deck;
import application.model.Dictionary;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	public static Stage stage;
	public static Deck deck;
	public static Dictionary dictionary = new Dictionary();
	
	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation( Main.class.getResource("../Main.fxml") );
			
			AnchorPane layout = (AnchorPane) loader.load();				
			Scene scene = new Scene( layout );
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			System.out.println(dictionary.getNouns());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

