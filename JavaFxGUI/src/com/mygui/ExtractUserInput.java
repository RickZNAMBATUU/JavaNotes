package com.mygui;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.geometry.Insets;

public class ExtractUserInput extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Main Window");

        // setup layout
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(8);
        layout.setHgap(10);

        // title
        Label titleLabel = new Label("Login Form");
        GridPane.setConstraints(titleLabel, 0, 0);

        // username
        Label nameLabel = new Label("Username: ");
        GridPane.setConstraints(nameLabel, 0, 1);
        TextField nameInput = new TextField();
        nameInput.setPromptText("enter username here");
        GridPane.setConstraints(nameInput, 1, 1);

        // password
        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel, 0, 2);
        PasswordField passInput = new PasswordField();
        GridPane.setConstraints(passInput, 1, 2);

        // login button
        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> alreadyUser(nameInput, passInput));
        GridPane.setConstraints(loginButton, 1, 3);

        layout.getChildren().addAll(titleLabel, nameLabel, nameInput, passLabel, passInput, loginButton);
        Scene mainScene = new Scene(layout, 250, 250);
        window.setScene(mainScene);
        window.show();
    }

    private void alreadyUser(TextField name, PasswordField pass) {
        String username = name.getText();
        String password = pass.getText();

        if(username.equals("Fred") && password.equals("bakarickszyan04")) {
            System.out.println("Login Successfully!");
        } else {
            System.out.println("Invalid input!");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
