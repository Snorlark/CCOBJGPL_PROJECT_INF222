package Settings;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Home.HomeController;
import Login_Signup.RegisterController;
import Login_Signup.SignupController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SettingsController implements Initializable{

    @FXML
    private Label usernameLabel;

    @FXML
    private Label usernameLabel1;
   
    @FXML
    private Label nameLabel;

    @FXML
    private Label contactNoLabel;

    @FXML
    private Label addressLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label birthdayLabel; 

    @FXML
    private AnchorPane userEditPane;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField contactNoTextField;

    @FXML
    private TextField addressTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField birthdayTextField;

    @FXML 
    private Pane editButton;

    public static int count = 0;

    public static String name = "";
    public static String contactNo = "";
    public static String address = "";
    public static String email = "";
    public static String birthday = "";
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        if (count == 0) {
            name = RegisterController.firstName + " " + RegisterController.lastName;
            contactNo = RegisterController.contactNo;
            address = RegisterController.address;
            email = RegisterController.email;
            birthday = RegisterController.birthday;;
        }

        usernameLabel.setText("@" + SignupController.username);
        nameLabel.setText(name);
        contactNoLabel.setText(contactNo);
        addressLabel.setText(address);
        emailLabel.setText(email);
        birthdayLabel.setText(birthday);

    }

    public void userEdit (MouseEvent event) throws IOException {

        userEditPane.setVisible(true);
        editButton.setDisable(true);

        usernameLabel1.setText("@" + SignupController.username);
        nameTextField.setText(name);
        contactNoTextField.setText(contactNo);
        addressTextField.setText(address);
        emailTextField.setText(email);
        birthdayTextField.setText(birthday);     
        
    }

    public void editDone (MouseEvent event) throws IOException {

        userEditPane.setVisible(false);
        editButton.setDisable(false);

        SettingsController.name = nameTextField.getText();
        SettingsController.contactNo = contactNoTextField.getText();
        SettingsController.address = addressTextField.getText();
        SettingsController.email = emailTextField.getText();
        SettingsController.birthday = birthdayTextField.getText();

        nameLabel.setText(name);
        contactNoLabel.setText(contactNo);
        addressLabel.setText(address);
        emailLabel.setText(email);
        birthdayLabel.setText(birthday); 

        SettingsController.count = 1;

    }
    
    public void goBack(MouseEvent event) throws IOException {

        if (HomeController.count == 1) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Home/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }
        
        else if (HomeController.count == 2) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Products/Products.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }

    }

    public void logout(MouseEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login_Signup/Login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

}