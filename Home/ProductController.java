package Home;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Checkout.CheckoutController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import Products.p1;
import Products.p2;
import Products.p3;
import Products.p4;
import Products.p5;
import Products.p6;
import Products.p7;
import Products.p8;
import Products.p9;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductController implements Initializable {
    
    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button mybutton;

    @FXML
    Label mywarninglabel;

    @FXML
    HomeController homeController = null;

    @FXML
    static CheckoutController checkoutController = null;

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;

    static p1 product1 = new p1();
    static p2 product2 = new p2();
    static p3 product3 = new p3();
    static p4 product4 = new p4();
    static p5 product5 = new p5();
    static p6 product6 = new p6();
    static p7 product7 = new p7();
    static p8 product8 = new p8();
    static p9 product9 = new p9();

    // static Cart cart = new Cart();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== Item Name 1 ==================//
        product1.setProductName("Item Name 1");
        product1.setProductPrice(250.00);
        product1.setProductImage("/Home/images/p1.png");

        // ============== Item Name 2 ==================//

        product2.setProductName("Item Name 2");
        product2.setProductPrice(200.00);
        product2.setProductImage("/Home/images/p2.png");

        // ============== Item Name 3 ==================//
        product3.setProductName("Item Name 3");
        product3.setProductPrice(300.00);
        product3.setProductImage("/Home/images/p3.png");

        // ============== Item Name 4 ==================/
        product4.setProductName("Item Name 4");
        product4.setProductPrice(280.00);
        product4.setProductImage("/Home/images/p4.png");

        // ============== Item Name 5 ==================/
        product5.setProductName("Item Name 5");
        product5.setProductPrice(250.00);
        product5.setProductImage("/Home/images/p5.png");

        // // ============== Item Name 6 ==================/
        // product6.setProductName("Item Name 6");
        // product6.setProductPrice(300.00);
        // product6.setProductImage("/Home/images/p6.png");

        // // ============== Item Name 7 ==================/
        // product7.setProductName("Item Name 7");
        // product7.setProductPrice(250.00);
        // product7.setProductImage("/Home/images/p7.png");

        // // ============== Item Name 8 ==================/
        // product8.setProductName("Item Name 8");
        // product8.setProductPrice(280.00);
        // product8.setProductImage("/Home/images/p8.png");

        // // ============== Item Name 9 ==================/
        // product9.setProductName("Item Name 9");
        // product9.setProductPrice(300.00);
        // product9.setProductImage("/Home/images/p9.png");


    //     // TODO Auto-generated method stub

    //     try {
    //         loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml")); /////////////////
    //         homeRoot = loader.load();

    //     } catch (Exception e) {
    //         // TODO: handle exception
    //         e.printStackTrace();

    //     }

    //     // Clears all items in Checkout.fxml
    //     checkoutController = loader.getController();
    //     checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    // }

    // public void login(ActionEvent event) throws IOException {

    //     String username = mytextfield.getText();
    //     String password = mypasswordfield.getText();

    //     if (username.equals("a") && password.equals("a")) {

    //         Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    //         FXMLLoader loader = new FXMLLoader(getClass().getResource("/Home/Home.fxml"));
    //         Parent root = loader.load();
    //         Scene scene = new Scene(root);
    //         stage.setScene(scene);
    //         stage.show();

    //     } else {
    //         mywarninglabel.setVisible(true);
    //     }

    }
    
}
