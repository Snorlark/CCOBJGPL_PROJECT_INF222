package Products;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Alert.AlertMaker;
import Home.HomeController;
import Products.model.Cart;
import Settings.SettingsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CartController implements Initializable {
     
     @FXML
    public
     Pane pane1;

    @FXML
    public
    Pane pane2;

    @FXML
    public
    Pane pane3;

    @FXML
    public
    Pane pane4;

    @FXML
    public
    Pane pane5;

    @FXML
    Pane pane6;

    @FXML
    Pane pane7;

    @FXML
    Pane pane8;

    @FXML
    Pane pane9;

    @FXML
    AnchorPane myAnchorPane;

    @FXML
    public
    VBox myVBox;

    @FXML
    private Stage stage;

    @FXML
    Label item1, item2, item3, item4, item5, item6, item7, item8, item9;

    @FXML
    Label price1, price2, price3, price4, price5, price6, price7, price8, price9, total; 

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;

    @FXML
    static
    HomeController homeController = null;
    
    @FXML
    static
    CartController cartController = null;


    @FXML
    public ChoiceBox<String> choiceBox1;

    @FXML
    public ChoiceBox<String> choiceBox2;

    @FXML
    public ChoiceBox<String> choiceBox3;

    @FXML
    public ChoiceBox<String> choiceBox4;

    @FXML
    public ChoiceBox<String> choiceBox5;

    @FXML
    public ChoiceBox<String> choiceBox6;

    @FXML
    public ChoiceBox<String> choiceBox7;

    @FXML
    public ChoiceBox<String> choiceBox8;

    @FXML
    public ChoiceBox<String> choiceBox9;

    @FXML
    private Scene scene;

    @FXML
    public
    static Parent homeRoot = null;

    public static Cart cart = new Cart();

    FXMLLoader loader;

    private String[] quantity = {"1", "2", "3"};
    

    public static int cartGoBackCount = 0;

    public static Double finalAmount = 0.00;


     @Override
     public void initialize(URL location, ResourceBundle resources) {                     

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
        price6.setText("₱ " + Double.toString(HomeController.product6.getProductPrice()));
        Image image6 = new Image(HomeController.product6.getProductImage());
        img6.setImage(image6);

        item7.setText(HomeController.product7.getProductName());
        price7.setText("₱ " + Double.toString(HomeController.product7.getProductPrice()));
        Image image7 = new Image(HomeController.product7.getProductImage());
        img7.setImage(image7);

        item8.setText(HomeController.product8.getProductName());
        price8.setText("₱ " + Double.toString(HomeController.product8.getProductPrice()));
        Image image8 = new Image(HomeController.product8.getProductImage());
        img8.setImage(image8);

        item9.setText(HomeController.product9.getProductName());
        price9.setText("₱ " + Double.toString(HomeController.product9.getProductPrice()));
        Image image9 = new Image(HomeController.product9.getProductImage());
        img9.setImage(image9);


        choiceBox1.setValue("1");
        choiceBox2.setValue("1");
        choiceBox3.setValue("1");
        choiceBox4.setValue("1");
        choiceBox5.setValue("1");
        choiceBox6.setValue("1");
        choiceBox7.setValue("1");
        choiceBox8.setValue("1");
        choiceBox9.setValue("1");

        choiceBox1.getItems().addAll(quantity);
        choiceBox2.getItems().addAll(quantity);
        choiceBox3.getItems().addAll(quantity);
        choiceBox4.getItems().addAll(quantity);
        choiceBox5.getItems().addAll(quantity);
        choiceBox6.getItems().addAll(quantity);
        choiceBox7.getItems().addAll(quantity);
        choiceBox8.getItems().addAll(quantity);
        choiceBox9.getItems().addAll(quantity);

        choiceBox1.setOnAction(this::computeTotal);
        choiceBox2.setOnAction(this::computeTotal);
        choiceBox3.setOnAction(this::computeTotal);
        choiceBox4.setOnAction(this::computeTotal);
        choiceBox5.setOnAction(this::computeTotal);
        choiceBox6.setOnAction(this::computeTotal);
        choiceBox7.setOnAction(this::computeTotal);
        choiceBox8.setOnAction(this::computeTotal);
        choiceBox9.setOnAction(this::computeTotal);
        
        try {
            loader = new FXMLLoader(getClass().getResource("/Receipt/Receipt.fxml"));
            homeRoot = loader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }

        // Clears all items in Checkout.fxml
      
     }


    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;
        double item5Amount = 0;
        double item6Amount = 0;
        double item7Amount = 0;
        double item8Amount = 0;
        double item9Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();


        if (HomeController.product1.getProductStatus()) {

            double qty = Double.parseDouble(choiceBox1.getValue());
            HomeController.product1.setProductQuantity(qty);

            item1Amount = HomeController.product1.getProductPrice() * qty;

            if (source == choiceBox1) {
                item1Amount = HomeController.product1.getProductPrice() * qty;
            }
        }

        if (HomeController.product2.getProductStatus()) {

            double qty = Double.parseDouble(choiceBox2.getValue());
            HomeController.product2.setProductQuantity(qty);

            item2Amount = HomeController.product2.getProductPrice() * qty;

            if (source == choiceBox2) {
                item2Amount = HomeController.product2.getProductPrice() * qty;
            }
        }

        if (HomeController.product3.getProductStatus()) {

            double qty = Double.parseDouble(choiceBox3.getValue());
            HomeController.product3.setProductQuantity(qty);

            item1Amount = HomeController.product3.getProductPrice() * qty;

            if (source == choiceBox1) {
                item3Amount = HomeController.product3.getProductPrice() * qty;
            }
        }


        if (HomeController.product4.getProductStatus()) {

            double qty = Double.parseDouble(choiceBox4.getValue());
            HomeController.product4.setProductQuantity(qty);

            item4Amount = HomeController.product4.getProductPrice() * qty;

            if (source == choiceBox4) {
                item4Amount = HomeController.product4.getProductPrice() * qty;
            }
        }

        if (HomeController.product5.getProductStatus()) {

            double qty = Double.parseDouble(choiceBox5.getValue());
            HomeController.product5.setProductQuantity(qty);

            item5Amount = HomeController.product5.getProductPrice() * qty;

            if (source == choiceBox5) {
                item5Amount = HomeController.product5.getProductPrice() * qty;
            }
        }

        if (HomeController.product6.getProductStatus()) {

            double qty = Double.parseDouble(choiceBox6.getValue());
            HomeController.product6.setProductQuantity(qty);

            item6Amount = HomeController.product6.getProductPrice() * qty;

            if (source == choiceBox6) {
                item6Amount = HomeController.product6.getProductPrice() * qty;
            }
        }

        if (HomeController.product7.getProductStatus()) {

            double qty = Double.parseDouble(choiceBox7.getValue());
            HomeController.product7.setProductQuantity(qty);

            item7Amount = HomeController.product7.getProductPrice() * qty;

            if (source == choiceBox7) {
                item7Amount = HomeController.product7.getProductPrice() * qty;
            }
        }

        if (HomeController.product8.getProductStatus()) {

            double qty = Double.parseDouble(choiceBox8.getValue());
            HomeController.product8.setProductQuantity(qty);

            item8Amount = HomeController.product8.getProductPrice() * qty;

            if (source == choiceBox8) {
                item8Amount = HomeController.product8.getProductPrice() * qty;
            }
        }

        if (HomeController.product9.getProductStatus()) {

            double qty = Double.parseDouble(choiceBox9.getValue());
            HomeController.product9.setProductQuantity(qty);

            item9Amount = HomeController.product9.getProductPrice() * qty;

            if (source == choiceBox9) {
                item9Amount = HomeController.product9.getProductPrice() * qty;
            }
        }

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount;
        
        // Display total amount in total label
        total.setText("₱ " + Double.toString(totalAmount));

        ProductController.cart.showItems();
    }

    public void getInitialAmount() {

        double totalAmount = 0.00;

        if (HomeController.product1.getProductStatus()) {
            totalAmount += HomeController.product1.getProductPrice();
        }

        if (HomeController.product2.getProductStatus()) {
            totalAmount += HomeController.product3.getProductPrice();
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

        total.setText("₱ " + Double.toString(totalAmount));
    }

    public void goBack(ActionEvent event) throws IOException {

        if (CartController.cartGoBackCount == 1) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Home/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();

            
        }
        
        else if (CartController.cartGoBackCount == 2) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Products/Products.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }

    }

    public void gotoUserprofile(ActionEvent event) throws IOException {
        
        SettingsController.settingsGoBackCount = 3;

        Parent root = FXMLLoader.load(getClass().getResource("/Settings/Settings.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }

    public void gotoReceipt(ActionEvent event) throws IOException {
        
        SettingsController.settingsGoBackCount = 3;

        ProductController.cartController.showItems(ProductController.cart.getItemList());
        ProductController.cartController.getInitialAmount();
        
        Scene scene = new Scene(CartController.homeRoot);

        Parent root = FXMLLoader.load(getClass().getResource("/Receipt/Receipt.fxml"));
        scene = new Scene(root);
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




    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            
            if (!myVBox.getChildren().contains(p)) {
                myVBox.getChildren().add(p);
            }
        }
    }

}