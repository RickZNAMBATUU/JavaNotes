package com.mygui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwitchingScenes extends Application {

    private Stage window;
    private Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        // First Button
        Label firstLabel = new Label("Welcome to First Scene");
        Button firstButton = new Button("Go to Scene 2");
        firstButton.setOnAction(e -> window.setScene(scene2));

        // First Layout - children/widget are laid out in vertical column
        VBox firstLayout = new VBox(20);
        firstLayout.getChildren().addAll(firstLabel, firstButton);
        scene1 = new Scene(firstLayout, 200, 200);

        // Second Button
        Label secondLabel = new Label("Welcome to Second Scene");
        Button secondButton = new Button("Go back to Scene 1");
        secondButton.setOnAction(e -> window.setScene(scene1));

        // Second Layout - children/widget are all in the middle
        StackPane secondLayout = new StackPane();
        secondLayout.getChildren().addAll(secondLabel, secondButton);
        scene2 = new Scene(secondLayout, 500, 200);

        window.setScene(scene1);
        window.setTitle("Switching Scenes");
        window.show();
    }
}
