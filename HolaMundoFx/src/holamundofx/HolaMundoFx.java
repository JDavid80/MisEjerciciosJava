//Autor: Jesus David Calderón Gomez

package holamundofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.control.Label;

public class HolaMundoFx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label lblMensaje = new Label("Hola Mundo");
        StackPane root = new StackPane();
        root.getChildren().add(lblMensaje);
        
        Scene scene = new Scene(root, 700, 650);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
