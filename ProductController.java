package Products;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Alert.AlertMaker;
import Home.HomeController;
import Products.model.Cart;
import Products.model.p1;
import Products.model.p2;
import Products.model.p3;
import Products.model.p4;
import Products.model.p5;
import Products.model.p6;
import Products.model.p7;
import Products.model.p8;
import Products.model.p9;
import Receipt.ReceiptController;
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
    private Label item1;
    
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

    // @FXML  FOR PRODUCT VIEWING
    // private Button v1, v2, v3, v4, v5, v6, v7, v8, v9;

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
    private Button v1, v2, v3, v4, v5, v6, v7, v8, v9;

    @FXML
    static Parent homeRoot = null;


    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static
    CartController cartController = null;

    @FXML
    static
    ReceiptController receiptController = null;


    FXMLLoader loader;

    public static int count = 0;

    public static p1 product1 = new p1();
    public static p2 product2 = new p2();
    public static p3 product3 = new p3();
    public static p4 product4 = new p4();
    public static p5 product5 = new p5();
    public static p6 product6 = new p6();
    public static p7 product7 = new p7();
    public static p8 product8 = new p8();
    public static p9 product9 = new p9();
    public static Cart cart = new Cart();
    
    // static Cart cart = new Cart();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== ITEM 1 ==================//
        item1.setText(HomeController.product1.getProductName());
        price1.setText("₱ " + Double.toString(HomeController.product1.getProductPrice()));
        Image image1 = new Image(HomeController.product1.getProductImage());
        img1.setImage(image1);

        item2.setText(HomeController.product2.getProductName());
        price2.setText("₱ " + Double.toString(HomeController.product2.getProductPrice()));
        Image image2 = new Image(HomeController.product2.getProductImage());
        img2.setImage(image2);           

        item3.setText(HomeController.product3.getProductName());
        price3.setText("₱ " + Double.toString(HomeController.product3.getProductPrice()));
        Image image3 = new Image(HomeController.product3.getProductImage());
        img3.setImage(image3);

        item4.setText(HomeController.product4.getProductName());
        price4.setText("₱ " + Double.toString(HomeController.product4.getProductPrice()));
        Image image4 = new Image(HomeController.product4.getProductImage());
        img4.setImage(image4);

        item5.setText(HomeController.product5.getProductName());
        price5.setText("₱ " + Double.toString(HomeController.product5.getProductPrice()));
        Image image5 = new Image(HomeController.product5.getProductImage());
        img5.setImage(image5);

        item6.setText(HomeController.product6.getProductName());
        price6.setText( Double.toString(HomeController.product6.getProductPrice()));
        Image image6 = new Image(HomeController.product6.getProductImage());
        img6.setImage(image6);

        item7.setText(HomeController.product7.getProductName());
        price7.setText("₱ " + Double.toString(HomeController.product7.getProductPrice()));
        Image image7 = new Image(HomeController.product7.getProductImage());
        img7.setImage(image7);

        item8.setText(HomeController.product8.getProductName());
        price8.setText(Double.toString(HomeController.product8.getProductPrice()));
        Image image8 = new Image(HomeController.product8.getProductImage());
        img8.setImage(image8);

        item9.setText(HomeController.product9.getProductName());
        price9.setText("₱ " + Double.toString(HomeController.product9.getProductPrice()));
        Image image9 = new Image(HomeController.product9.getProductImage());
        img9.setImage(image9);

        try {
            loader = new FXMLLoader(getClass().getResource("/Products/Cart.fxml"));
            homeRoot = loader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }

        // Clears all items in Checkout.fxml
        cartController = loader.getController();
        cartController.myVBox.getChildren().removeAll(ProductController.cartController.myVBox.getChildren());
        
    }
        
    

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Mabuhay!", "Your item has been added on your cart. :D");

        Button sourceButton = (Button) event.getSource();

     // If addtocart button is pressed, set product status to true
        if (sourceButton == p1) {
            HomeController.product1.setProductStatus(true);
            HomeController.product2.setProductQuantity(1);
            ProductController.cart.addItem(ProductController.cartController.pane1);
            
        }

        else if (sourceButton == p2) {
            HomeController.product2.setProductStatus(true);
            HomeController.product2.setProductQuantity(1);
            ProductController.cart.addItem(ProductController.cartController.pane2);
          
        }

        else if (sourceButton == p3) {
            HomeController.product3.setProductStatus(true);
            HomeController.product3.setProductQuantity(1);
            ProductController.cart.addItem(ProductController.cartController.pane3);
            
        }

        else if (sourceButton == p4) {
            HomeController.product4.setProductStatus(true);
            HomeController.product4.setProductQuantity(1);
            ProductController.cart.addItem(ProductController.cartController.pane4);

        }

        else if (sourceButton == p5) {
            HomeController.product5.setProductStatus(true);
            HomeController.product5.setProductQuantity(1);
            ProductController.cart.addItem(ProductController.cartController.pane5);
        }

        else if (sourceButton == p6) {
            HomeController.product6.setProductStatus(true);
            HomeController.product6.setProductQuantity(1);
            ProductController.cart.addItem(ProductController.cartController.pane6);
        }

        else if (sourceButton == p7) {
            HomeController.product7.setProductStatus(true);
            HomeController.product7.setProductQuantity(1);
            ProductController.cart.addItem(ProductController.cartController.pane7);
        }

        else if (sourceButton == p8) {
            HomeController.product8.setProductStatus(true);
            HomeController.product8.setProductQuantity(1);
            ProductController.cart.addItem(ProductController.cartController.pane8);
        }

        else if (sourceButton == p9) {
            HomeController.product9.setProductStatus(true);
            HomeController.product9.setProductQuantity(1);
            ProductController.cart.addItem(ProductController.cartController.pane9);
        }

        ProductController.cart.showItems();
  
    }

    // Goes to Userprofile.fxml
    public void gotoUserprofile(ActionEvent event) throws IOException {
        
        SettingsController.settingsGoBackCount = 2;
        
        CartController.cartGoBackCount = 2;

        Parent root = FXMLLoader.load(getClass().getResource("/Settings/Settings.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

        SettingsController.changeDetailsCount = 2;
        
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

    public void gotoCart(ActionEvent event) throws IOException {

        SettingsController.settingsGoBackCount = 2;      
        CartController.cartGoBackCount = 2;

        ProductController.cartController.showItems(ProductController.cart.getItemList());
        ProductController.cartController.getInitialAmount();
        
        Scene scene = new Scene(ProductController.homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    public void view (ActionEvent event) throws IOException {

        Button viewButton = (Button) event.getSource();
        CartController.cartGoBackCount = 2;


         if (viewButton.equals(v1)) {
            
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View1.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == v2) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View2.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == v3) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View3.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == v4) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View4.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == v5) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View5.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

         else if (viewButton == v6) { 
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View6.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == v7) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View7.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton== v8) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View8.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

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