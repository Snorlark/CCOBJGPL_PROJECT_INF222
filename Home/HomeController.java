package Home;
    
import java.io.IOException;

import Alert.AlertMaker;
import Login_Signup.LoginController;
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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import Alert.AlertMaker;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== ITEM 1 ==================//
        item1.setText(ProductController.product1.getProductName());
        price1.setText(Double.toString(ProductController.product1.getProductPrice()));
        Image item1 = new Image(ProductController.product1.getProductImage());
        img1.setImage(item1);

        // ============== ITEM 2 ==================//
        item2.setText(ProductController.product2.getProductName());
        price2.setText(Double.toString(ProductController.product2.getProductPrice()));
        Image item2 = new Image(ProductController.product2.getProductImage());
        img2.setImage(item2);

        // ============== ITEM 3 ==================//
        item3.setText(ProductController.product3.getProductName());
        price3.setText(Double.toString(ProductController.product3.getProductPrice()));
        Image item3 = new Image(ProductController.product3.getProductImage());
        img3.setImage(item3);

        // ============== ITEM 4 ==================//
        item4.setText(ProductController.product4.getProductName());
        price4.setText(Double.toString(ProductController.product4.getProductPrice()));
        Image item4 = new Image(ProductController.product4.getProductImage());
        img4.setImage(item4);

        // ============== ITEM 5 ==================//
        item5.setText(ProductController.product5.getProductName());
        price5.setText(Double.toString(ProductController.product5.getProductPrice()));
        // Image item5 = new Image(ProductController.product5.getProductImage());
        // img1.setImage(item5);


        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }

    
    // Goes to Productselect.fxml
    public void gotoProductselect(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Products/Productselect.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Userprofile.fxml
    public void gotoUserprofile(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/UserProfile/UserProfile.fxml"));
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

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

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

        // LoginController.cart.showItems();
    }


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
