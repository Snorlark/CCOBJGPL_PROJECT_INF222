package Products;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Alert.AlertMaker;
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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductViewController implements Initializable {
    @FXML
    private Label item1, item2, item3, item4, item5, item6, item7, item8, item9,
                  price1, price2, price3, price4, price5, price6, price7, price8, price9;
    
    @FXML
    ImageView img1;

    @FXML
    ImageView img2;

    @FXML
    ImageView img3;

    @FXML
    ImageView img4;

    @FXML
    ImageView img5;

    @FXML
    ImageView img6;

    @FXML
    ImageView img7;

    @FXML
    ImageView img8;

    @FXML
    ImageView img9;

    @FXML
    private Button v1, v2, v3, v4, v5, v6, v7, v8, v9;

    // @FXML
    // Button mybutton;

    // @FXML
    // Label mywarninglabel;

    @FXML
    static Parent homeRoot = null;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    public VBox myVBox;

    @FXML
    public Pane pane1;


    FXMLLoader loader;

    public static int count = 0;

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

        // ============== ITEM 1 ==================//
        product1.setProductName("Itemn 1");
        item1.setText(product1.getProductName());

        product1.setProductPrice(250.00);
        String productprice1 = Double.toString(product1.getProductPrice());
        price1.setText("₱ " + productprice1);

        product1.setProductImage("/Products/images/p1.png");
        Image image1 = new Image(product1.getProductImage());
        img1.setImage(image1);

        // ============== ITEM 2 ==================//
        product2.setProductName("Item Name 2");
        item2.setText(product2.getProductName());

        product2.setProductPrice(200.00);
        String productprice2 = Double.toString(product2.getProductPrice());
        price2.setText("₱ " + productprice2);

        product2.setProductImage("/Products/images/p2.png");
        Image image2 = new Image(product2.getProductImage());
        img2.setImage(image2);

        // ============== ITEM 3 ==================//
        product3.setProductName("Item Name 3");
        item3.setText(product3.getProductName());

        product3.setProductPrice(280.00);
        String productprice3 = Double.toString(product3.getProductPrice());
        price3.setText("₱ " + productprice3);

        product3.setProductImage("/Products/images/p3.png");
        Image image3 = new Image(product3.getProductImage());
        img3.setImage(image3);

        // ============== ITEM 4 ==================//
        product4.setProductName("Item Name 4");
        item4.setText(product4.getProductName());

        product4.setProductPrice(250.00);
        String productprice4 = Double.toString(product4.getProductPrice());
        price4.setText("₱ " + productprice4);

        product4.setProductImage("/Products/images/p4.png");
        Image image4 = new Image(product4.getProductImage());
        img4.setImage(image4);
        
        // ============== ITEM 5 ==================//
        product5.setProductName("IFUGROID");
        item5.setText(product5.getProductName());

        product5.setProductPrice(100.00);
        String productprice5 = Double.toString(product5.getProductPrice());
        price5.setText("₱ " + productprice5);

        product5.setProductImage("/Products/images/p5.png");
        Image image5 = new Image(product5.getProductImage());
        img5.setImage(image5);

         // ============== ITEM 6 ==================//
        product6.setProductName("Item num 6");
        item6.setText(product6.getProductName());

        product6.setProductPrice(300.00);
        String productprice6 = Double.toString(product6.getProductPrice());
        price6.setText("₱ " + productprice6);

        product6.setProductImage("/Products/images/p6.png");
        Image image6 = new Image(product6.getProductImage());
        img6.setImage(image6);

        // ============== ITEM 7 ==================//
        product7.setProductName("seben");
        item7.setText(product7.getProductName());

        product7.setProductPrice(250.00);
        String productprice7 = Double.toString(product7.getProductPrice());
        price7.setText("₱ " + productprice7);

        product7.setProductImage("/Products/images/p7.png");
        Image image7 = new Image(product7.getProductImage());
        img7.setImage(image7);

        // ============== ITEM 8 ==================//
        product8.setProductName("eight");
        item8.setText(product8.getProductName());

        product8.setProductPrice(280.00);
        String productprice8 = Double.toString(product8.getProductPrice());
        price8.setText("₱ " + productprice8);

        product8.setProductImage("/Products/images/p8.png");
        Image image8 = new Image(product8.getProductImage());
        img8.setImage(image8);

        // ============== ITEM 9 ==================//
        product9.setProductName("nine");
        item9.setText(product9.getProductName());

        product9.setProductPrice(300.00);
        String productprice9 = Double.toString(product9.getProductPrice());
        price9.setText("₱ " + productprice9);

        product9.setProductImage("/Products/images/p9.png");
        Image image9 = new Image(product9.getProductImage());
        img9.setImage(image9);



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

   // Goes to Productselect.fxml
    public void gotoProductselect(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Products/Products.fxml"));
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