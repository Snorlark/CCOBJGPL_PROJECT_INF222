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


public class SignupController{
    
    @FXML
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;

    @FXML
    private Label showPasswordLabel;
 

    public void signup (ActionEvent event) throws IOException {    
        
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        LoginController.username = username; 
        LoginController.password = password;

        if (username.isEmpty() || password.isEmpty()) {

            AlertMaker.showErrorAlert("Sign Up", "Fill out the important fields");
            
        }
        
        else {
        
            AlertMaker.showSuccessfulAlert("Sign Up", "You have been succesfully signed in");
        
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login_Signup/Login.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        }
                
    }

    public void showPassword (MouseEvent event) throws IOException {
        
        String pass = passwordField.getText();
        showPasswordLabel.setText(pass);
        showPasswordLabel.setLayoutY(229);       

    }

    public void hidePassword (MouseEvent event) throws IOException {
        
        showPasswordLabel.setLayoutY(413);       

    }

    public void goToLogin(MouseEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login_Signup/Login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
