package com.mygui;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;
import javafx.geometry.Insets;

public class ComboBoxes extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Stage window = primaryStage;
        ComboBox<String> comboBx = new ComboBox<>();
        comboBx.getItems().addAll("IT", "CS", "CE", "ARCHI");
        comboBx.setPromptText("Courses:");  // default value
        comboBx.setOnAction(e -> System.out.println(comboBx.getValue())); // automatic do something
        comboBx.setEditable(true); // the user can type option

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(comboBx);
        Scene mainScene = new Scene(layout, 250, 250);
        window.setTitle("Main Window");
        window.setScene(mainScene);
        window.show();
    }
}
