package Products.views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Alert.AlertMaker;
import Home.HomeController;
import Products.CartController;
import Products.ProductController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class View6Controller implements Initializable {

    @FXML
    Pane pane6;

    @FXML
    Label item6, price6;
    
    @FXML
    ImageView img6;

    @FXML
    private Button p6;

    @FXML
    static Parent homeRoot = null;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    FXMLLoader loader;

    public Object myvbox;

    public static int count = 0;

    public static Products.model.p6 product6 = new Products.model.p6();

    @Override
     public void initialize(URL location, ResourceBundle resources) {

        pane6.setVisible(true);
        item6.setText(Home.HomeController.product6.getProductName());
        String productprice6 = Double.toString(Home.HomeController.product6.getProductPrice());
        price6.setText("₱ " + productprice6);
        Image image6 = new Image(Home.HomeController.product6.getProductImage());
        img6.setImage(image6);
       
     }

    // Goes to Userprofile.fxml
    public void gotoUserprofile(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("/Settings/Settings.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }

   // Goes to Productselect.fxml
    public void gotoProductselect(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Products/Products.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    // Goes to Cart.fxml
    public void gotoCart(ActionEvent event) throws IOException {

  

        Parent root = FXMLLoader.load(getClass().getResource("/Products/Cart.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    public void showInstruct(ActionEvent event) throws IOException { 
         AlertMaker.showInstructionsAlert("MABUHAY! :D", "Filodroids Company is a local Filipino company that manufactures and sells hobby products such as \nfigures. We handle everything from designing and making the products to marketing and distributing \nthem. Our unique creations are inspired by different generations of Filipino themes and culture.");

    }

    public void showAbout(ActionEvent event) throws IOException { 
         AlertMaker.showAboutAlert("About us", 
         
         "GROUP 5 - FILODROIDS \nAgustin, Sherlene \nAngeles, Jason \nBabao, Lark \nValdez, Angelique");

    }

    
    // Adding items to cart
    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Mabuhay!", "your item has been added on your cart. :D");

        Button sourceButton = (Button) event.getSource();

     // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(p6)) {
            ProductController.product6.setProductStatus(true);
            ProductController.product6.setProductQuantity(1);
        }

    }
    
}