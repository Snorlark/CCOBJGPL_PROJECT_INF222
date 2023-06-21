package Products.Customize;

import java.io.IOException;

import Alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CustomizeController{

    @FXML //customization buttons
    private Button btnskin, btneye, btnbrow, btnmouth, btnhair, btn_outfit;
    @FXML //selection panes
    private Pane selectionhair;

    // @FXML //image selections
    private Button hair1a, hair1b, hair2a, hair2b;
    

    @FXML //selection panes
    private ImageView temp, disphair1a, disphair1b, disphair2a, disphair2b;


    public void login (ActionEvent event) throws IOException {

        Button sourceButton = (Button) event.getSource();
        
        (temp).setVisible(false);

        if (sourceButton == btnhair) {
            selectionhair.setVisible(true);
            if (sourceButton == hair1a) { 
                (disphair1a).setVisible(true);
                (disphair1b).setVisible(false);
                (disphair2a).setVisible(false);
                (disphair2b).setVisible(false);
            } else if (sourceButton == hair1b) {
                (disphair1a).setVisible(false);
                (disphair1b).setVisible(true);
                (disphair2a).setVisible(false);
                (disphair2b).setVisible(false);
            } else if (sourceButton == hair2a) { 
                (disphair1a).setVisible(false);
                (disphair1b).setVisible(false);
                (disphair2a).setVisible(true);
                (disphair2b).setVisible(false);
            } else if (sourceButton == hair2b) { 
                (disphair1b).setVisible(true);
                (disphair2a).setVisible(false);
                (disphair2b).setVisible(false);
            }
        }

        
       
    }
    
    
    
}
