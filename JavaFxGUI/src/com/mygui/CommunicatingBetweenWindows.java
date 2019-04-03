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

public class CommunicatingBetweenWindows extends Application { // no need to implement the EventHandler Interface

    private boolean answer;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        window.setTitle("Main Window");
        Button firstButton = new Button("Go to another window!");
        firstButton.setOnAction(e -> {
            boolean result = ConfirmBox("Second Window", "Are you sure?");
            System.out.print(result);
        }); // use a method to manipulate it

        StackPane layout = new StackPane();
        layout.getChildren().addAll(firstButton);
        Scene mainScene = new Scene(layout, 500, 500);

        window.setScene(mainScene);
        window.show();
    }

    private boolean ConfirmBox(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL); // the user cannot click anywhere
        window.setTitle(title);
        window.setMinWidth(250);

        Label firstLabel = new Label(message);
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });

        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(firstLabel, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        Scene secondScene = new Scene(layout, 250,250);
        window.setScene(secondScene);
        window.showAndWait();

        return answer;
    }

    public static void main(String[] args) {
        launch(args);
    }

}

