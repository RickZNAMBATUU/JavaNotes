package com.mygui;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.ChoiceBox;
import javafx.geometry.Insets;

public class ChoiceBoxes extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Stage window = primaryStage;
        ChoiceBox <String> choiceBx = new ChoiceBox<>();
        choiceBx.getItems().addAll("Blue", "Red", "Green", "Yellow");
        choiceBx.setValue("Red"); // default initial value
        choiceBx.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue) -> System.out.println(newValue)); //

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(choiceBx);
        Scene mainScene = new Scene(layout, 250, 250);
        window.setTitle("Main Window");
        window.setScene(mainScene);
        window.show();
    }
}
