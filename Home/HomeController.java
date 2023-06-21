package Home;
    
import java.io.IOException;

import Alert.AlertMaker;
import Checkout.CheckoutController;
import Products.CartController;
import Products.ProductController;
import Products.views.View1Controller;
import Settings.SettingsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class HomeController implements Initializable {

    @FXML
    Label item1, item2, item3, item4, item5, price1, price2, price3, price4, price5;
    
    @FXML
    ImageView img1, img2, img3, img4;

    @FXML
    private Button p1;

    @FXML
    private Button p2;
    
    @FXML
    private Button p3; 
    
    @FXML
    private Button p4;
    
    @FXML
    private Button p5;

    @FXML
    private Stage stage;

    @FXML
    HomeController homeController = null;

    @FXML
    static Parent homeRoot = null;

    @FXML
    private Scene scene;

    FXMLLoader loader;

    public static Products.model.p1 product1 = new Products.model.p1();
    public static Products.model.p2 product2 = new Products.model.p2();
    public static Products.model.p3 product3 = new Products.model.p3();
    public static Products.model.p4 product4 = new Products.model.p4();
    public static Products.model.p5 product5 = new Products.model.p5();
    public static Products.model.p6 product6 = new Products.model.p6();
    public static Products.model.p7 product7 = new Products.model.p7();
    public static Products.model.p8 product8 = new Products.model.p8();
    public static Products.model.p9 product9 = new Products.model.p9();

    public static int count = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== ITEM 1 ==================//
        product1.setProductName("Iangel");
        item1.setText(product1.getProductName());

        product1.setProductPrice(250.00);
        String productprice1 = Double.toString(product1.getProductPrice());
        price1.setText("₱ " + productprice1);

        product1.setProductImage("/Home/images/p1.png");
        Image image1 = new Image(product1.getProductImage());
        img1.setImage(image1);

        // ============== ITEM 2 ==================//
        product2.setProductName("Item Name 2");
        item2.setText(product2.getProductName());

        product2.setProductPrice(200.00);
        String productprice2 = Double.toString(product2.getProductPrice());
        price2.setText("₱ " + productprice2);

        product2.setProductImage("/Home/images/p2.png");
        Image image2 = new Image(product2.getProductImage());
        img2.setImage(image2);

        // ============== ITEM 3 ==================//
        product3.setProductName("Item Name 3");
        item3.setText(product2.getProductName());

        product3.setProductPrice(280.00);
        String productprice3 = Double.toString(product3.getProductPrice());
        price3.setText("₱ " + productprice3);

        product3.setProductImage("/Home/images/p3.png");
        Image image3 = new Image(product3.getProductImage());
        img3.setImage(image3);

        // ============== ITEM 4 ==================//
        product4.setProductName("Item Name 4");
        item4.setText(product4.getProductName());

        product4.setProductPrice(250.00);
        String productprice4 = Double.toString(product4.getProductPrice());
        price4.setText("₱ " + productprice4);

        product4.setProductImage("/Home/images/p4.png");
        Image image4 = new Image(product4.getProductImage());
        img4.setImage(image4);
        
        // ============== ITEM 5 ==================//
        product5.setProductName("IFUGROID");
        item5.setText(product5.getProductName());

        product5.setProductPrice(100.00);
        String productprice5 = Double.toString(product5.getProductPrice());
        price5.setText("₱ " + productprice5);

        product5.setProductImage("/Home/images/p5.png");

        // ============== ITEM 6 ==================//
        product6.setProductName("item6");
        product6.setProductPrice(300.00);
        product6.setProductImage("/Home/images/p6.png");

        // ============== ITEM 7 ==================//
        product7.setProductName("item7");
        product7.setProductPrice(250.00);
        product7.setProductImage("/Home/images/p7.png");

        // ============== ITEM 8 ==================//
        product8.setProductName("item8");
        product8.setProductPrice(280.00);
        product8.setProductImage("/Home/images/p8.png");

        // ============== ITEM 9 ==================//
        product9.setProductName("item9");
        product9.setProductPrice(300.00);
        product9.setProductImage("/Home/images/p9.png");
       

    }
    
    // Goes to Productselect.fxml
    public void gotoProductselect(ActionEvent event) throws IOException {

        HomeController.count = 1;

        Parent root = FXMLLoader.load(getClass().getResource("/Products/Products.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

        ProductController.count = 1;

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

    // Goes to Cart.fxml
    public void gotoCart(ActionEvent event) throws IOException {

        HomeController.count = 1;

        Parent root = FXMLLoader.load(getClass().getResource("/Products/Cart.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
        CartController.count = 1;
    }


    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Mabuhay!", "your item has been added on your cart. :D");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(p1)) {
            HomeController.product1.setProductStatus(true);
            HomeController.product1.setProductQuantity(1);
           // HomeController.product1.addItem(LoginController.checkoutController.pane1);
        }

        else if (sourceButton == p2) {
            HomeController.product2.setProductStatus(true);
            HomeController.product2.setProductQuantity(1);
           // HomeController.product2.addItem(LoginController.checkoutController.pane2);
        }

        else if (sourceButton == p3) {
            HomeController.product3.setProductStatus(true);
            HomeController.product3.setProductQuantity(1);
           // HomeController.product3.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == p4) {
            HomeController.product4.setProductStatus(true);
            HomeController.product4.setProductQuantity(1);
           // HomeController.product4.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == p5) {
            HomeController.product5.setProductStatus(true);
            HomeController.product5.setProductQuantity(1);
           // HomeController.product5.addItem(LoginController.checkoutController.pane3);
        }
    }

    public void showInstruct(ActionEvent event) throws IOException { 
         AlertMaker.showInstructionsAlert("MABUHAY! :D", "Filodroids Company is a local Filipino company that manufactures and sells hobby products such as \nfigures. We handle everything from designing and making the products to marketing and distributing \nthem. Our unique creations are inspired by different generations of Filipino themes and culture.");

    }

    public void showAbout(ActionEvent event) throws IOException { 
         AlertMaker.showAboutAlert("About us", 
         
         "GROUP 5 - FILODROIDS \nAgustin, Sherlene \nAngeles, Jason \nBabao, Lark \nValdez, Angelique");

    }

}


