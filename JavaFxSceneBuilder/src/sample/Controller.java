package sample;

import javafx.fxml.FXML;
import java.sql.*;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller implements Initializable {

    @FXML
    private TextField pass;

    @FXML
    private Button loginButton;

    @FXML
    private TextField name;

    @FXML
    private TextArea usernameDisplay;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Loading user data...");
    }

    public void handleButtonAction(ActionEvent event) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:loginSample.db");
            usernameDisplay.setText("Database Connected");
            ps = conn.prepareStatement("SELECT * FROM userInfo WHERE USERNAME = ? AND PASSWORD = ?");
            ps.setString(1, name.getText());
            ps.setString(2, pass.getText());
            rs = ps.executeQuery();

            if(rs.next()) {
                usernameDisplay.setText(name.getText());

            } else {
                usernameDisplay.setText("failed to login");
            }

        } catch (ClassNotFoundException e) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void sayAnything() {
        usernameDisplay.setText("GAGO");
    }
}
