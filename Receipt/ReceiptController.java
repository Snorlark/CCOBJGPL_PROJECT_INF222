package Receipt;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Home.HomeController;
import Products.CartController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ReceiptController implements Initializable {

    @FXML
    Button gohome;

    @FXML
    double item1Amount, item2Amount, item3Amount, item4Amount, item5Amount, item6Amount, item7Amount, item8Amount, item9Amount;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8, qty9, 
    product1, product2, product3, product4, product5, product6, product7, product8, product9,
    price1, price2, price3, price4, price5, price6, price7, price8, price9,
    amount1,amount2, amount3, amount4, amount5, amount6, amount7, amount8, amount9, total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (HomeController.product1.getProductStatus()) {
            product1.setText(HomeController.product1.getProductName());
            qty1.setText(Double.toString(HomeController.product1.getProductQuantity()));
            price1.setText(Double.toString(HomeController.product1.getProductPrice()));
            amount1.setText(Double
                    .toString(HomeController.product1.getProductPrice() * HomeController.product1.getProductQuantity()));

            product1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = HomeController.product1.getProductPrice() * HomeController.product1.getProductQuantity();

        }

        if (HomeController.product2.getProductStatus()) {
            product2.setText(HomeController.product2.getProductName());
            qty2.setText(Double.toString(HomeController.product2.getProductQuantity()));
            price2.setText(Double.toString(HomeController.product2.getProductPrice()));
            amount2.setText(Double
                    .toString(HomeController.product2.getProductPrice() * HomeController.product2.getProductQuantity()));

            product2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = HomeController.product2.getProductPrice() * HomeController.product2.getProductQuantity();
        }

        if (HomeController.product3.getProductStatus()) {
            product3.setText(HomeController.product3.getProductName());
            qty3.setText(Double.toString(HomeController.product3.getProductQuantity()));
            price3.setText(Double.toString(HomeController.product3.getProductPrice()));
            amount3.setText(Double
                    .toString(HomeController.product3.getProductPrice() * HomeController.product3.getProductQuantity()));

            product3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = HomeController.product3.getProductPrice() * HomeController.product3.getProductQuantity();

        }

        if (HomeController.product4.getProductStatus()) {
            product4.setText(HomeController.product4.getProductName());
            qty4.setText(Double.toString(HomeController.product4.getProductQuantity()));
            price4.setText(Double.toString(HomeController.product4.getProductPrice()));
            amount4.setText(Double
                    .toString(HomeController.product4.getProductPrice() * HomeController.product4.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = HomeController.product4.getProductPrice() * HomeController.product4.getProductQuantity();

        }

        if (HomeController.product5.getProductStatus()) {
            product5.setText(HomeController.product5.getProductName());
            qty5.setText(Double.toString(HomeController.product5.getProductQuantity()));
            price5.setText(Double.toString(HomeController.product5.getProductPrice()));
            amount5.setText(Double
                    .toString(HomeController.product5.getProductPrice() * HomeController.product5.getProductQuantity()));

            product5.setVisible(true);
            qty5.setVisible(true);
            price5.setVisible(true);
            amount5.setVisible(true);

            item5Amount = HomeController.product5.getProductPrice() * HomeController.product5.getProductQuantity();

        }

        if (HomeController.product6.getProductStatus()) {
            product6.setText(HomeController.product6.getProductName());
            qty6.setText(Double.toString(HomeController.product6.getProductQuantity()));
            price6.setText(Double.toString(HomeController.product6.getProductPrice()));
            amount6.setText(Double
                    .toString(HomeController.product6.getProductPrice() * HomeController.product6.getProductQuantity()));

            product6.setVisible(true);
            qty6.setVisible(true);
            price6.setVisible(true);
            amount6.setVisible(true);

            item6Amount = HomeController.product6.getProductPrice() * HomeController.product6.getProductQuantity();

        }

        if (HomeController.product7.getProductStatus()) {
            product7.setText(HomeController.product7.getProductName());
            qty7.setText(Double.toString(HomeController.product7.getProductQuantity()));
            price7.setText(Double.toString(HomeController.product7.getProductPrice()));
            amount7.setText(Double
                    .toString(HomeController.product7.getProductPrice() * HomeController.product7.getProductQuantity()));

            product7.setVisible(true);
            qty7.setVisible(true);
            price7.setVisible(true);
            amount7.setVisible(true);

            item7Amount = HomeController.product7.getProductPrice() * HomeController.product7.getProductQuantity();

        }

        if (HomeController.product8.getProductStatus()) {
            product8.setText(HomeController.product8.getProductName());
            qty8.setText(Double.toString(HomeController.product8.getProductQuantity()));
            price8.setText(Double.toString(HomeController.product8.getProductPrice()));
            amount8.setText(Double
                    .toString(HomeController.product8.getProductPrice() * HomeController.product8.getProductQuantity()));

            product8.setVisible(true);
            qty8.setVisible(true);
            price8.setVisible(true);
            amount8.setVisible(true);

            item8Amount = HomeController.product8.getProductPrice() * HomeController.product8.getProductQuantity();

        }

        if (HomeController.product9.getProductStatus()) {
            product9.setText(HomeController.product9.getProductName());
            qty9.setText(Double.toString(HomeController.product9.getProductQuantity()));
            price9.setText(Double.toString(HomeController.product9.getProductPrice()));
            amount9.setText(Double
                    .toString(HomeController.product9.getProductPrice() * HomeController.product9.getProductQuantity()));

            product9.setVisible(true);
            qty9.setVisible(true);
            price9.setVisible(true);
            amount9.setVisible(true);

            item9Amount = HomeController.product9.getProductPrice() * HomeController.product9.getProductQuantity();

        }
        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount + 50;
        total.setText(Double.toString(final_amount));

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
}