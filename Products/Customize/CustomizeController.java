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
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CustomizeController{

    @FXML //customization buttons
    private Button btnskin, btneye, btnbrow, btnmouth, btnhair, btn_outfit;
    
    @FXML //selection panes
    private Pane 
    base, selectionColor, 
    selectionSkin, selectionEye, selectionBrow, selectionMouth, selectionHair, selectionOutfit,
    skinGrp;

    // @FXML //color
    private ToggleButton black, brown;

    // @FXML //image selections
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @FXML //selection and display imgs
    private ImageView 
    editedRoid,
    skin, eyes, brow, mouth, hair, outfit,
    skin1, skin2, skin3, skin4,
    hair1a, hair1b, hair2a, hair2b,
    toggle1_hair, toggle2_hair;
    

    public void login (ActionEvent event) throws IOException {
        //ToggleButton sourceToggleButton = (ToggleButton) event.getSource();
        Button sourceButton = (Button) event.getSource();
        base.setVisible(true);
        skinGrp.setVisible(false);

        if (sourceButton == btnskin) {
            selectionSkin.setVisible(true);
            selectionColor.setVisible(false);
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn4.setVisible(true);

            skinGrp.setVisible(true);
            skin1.setVisible(true);

            if (event.getSource() == btn1) { 
                skin1.setVisible(true);
            } else if (event.getSource() == btn2) {
                skin2.setVisible(true);
            } else if (event.getSource() == btn3) {
                skin3.setVisible(true);
            } else if (event.getSource() == btn4) { 
                skin4.setVisible(true);
            }
            
        // } else if (event.getSource() == btneye) {
        //     selectionHair.setVisible(true);
        //     selectionColor.setVisible(true);
        //     toggle1_hair.setVisible(true);
        //     toggle2_hair.setVisible(true);

        //     if (sourceButton == btn1 && sourceButton == black) { 
        //         hair.setImage(hair1a);
        //     } else if (sourceButton == btn1 && sourceButton == brown) {
        //             hair.setImage(hair1b);
        //     } else if (sourceButton == btn2 && sourceButton == black) {
        //             hair.setImage(hair2a);
        //     } else if (sourceButton == btn2 && sourceButton == brown) { 
        //             hair.setImage(hair2b);
        //     }
        // } else if (event.getSource() == btnbrow) {
        //     selectionhair.setVisible(true);
        //     toggle1_hair.setVisible(true);
        //     toggle2_hair.setVisible(true);
            
        //     if (event.getSource() == btn1 && event.getSource() == black) { 
        //         hair.setImage(hair1a);
        //     } else if (event.getSource() == btn1 && event.getSource() == brown) {
        //             hair.setImage(hair1b);
        //     } else if (event.getSource() == btn2 && event.getSource() == black) {
        //         hair.setImage(hair2a);
        //     } else if (event.getSource() == btn2 && event.getSource() == brown) { 
        //             hair.setImage(hair2b);
        //     }
        // } else if (event.getSource() == btnmouth) {
        //     selectionhair.setVisible(true);
        //     toggle1_hair.setVisible(true);
        //     toggle2_hair.setVisible(true);

        //     if (event.getSource() == btn1 && event.getSource() == black) { 
        //         hair.setImage(hair1a);
        //     } else if (event.getSource() == btn1 && event.getSource() == brown) {
        //             hair.setImage(hair1b);
        //     } else if (event.getSource() == btn2 && event.getSource() == black) {
        //         hair.setImage(hair2a);
        //     } else if (event.getSource() == btn2 && event.getSource() == brown) { 
        //             hair.setImage(hair2b);
        //     }
        // } else if (event.getSource() == btnhair) {
        //     selectionhair.setVisible(true);
        //     toggle1_hair.setVisible(true);
        //     toggle2_hair.setVisible(true);
            
        //     if (event.getSource() == btn1 && event.getSource() == black) { 
        //         hair.setImage(hair1a);
        //     } else if (event.getSource() == btn1 && event.getSource() == brown) {
        //             hair.setImage(hair1b);
        //     } else if (event.getSource() == btn2 && event.getSource() == black) {
        //         hair.setImage(hair2a);
        //     } else if (event.getSource() == btn2 && event.getSource() == brown) { 
        //             hair.setImage(hair2b);
        //     }
        // } else if (event.getSource() == btn_outfit) {
        //     selectionhair.setVisible(true);
        //     toggle1_hair.setVisible(true);
        //     toggle2_hair.setVisible(true);

        //     if (event.getSource() == btn1 && event.getSource() == black) { 
        //         hair.setImage(hair1a);
        //     } else if (event.getSource() == btn1 && event.getSource() == brown) {
        //             hair.setImage(hair1b);
        //     } else if (event.getSource() == btn2 && event.getSource() == black) {
        //         hair.setImage(hair2a);
        //     } else if (event.getSource() == btn2 && event.getSource() == brown) { 
        //             hair.setImage(hair2b);
        //     }
        }
    }

}


