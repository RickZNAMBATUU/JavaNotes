package com.mygui;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.*;

public class ClosingProgramProperly extends Application {

    private boolean answer;
    private Stage mainWindow;

    @Override
    public void start(Stage primaryStage) {
        mainWindow = primaryStage;
        mainWindow.setTitle("Main Window");
        StackPane layout = new StackPane();
        Label firstLabel = new Label("Welcome to main window!");
        Button firstButton = new Button("Click me!");
        firstButton.setOnAction(e -> closeProgram());
        layout.getChildren().addAll(firstLabel, firstButton);
        Scene scene = new Scene(layout, 350, 250);
        mainWindow.setScene(scene);
        mainWindow.setOnCloseRequest(e -> closeProgram()); // to manipulate the close button
        mainWindow.show();
    }

    private boolean ConfirmBox(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL); // the user cannot click anywhere
        window.setTitle(title);
        window.setMinWidth(250);

        Label firstLabel = new Label(message);
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        yesButton.setOnAction(e -> {answer = true;});
        noButton.setOnAction(e -> {answer = false;});

        VBox layout = new VBox(10);
        layout.getChildren().addAll(firstLabel, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        Scene secondScene = new Scene(layout, 250,250);
        window.setScene(secondScene);
        window.showAndWait();

        return answer;

    }

    private void closeProgram() {
        boolean result = ConfirmBox("Confirm Box", "Sure?");
        if(result)
            mainWindow.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
