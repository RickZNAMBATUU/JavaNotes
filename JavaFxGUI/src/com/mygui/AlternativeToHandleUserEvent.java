package com.mygui;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AlternativeToHandleUserEvent extends Application { // no need to implement the EventHandler Interface

    private Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("This is the title");
        Button firstButton = new Button("Click me!");
        Button secondButton = new Button("Submit me!");
        // don't need the this keyword
        // first way to handle events
        firstButton.setOnAction(new EventHandler<ActionEvent>() { // Anonymous Inner Class
            @Override
            public void handle(ActionEvent event) {
                System.out.println("I am anonymous inner class!");
            }
        });

        // second way to handle events and the best way
        secondButton.setOnAction(e -> System.out.println("I am Lambda Expression")); // Lambda Expressions
        secondButton.setOnAction(e -> { // put braces if you want many statement to put
            System.out.println("1st Statement");
            System.out.println("2nd Statement");
        });

        StackPane layout = new StackPane();
        layout.getChildren().addAll(firstButton, secondButton);

        Scene mainScene = new Scene(layout, 500, 500);
        window.setScene(mainScene);
        window.show();
    }

    // don't need the handle method anymore

}

