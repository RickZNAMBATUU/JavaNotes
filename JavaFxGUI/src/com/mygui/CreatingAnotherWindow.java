package com.mygui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class CreatingAnotherWindow extends Application { // no need to implement the EventHandler Interface

    private Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Main Window");
        Button firstButton = new Button("Go to another window!");
        firstButton.setOnAction(e -> anotherWindow("Second Window", "Are you sure?")); // use the method to access second window

        StackPane layout = new StackPane();
        layout.getChildren().addAll(firstButton);
        Scene mainScene = new Scene(layout, 500, 500);

        window.setScene(mainScene);
        window.show();
    }

    private static void anotherWindow(String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL); // the user cannot click anywhere
        window.setTitle(title);
        window.setMinWidth(250);

        Label firstLabel = new Label(message);
        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(firstLabel, closeButton);
        layout.setAlignment(Pos.CENTER);
        Scene secondScene = new Scene(layout, 250,250);
        window.setScene(secondScene);
        window.showAndWait(); // blocks processing of the current event
    }

    // don't need the handle method anymore

}

