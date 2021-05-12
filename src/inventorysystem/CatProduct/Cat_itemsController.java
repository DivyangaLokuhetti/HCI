/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.CatProduct;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author tisha
 */

/*public class CategoryItems{
    
}*/
public class Cat_itemsController implements Initializable {
     @FXML
    private Label CateggoryName;

    @FXML
    private ImageView CategoryImage;
    
    private void click(MouseEvent mouseEvent) {
        CatInt.onClickListener(categoryModel);
    }
    
    private CategoryModel categoryModel;
    private CategoryInterface CatInt;

    public void setData(CategoryModel catMode, CategoryInterface CatInt) {
        this.categoryModel = catMode;
        this.CatInt = CatInt;
        CateggoryName.setText(catMode.getName());
        
        Image image = new Image(getClass().getResourceAsStream(catMode.getImgSrc()));
        CategoryImage.setImage(image);
    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
