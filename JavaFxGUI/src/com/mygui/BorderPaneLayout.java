package com.mygui;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class BorderPaneLayout extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Main Window");

        HBox menu = new HBox();
        Button fileButton = new Button("File");
        Button editButton = new Button("Edit");
        Button viewButton = new Button("View");
        menu.getChildren().addAll(fileButton, editButton, viewButton);

        VBox leftMenu = new VBox();
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane centerMenu = new BorderPane();
        centerMenu.setTop(menu);
        centerMenu.setRight(leftMenu);

        Scene mainScene = new Scene(centerMenu, 250, 250);
        window.setScene(mainScene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
