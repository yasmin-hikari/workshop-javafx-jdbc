package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Scene mainScene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); /*Instanciar um obj Loader para manipular a tela antes de carregar*/
			ScrollPane scrollPane = loader.load(); /*carrega a view*/
			
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);			
			
			mainScene = new Scene(scrollPane); /*cria a scene*/
			primaryStage.setScene(mainScene); /*cita a mainScene no Stage*/
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Scene getMainScene() {
		return mainScene;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
