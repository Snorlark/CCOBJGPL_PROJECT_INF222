package Home;
    
import java.io.IOException;

import Alert.AlertMaker;
import Products.ProductController;
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
    private Scene scene;

    FXMLLoader loader;

    static Products.model.p1 product1 = new Products.model.p1();
    static Products.model.p2 product2 = new Products.model.p2();
    static Products.model.p3 product3 = new Products.model.p3();
    static Products.model.p4 product4 = new Products.model.p4();
    static Products.model.p5 product5 = new Products.model.p5();

    public static int count = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== ITEM 1 ==================//
        product1.setProductName("Item Name 1");
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
        
        // ============== ITEM 4 ==================//
        product5.setProductName("IFUGROID");
        item5.setText(product5.getProductName());

        product5.setProductPrice(100.00);
        String productprice5 = Double.toString(product5.getProductPrice());
        price5.setText("₱ " + productprice5);

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

    // Goes to Cart.fxml
    public void gotoCart(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Products/Cart.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


    // public void buy(ActionEvent event) throws IOException {

    //     AlertMaker.showSimpleAlert("hello", "item added");

    //     Button sourceButton = (Button) event.getSource();

    //     // If addtocart button is pressed, set product status to true
    //     if (sourceButton.equals(p1)) {
    //         ProductController.product1.setProductStatus(true);
    //         ProductController.product1.setProductQuantity(1);
    //        // ProductController.product1.addItem(LoginController.checkoutController.pane1);
    //     }

    //     else if (sourceButton == p2) {
    //         ProductController.product2.setProductStatus(true);
    //         ProductController.product2.setProductQuantity(1);
    //        // ProductController.product2.addItem(LoginController.checkoutController.pane2);
    //     }

    //     else if (sourceButton == p3) {
    //         ProductController.product3.setProductStatus(true);
    //         ProductController.product3.setProductQuantity(1);
    //        // ProductController.product3.addItem(LoginController.checkoutController.pane3);
    //     }

    //     else if (sourceButton == p4) {
    //         ProductController.product4.setProductStatus(true);
    //         ProductController.product4.setProductQuantity(1);
    //        // ProductController.product4.addItem(LoginController.checkoutController.pane3);
    //     }

    //     else if (sourceButton == p5) {
    //         ProductController.product5.setProductStatus(true);
    //         ProductController.product5.setProductQuantity(1);
    //        // ProductController.product5.addItem(LoginController.checkoutController.pane3);
    //     }

    //     // LoginController.cart.showItems();
    // }


}




        // else if (sourceButton == p6) { di ko nilagay kasi wala naman nito sa home page pero tinype ko kasi gagamitin ko sa product
        //     ProductController.product6.setProductStatus(true);
        //     ProductController.product6.setProductQuantity(1);
        //     ProductController.product6.addItem(LoginController.checkoutController.pane3);
        // }

        // else if (sourceButton == p7) {
        //     ProductController.product7.setProductStatus(true);
        //     ProductController.product7.setProductQuantity(1);
        //     ProductController.product7.addItem(LoginController.checkoutController.pane3);
        // }

        // else if (sourceButton == p8) {
        //     ProductController.product8.setProductStatus(true);
        //     ProductController.product8.setProductQuantity(1);
        //     ProductController.product8.addItem(LoginController.checkoutController.pane3);
        // }

        // else if (sourceButton == p9) {
        //     ProductController.product9.setProductStatus(true);
        //     ProductController.product9.setProductQuantity(1);
        //     ProductController.product9.addItem(LoginController.checkoutController.pane3);
        // }