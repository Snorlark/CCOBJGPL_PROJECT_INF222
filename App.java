import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class App extends Application {

    public static void main(String[] args) {
        
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("Login_Signup/Login.fxml"));  
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Image icon = new Image("filodroids.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(false);
        primaryStage.setTitle("FILODROIDS");
        
    }
}
