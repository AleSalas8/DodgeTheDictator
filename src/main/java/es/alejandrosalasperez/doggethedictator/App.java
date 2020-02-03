package es.alejandrosalasperez.doggethedictator;

import javafx.application.Application;
import static javafx.print.Paper.C;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        var scene = new Scene(root, 870, 580);
        stage.setScene(scene);
        stage.show();
        
        Image image1 = new Image(getClass().getResourceAsStream("/Imagenes/Fondo.png"));
        ImageView imageView1 = new ImageView(image1);
        root.getChildren().add(imageView1);
         Image image2 = new Image(getClass().getResourceAsStream("/Imagenes/Fondo.png"));
        ImageView imageView2 = new ImageView(image2);
        root.getChildren().add(imageView2);
        Image image3 = new Image(getClass().getResourceAsStream("/Imagenes/aeroplano.png"));
        ImageView imageView3 = new ImageView(image3);
        root.getChildren().add(imageView3);
    }

    public static void main(String[] args) {
        launch();
    }

}