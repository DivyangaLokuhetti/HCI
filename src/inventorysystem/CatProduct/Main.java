/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.CatProduct;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author tisha
 */
public class Main extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("../inventorysystem.CatProduct/CatPro_Dashboard.fxml"));
        //FXMLLoader loader = new FXMLLoader(Main.class.getResource("CatPro_Dashboard.fxml"));
        
        FXMLLoader root = new FXMLLoader(Main.class.getResource("CatPro_Dashboard.fxml"));

        //primaryStage.setTitle("Categories");
        //primaryStage.setScene(new Scene(root));
        //primaryStage.show();
        
        Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
