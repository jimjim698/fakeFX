package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		 FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Main-Ui.fxml"));
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Program has launched");
<<<<<<< HEAD
		System.out.println("Which branch will this show up in?");
=======
		System.out.println("new branch print");
>>>>>>> branch 'master' of git@github.com:jimjim698/fakeFX.git
		launch(args);
	}
}
