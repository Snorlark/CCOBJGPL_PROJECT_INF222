package Home;
    
import java.io.IOException;

import Alert.AlertMaker;
import Products.CartController;
import Products.ProductController;
import Products.ProductViewController;
import Settings.SettingsController;
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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
    ImageView img1, img2, img3, img4, img5;

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
    public
    static Parent homeRoot = null;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;
    
    @FXML
    public static CartController cartController = null;

    


    FXMLLoader loader;

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

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== ITEM 1 ==================//
        product1.setProductName("Juan");
        item1.setText(product1.getProductName());

        product1.setProductPrice(250.00);
        String productprice1 = Double.toString(product1.getProductPrice());
        price1.setText("₱ " + productprice1);

        product1.setProductImage("/Products/images/p1.png");
        Image image1 = new Image(product1.getProductImage());
        img1.setImage(image1);

        // ============== ITEM 2 ==================//
        product2.setProductName("Maria");
        item2.setText(product2.getProductName());

        product2.setProductPrice(200.00);
        String productprice2 = Double.toString(product2.getProductPrice());
        price2.setText("₱ " + productprice2);

        product2.setProductImage("/Products/images/p2.png");
        Image image2 = new Image(product2.getProductImage());
        img2.setImage(image2);

        // ============== ITEM 3 ==================//
        product3.setProductName("Andres");
        item3.setText(product3.getProductName());

        product3.setProductPrice(280.00);
        String productprice3 = Double.toString(product3.getProductPrice());
        price3.setText("₱ " + productprice3);

        product3.setProductImage("/Products/images/p3.png");
        Image image3 = new Image(product3.getProductImage());
        img3.setImage(image3);

        // ============== ITEM 4 ==================//
        product4.setProductName("Gabriela");
        item4.setText(product4.getProductName());

        product4.setProductPrice(250.00);
        String productprice4 = Double.toString(product4.getProductPrice());
        price4.setText("₱ " + productprice4);

        product4.setProductImage("/Products/images/p4.png");
        Image image4 = new Image(product4.getProductImage());
        img4.setImage(image4);
        
        // ============== ITEM 5 ==================//
        product5.setProductName("Kalasag");
        item5.setText(product5.getProductName());

        product5.setProductPrice(100.00);
        String productprice5 = Double.toString(product5.getProductPrice());
        price5.setText("₱ " + productprice5);

        product5.setProductImage("/Products/images/p5.png");

        // ============== ITEM 6 ==================//
        product6.setProductName("Mayumi");
        product6.setProductPrice(300.00);
        product6.setProductImage("/Products/images/p6.png");

        // ============== ITEM 7 ==================//
        product7.setProductName("Tuna");
        product7.setProductPrice(250.00);
        product7.setProductImage("/Products/images/p7.png");

        // ============== ITEM 8 ==================//
        product8.setProductName("Niña");
        product8.setProductPrice(280.00);
        product8.setProductImage("/Products/images/p8.png");

        // ============== ITEM 9 ==================//
        product9.setProductName("Tian");
        product9.setProductPrice(200.00);
        product9.setProductImage("/Products/images/p9.png");

        CartController.cartGoBackCount = 1;

    
        
    }   
    
    // Goes to Productselect.fxml
    public void gotoProductselect(ActionEvent event) throws IOException {

        SettingsController.settingsGoBackCount = 1;

        Parent root = FXMLLoader.load(getClass().getResource("/Products/Products.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

        ProductController.count = 1;

    }

    // Goes to Userprofile.fxml
    public void gotoUserprofile(ActionEvent event) throws IOException {
        
        SettingsController.settingsGoBackCount = 1;
        

        Parent root = FXMLLoader.load(getClass().getResource("/Settings/Settings.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

        SettingsController.changeDetailsCount = 1;
        
    }

    public void view (MouseEvent event) throws IOException {

        ImageView viewButton = (ImageView) event.getSource();
        CartController.cartGoBackCount = 2;


         if (viewButton.equals(img1)) {
            
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View1.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == img2) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View2.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == img3) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View3.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == img4) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View4.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        else if (viewButton == img4) {
            Parent root = FXMLLoader.load(getClass().getResource("/Products/views/View5.fxml"));
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
   


    //     // LoginController.cart.showItems();
    // }


}

