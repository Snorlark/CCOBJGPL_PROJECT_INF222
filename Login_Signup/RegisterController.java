package Login_Signup;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RegisterController implements Initializable{
    
    @FXML
    private Label mabuhayLabel;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField contactNoField;

    @FXML
    private DatePicker birthdayField;

    @FXML
    private TextField addressField;

    @FXML
    private CheckBox checkBoxField;

    @FXML
    private AnchorPane terms_conditions;

    @FXML
    private AnchorPane privacy_policy;

    @FXML
    private Rectangle black_opacity;


    String username = SignupController.username;

    public static String firstName, lastName, email, contactNo, birthday, address, checkBox;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (username == SignupController.username)
        mabuhayLabel.setText("Mabuhay " + SignupController.username + ",");
        mabuhayLabel.setVisible(true);
    }

    public void Register (ActionEvent event) throws IOException {

        firstName = firstNameField.getText();
        lastName = lastNameField.getText();
        email = emailField.getText();
        contactNo = contactNoField.getText();
        address = addressField.getText();

        if (birthdayField.getValue() != null) {
            birthday = birthdayField.getValue().toString();
        }              

        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || contactNo.isEmpty() 
            || birthday == null || address.isEmpty() || checkBoxField.isSelected() == false) {

                AlertMaker.showErrorAlert("Register", "Fill out the important fields");
        }

        else {
            
        AlertMaker.showSuccessfulAlert("Register", "Your account is now created, you can log in now!");
        
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login_Signup/Login.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }

    }

    public void openTermsConditions (MouseEvent event) throws IOException {

        black_opacity.setVisible(true);
        terms_conditions.setVisible(true);
        
    }

    public void closeTermsConditions (MouseEvent event) throws IOException {

        black_opacity.setVisible(false);
        terms_conditions.setVisible(false);
        
    }

    public void openPrivacyPolicy (MouseEvent event) throws IOException {

        black_opacity.setVisible(true);
        privacy_policy.setVisible(true);
        
    }

    public void closePrivacyPolicy (MouseEvent event) throws IOException {

        black_opacity.setVisible(false);
        privacy_policy.setVisible(false);   
        
    }

}