import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class LandingScreen extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;


        window.setTitle("Choose what are you?");
        window.setScene(mainScene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
