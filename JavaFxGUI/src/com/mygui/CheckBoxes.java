package com.mygui;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.geometry.Insets;

public class CheckBoxes extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Main Window");

        Label title = new Label("Choose a course: ");
        CheckBox itCourse = new CheckBox("IT");
        CheckBox comSciCourse = new CheckBox("Computer Science");
        CheckBox engineeringCourse = new CheckBox("Engineer");
        itCourse.setSelected(true);

        Button chooseButton = new Button("Choose Now!");
        chooseButton.setOnAction(e -> handleOptions(itCourse, comSciCourse, engineeringCourse));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(title, itCourse, comSciCourse, engineeringCourse, chooseButton);
        Scene mainScene = new Scene(layout, 250, 250);
        window.setScene(mainScene);
        window.show();

    }

    private void handleOptions(CheckBox box1, CheckBox box2, CheckBox box3) {
        String message = "Users order\n";
        if(box1.isSelected()) {
            message += "IT\n";
        }

        if(box2.isSelected()) {
            message += "Computer Science\n";
        }

        if(box3.isSelected()) {
            message += "Engineer\n";
        }

        System.out.println(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
