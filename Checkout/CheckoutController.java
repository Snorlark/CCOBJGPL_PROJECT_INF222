package Checkout;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Home.HomeController;
import Login_Signup.RegisterController;
import Login_Signup.SignupController;
import Settings.SettingsController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CheckoutController implements Initializable{

    @FXML
    Label item1, item2, item3, item4, item5, item6, item7, item8, item9, price1, price2, price3, price4, price5, price6, price7, price8, price9, prodtotal, totalpayment, shippingtotal;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;
    
    @FXML
    private Text nameDisplay;

    @FXML
    private Text contactNoDisplay;

    @FXML
    private Text addressDisplay;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private ChoiceBox modeofpayment;

    @FXML
    public static int count = 0;

    public static String name, address, contactNo;

    @FXML
    ObservableList<String> modeofpaymentlist = FXCollections.observableArrayList("GCash", "Cash on Delivery");
    
    @FXML
    private void initialize() {
        modeofpayment.setItems(modeofpaymentlist);
        modeofpayment.setValue("Cash on Delivery");
    }

    @Override
        //displays name, address, and contact no of user
        public void initialize(URL location, ResourceBundle resources) {
            if (count == 0) {
                name = RegisterController.firstName + " " + RegisterController.lastName;
                address = RegisterController.address;
                contactNo = RegisterController.contactNo;
        }
        nameDisplay.setText(name);
        contactNoDisplay.setText(contactNo);
        addressDisplay.setText(address);

        // ============== ITEM  ==================//
        item1.setText(HomeController.product1.getProductName());
        price1.setText(Double.toString(HomeController.product1.getProductPrice()));
        Image image1 = new Image(HomeController.product1.getProductImage());
        img1.setImage(image1);

        // ============== ITEM 2 ==================//
        item2.setText(HomeController.product2.getProductName());
        price2.setText(Double.toString(HomeController.product2.getProductPrice()));
        Image image2 = new Image(HomeController.product2.getProductImage());
        img2.setImage(image2);

        // ============== ITEM 3 ==================//
        item3.setText(HomeController.product3.getProductName());
        price3.setText(Double.toString(HomeController.product3.getProductPrice()));
        Image image3 = new Image(HomeController.product3.getProductImage());
        img3.setImage(image3);

        // ============== ITEM 4 ==================//
        item4.setText(HomeController.product4.getProductName());
        price1.setText(Double.toString(HomeController.product4.getProductPrice()));
        Image image4 = new Image(HomeController.product4.getProductImage());
        img4.setImage(image4);

        // ============== ITEM 5 ==================//
        item5.setText(HomeController.product5.getProductName());
        price5.setText(Double.toString(HomeController.product5.getProductPrice()));
        Image image5 = new Image(HomeController.product5.getProductImage());
        img5.setImage(image5);

     // ============== ITEM 6 ==================//
        item6.setText(HomeController.product6.getProductName());
        price6.setText(Double.toString(HomeController.product6.getProductPrice()));
        Image image6 = new Image(HomeController.product6.getProductImage());
        img6.setImage(image6);

        // ============== ITEM 7 ==================//
        item7.setText(HomeController.product7.getProductName());
        price7.setText(Double.toString(HomeController.product7.getProductPrice()));
        Image image7 = new Image(HomeController.product7.getProductImage());
        img7.setImage(image7);

        // ============== ITEM 8 ==================//
        item8.setText(HomeController.product8.getProductName());
        price8.setText(Double.toString(HomeController.product8.getProductPrice()));
        Image image8 = new Image(HomeController.product8.getProductImage());
        img8.setImage(image8);

        // ============== ITEM 9 ==================//
        item9.setText(HomeController.product9.getProductName());
        price9.setText(Double.toString(HomeController.product9.getProductPrice()));
        Image image9 = new Image(HomeController.product9.getProductImage());
        img9.setImage(image9);

        

    }

    public void getInitialAmount() {

        double totalAmount = 0.00;
        

        if (HomeController.product1.getProductStatus()) {
            totalAmount += HomeController.product1.getProductPrice();
        }
        if (HomeController.product2.getProductStatus()) {
            totalAmount += HomeController.product2.getProductPrice();
        }
        if (HomeController.product3.getProductStatus()) {
            totalAmount += HomeController.product3.getProductPrice();
        }
        if (HomeController.product4.getProductStatus()) {
            totalAmount += HomeController.product4.getProductPrice();
        }
        if (HomeController.product5.getProductStatus()) {
            totalAmount += HomeController.product5.getProductPrice();
        }
        if (HomeController.product6.getProductStatus()) {
            totalAmount += HomeController.product6.getProductPrice();
        }
        if (HomeController.product7.getProductStatus()) {
            totalAmount += HomeController.product7.getProductPrice();
        }
        if (HomeController.product8.getProductStatus()) {
            totalAmount += HomeController.product8.getProductPrice();
        }
        if (HomeController.product9.getProductStatus()) {
            totalAmount += HomeController.product9.getProductPrice();
        }
        

        prodtotal.setText(Double.toString(totalAmount)); 
    } 

    //goes back (lol di ko pa napapagana)
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

    // Goes to Productselect.fxml
    public void gotoProductselect(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Products/Products.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Userprofile.fxml
    public void gotoUserprofile(ActionEvent event) throws IOException {
        
        HomeController.count = 1;

        Parent root = FXMLLoader.load(getClass().getResource("/Settings/Settings.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

        SettingsController.count = 1;
        
    }
    //Goes to Receipt.fxml
    public void gotoReceipt(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Receipt/Receipt.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Productselect.fxml
    public void gotoCheckoutController(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Checkout/Checkout.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }    

    // Goes to Cart.fxml
    /*public void gotoCart(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Products/Cart.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }*/


}