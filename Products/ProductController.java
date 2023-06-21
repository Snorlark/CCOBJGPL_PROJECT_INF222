package Products;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Alert.AlertMaker;
import Checkout.CheckoutController;
import Home.HomeController;
import Login_Signup.LoginController;
import Products.model.p1;
import Products.model.p2;
import Products.model.p3;
import Products.model.p4;
import Products.model.p5;
import Products.model.p6;
import Products.model.p7;
import Products.model.p8;
import Products.model.p9;
import Products.views.View1Controller;
import Settings.SettingsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductController implements Initializable {
    @FXML
    public Label item1;
    
    @FXML
    private Label item2;

    @FXML
    private Label item3;
    
    @FXML
    private Label item4;
    
    @FXML
    private Label item5;
    
    @FXML
    private Label item6;

    @FXML
    private Label item7;
    
    @FXML
    private Label item8;

    @FXML
    private Label item9;

    @FXML
    private Label price1; 

    @FXML
    private Label price2; 

    @FXML
    private Label price3;

    @FXML
    private Label price4;
    
    @FXML
    private Label price5;
    
    @FXML
    private Label price6;
    
    @FXML
    private Label price7; 

    @FXML
    private Label price8;
    
    @FXML
    private Label price9;
    
    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;

    @FXML  
    private Button v1, v2, v3, v4, v5, v6, v7, v8, v9;

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
    private Button p6;
    
    @FXML
    private Button p7;
    
    @FXML
    private Button p8;
    
    @FXML
    private Button p9;

    @FXML
    static Parent homeRoot = null;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;


    FXMLLoader loader;

    public static int count = 0;

    public static Products.model.p1 product1 = new Products.model.p1();
    public static Products.model.p2 product2 = new Products.model.p2();
    public static Products.model.p3 product3 = new Products.model.p3();
    public static Products.model.p4 product4 = new Products.model.p4();
    public static Products.model.p5 product5 = new Products.model.p5();
    public static Products.model.p6 product6 = new Products.model.p6();
    public static Products.model.p7 product7 = new Products.model.p7();
    public static Products.model.p8 product8 = new Products.model.p8();
    public static Products.model.p9 product9 = new Products.model.p9();
    
    // static Cart cart = new Cart();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== ITEM 1 ==================//
        item1.setText(Home.HomeController.product1.getProductName());
        String productprice1 = Double.toString(Home.HomeController.product1.getProductPrice());
        price1.setText("₱ " + productprice1);
        Image image1 = new Image(Home.HomeController.product1.getProductImage());
        img1.setImage(image1);

        // ============== ITEM 2 ==================//
        item2.setText(Home.HomeController.product2.getProductName());
        String productprice2 = Double.toString(Home.HomeController.product2.getProductPrice());
        price2.setText("₱ " + productprice2);
        Image image2 = new Image(Home.HomeController.product2.getProductImage());
        img2.setImage(image2);

        // ============== ITEM 3 ==================//
        item3.setText(Home.HomeController.product3.getProductName());
        String productprice3 = Double.toString(Home.HomeController.product3.getProductPrice());
        price3.setText("₱ " + productprice3);
        Image image3 = new Image(Home.HomeController.product3.getProductImage());
        img3.setImage(image3);

        // ============== ITEM 4 ==================//
        item4.setText(Home.HomeController.product4.getProductName());
        String productprice4 = Double.toString(Home.HomeController.product4.getProductPrice());
        price4.setText("₱ " + productprice4);
        Image image4 = new Image(Home.HomeController.product4.getProductImage());
        img4.setImage(image4);

        // ============== ITEM 5 ==================//
        item5.setText(Home.HomeController.product5.getProductName());
        String productprice5 = Double.toString(Home.HomeController.product5.getProductPrice());
        price4.setText("₱ " + productprice5);
        Image image5 = new Image(Home.HomeController.product5.getProductImage());
        img5.setImage(image5);

        // ============== ITEM 6 ==================//
        item6.setText(Home.HomeController.product6.getProductName());
        String productprice6 = Double.toString(Home.HomeController.product6.getProductPrice());
        price6.setText("₱ " + productprice6);
        Image image6 = new Image(Home.HomeController.product6.getProductImage());
        img6.setImage(image6);
        
        // ============== ITEM 7 ==================//
        item7.setText(Home.HomeController.product7.getProductName());
        String productprice7 = Double.toString(Home.HomeController.product7.getProductPrice());
        price7.setText("₱ " + productprice7);
        Image image7 = new Image(Home.HomeController.product7.getProductImage());
        img7.setImage(image7);

        // ============== ITEM 8 ==================//
        item8.setText(Home.HomeController.product8.getProductName());
        String productprice8 = Double.toString(Home.HomeController.product8.getProductPrice());
        price8.setText("₱ " + productprice8);
        Image image8 = new Image(Home.HomeController.product8.getProductImage());
        img8.setImage(image8);

        // ============== ITEM 9 ==================//
        item9.setText(Home.HomeController.product9.getProductName());
        String productprice9 = Double.toString(Home.HomeController.product9.getProductPrice());
        price9.setText("₱ " + productprice9);
        Image image9 = new Image(Home.HomeController.product9.getProductImage());
        img9.setImage(image9);


    }

    // Adding items to cart
    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Mabuhay!", "your item has been added on your cart. :D");

        Button sourceButton = (Button) event.getSource();

     // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(p1)) {
            ProductController.product1.setProductStatus(true);
            ProductController.product1.setProductQuantity(1);
           // ProductController.product1.addItem(LoginController.checkoutController.pane1);
        }

        else if (sourceButton == p2) {
            ProductController.product2.setProductStatus(true);
            ProductController.product2.setProductQuantity(1);
           // ProductController.product2.addItem(LoginController.checkoutController.pane2);
        }

        else if (sourceButton == p3) {
            ProductController.product3.setProductStatus(true);
            ProductController.product3.setProductQuantity(1);
           // ProductController.product3.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == p4) {
            ProductController.product4.setProductStatus(true);
            ProductController.product4.setProductQuantity(1);
           // ProductController.product4.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == p5) {
            ProductController.product5.setProductStatus(true);
            ProductController.product5.setProductQuantity(1);
           // ProductController.product5.addItem(LoginController.checkoutController.pane3);
        }

         else if (sourceButton == p6) { 
            ProductController.product6.setProductStatus(true);
            ProductController.product6.setProductQuantity(1);
          // ProductController.product6.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == p7) {
            ProductController.product7.setProductStatus(true);
            ProductController.product7.setProductQuantity(1);
           // ProductController.product7.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == p8) {
            ProductController.product8.setProductStatus(true);
            ProductController.product8.setProductQuantity(1);
           // ProductController.product8.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == p9) {
        // // Goes to Customize.fxml
          //     public void gotoCustomize(ActionEvent event) throws IOException {
          //     Parent root = FXMLLoader.load(getClass().getResource("/Products/Customize.fxml"));
          //     Scene scene = new Scene(root);
          //     stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
          //     stage.setScene(scene);
          //     stage.show();
          // }

            // ProductController.product9.setProductStatus(true);
            // ProductController.product9.setProductQuantity(1);
           // ProductController.product9.addItem(LoginController.checkoutController.pane3);
        }
    }

      public void view(ActionEvent event) throws IOException {

        Button viewButton = (Button) event.getSource();

     // If item/itemname button is pressed, it goes to ProductView.fxml
        if (viewButton.equals(v1)) {

            ProductController.count = 1;

        Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View1.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

            View1Controller.count = 1;
            ProductController.product1.setProductViewStatus(true);
            //ProductController.product1.addItem(ProductViewController.pane1);
        }

        else if (viewButton == v2) {
            
        Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View2.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

            ProductController.product2.setProductViewStatus(true);
    

           // ProductController.product2.addItem(LoginController.checkoutController.pane2);
        }

        else if (viewButton == v3) {

        Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View3.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

            ProductController.product3.setProductViewStatus(true);

           // ProductController.product3.addItem(LoginController.checkoutController.pane3);
        }

        else if (viewButton == v4) {

        Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View4.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

            ProductController.product4.setProductViewStatus(true);

           // ProductController.product4.addItem(LoginController.checkoutController.pane3);
        }

        else if (viewButton == v5) {

        Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View5.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

            ProductController.product5.setProductViewStatus(true);

           // ProductController.product5.addItem(LoginController.checkoutController.pane3);
        }

         else if (viewButton == v6) { 

        Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View6.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

        ProductController.product6.setProductViewStatus(true);

          // ProductController.product6.addItem(LoginController.checkoutController.pane3);
        }

        else if (viewButton == v7) {

        Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View7.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

            ProductController.product7.setProductViewStatus(true);
            
         // ProductController.product7.addItem(LoginController.checkoutController.pane3);
        }

        else if (viewButton == v8) {

        Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View8.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

            ProductController.product8.setProductViewStatus(true);

         // ProductController.product8.addItem(LoginController.checkoutController.pane3);
        }

        else if (viewButton == v9) {
        // // Goes to Customize.fxml
          //     public void gotoCustomize(ActionEvent event) throws IOException {
          //     Parent root = FXMLLoader.load(getClass().getResource("/Products/Customize.fxml"));
          //     Scene scene = new Scene(root);
          //     stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
          //     stage.setScene(scene);
          //     stage.show();
          // }

           // ProductController.product9.addItem(LoginController.checkoutController.pane3);
     
        }
        
    }

    // Goes to Userprofile.fxml
    public void gotoUserprofile(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("/Settings/Settings.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }

    // Goes to Checkout.fxml
    public void gotoCheckout(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Checkout/Checkout.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    // Goes to Home.fxml
    public void gotoHome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Home/Home.fxml"));
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
    
}