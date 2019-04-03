package com.mygui;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CreatingBasicWindow extends Application { // need to inherit the Application class

    Stage window; // declaring stage variable

    public static void main(String[] args) {
        launch(args); // it will setup your program. (default)
    }

    // needs to override from the Application class
    @Override
    public void start(Stage primaryStage) throws Exception {
        // main javafx code
        // stage - entire window
        // scene - content inside the stage
        window = primaryStage; // primary is the main stage and assigning it to new variable
        window.setTitle("This is the title"); // primary window and title method
        Button firstButton = new Button("Click me!"); // to create buttons with text
        Button secondButton = new Button("Submit!");
        Button thirdButton = new Button("Upload!");

        // position your widgets to the middle
        StackPane layout = new StackPane(); // layout to position your widgets to your scene
        layout.getChildren().add(firstButton); // to put your widgets to the scene (if one widget only)
        layout.getChildren().addAll(secondButton, thirdButton); // to put all your widgets to the scene (if more than one)

        Scene mainScene = new Scene(layout, 500, 500); // create a scene
        window.setScene(mainScene);  // to put your layout into the scene
        window.show(); // to display the scene to the stage
    }
}
