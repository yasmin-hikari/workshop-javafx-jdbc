package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); /*Instanciar um obj Loader para manipular a tela antes de carregar*/
			Parent parent = loader.load(); /*carrega a view*/
			Scene mainScene = new Scene(parent); /*cria a scene*/
			primaryStage.setScene(mainScene); /*cita a mainScene no Stage*/
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
