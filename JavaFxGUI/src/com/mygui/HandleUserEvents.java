package com.mygui;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HandleUserEvents extends Application implements EventHandler<ActionEvent>{
    // need to inherit the EventHandler Interface
    private Button firstButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        window.setTitle("This is the title");
        firstButton = new Button("Click me!");
        firstButton.setOnAction(this); // it will do what handle method is doing

        StackPane layout = new StackPane();
        layout.getChildren().add(firstButton);

        Scene mainScene = new Scene(layout, 500, 500);
        window.setScene(mainScene);
        window.show();
    }

    // need to override for handling events
    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == firstButton) { // for it to know what button you want to handle this event
            System.out.println("This is my first GUI in JAVA");
        }
    }

}
