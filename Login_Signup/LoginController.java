package Login_Signup;

import java.io.IOException;

import Alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController{

    @FXML
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;

    @FXML
    private Label showPasswordLabel;

    static String username;
    static String password;


    public void login (ActionEvent event) throws IOException {

        String username1 = usernameField.getText();
        String password1 = passwordField.getText();

        if (username1.isEmpty() || password1.isEmpty() ) {

            AlertMaker.showErrorAlert("Log in", "Fill out the important fields"); 
        }

        else if (username == null || password == null) {

            AlertMaker.showErrorAlert("Log in", "Account doesn't exist");
        }

        else if (username.equals(username1) && password.equals(password1)) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Home/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    
        }
        
        else {

            AlertMaker.showErrorAlert("Login Error", "Username/Password is wrong");
        }
       
    }
    
    public void showPassword (MouseEvent event) throws IOException {
        
        String pass = passwordField.getText();
        showPasswordLabel.setText(pass);
        showPasswordLabel.setLayoutY(232);       

    }

    public void hidePassword (MouseEvent event) throws IOException {
        
        showPasswordLabel.setLayoutY(413);       

    }
    
    
    public void goToSignup(MouseEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login_Signup/Signup.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
