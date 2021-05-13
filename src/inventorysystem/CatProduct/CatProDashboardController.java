 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.CatProduct;

import java.io.IOException;
import javafx.geometry.Insets;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;


/**
 * FXML Controller class
 *
 * @author tisha
 */
public class CatProDashboardController implements Initializable {
    
 

    @FXML
    private ImageView clickedCatIamge;

    @FXML
    private VBox clikedCategory;

    @FXML
    private Label clickedCatName;
    
     @FXML
    private GridPane grid;
     
     @FXML
    private ScrollPane scrol;


    @FXML
    void a11414(ActionEvent event) {

    }
    
    private List<CategoryModel> category1 = new ArrayList();
    
    private Image image;
    private CategoryInterface CatInt;

    private List<CategoryModel> getData() {
        List<CategoryModel> categorys = new ArrayList<>();
        CategoryModel category;

        category = new CategoryModel();
        category.setName("Kiwi");
        category.setImgSrc("/img/kiwi.png");
        category.setColor("6A7324");
        categorys.add(category);

        category = new CategoryModel();
        category.setName("Kiwi");
        category.setImgSrc("/img/kiwi.png");
        category.setColor("6A7324");
        categorys.add(category);

        category = new CategoryModel();
        category.setName("Kiwi");
        category.setImgSrc("/img/kiwi.png");
        category.setColor("6A7324");
        categorys.add(category);

        category = new CategoryModel();
        category.setName("Kiwi");
        category.setImgSrc("/img/kiwi.png");
        category.setColor("6A7324");
        categorys.add(category);

        category = new CategoryModel();
        category.setName("Kiwi");
        category.setImgSrc("/img/kiwi.png");
        category.setColor("6A7324");
        categorys.add(category);

        category = new CategoryModel();
        category.setName("Kiwi");
        category.setImgSrc("/img/kiwi.png");
        category.setColor("6A7324");
        categorys.add(category);

        category = new CategoryModel();
        category.setName("Kiwi");
        category.setImgSrc("/img/kiwi.png");
        category.setColor("6A7324");
        categorys.add(category);

        category = new CategoryModel();
        category.setName("Kiwi");
        category.setImgSrc("/img/kiwi.png");
        category.setColor("6A7324");
        categorys.add(category);

        category = new CategoryModel();
        category.setName("Kiwi");
        category.setImgSrc("/img/kiwi.png");
        category.setColor("6A7324");
        categorys.add(category);

        category = new CategoryModel();
        category.setName("Kiwi");
        category.setImgSrc("/img/kiwi.png");
        category.setColor("6A7324");
        categorys.add(category);

        return categorys;
    }

    private void setCategory(CategoryModel catModel) {
        clickedCatName.setText(catModel.getName());
        Image image = new Image(getClass().getResourceAsStream(catModel.getImgSrc()));
        clickedCatIamge.setImage(image);
        clikedCategory.setStyle("-fx-background-color: #" + catModel.getColor() + ";\n" +
                "    -fx-background-radius: 30;");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        category1.addAll(getData());
        if (category1.size() > 0) {
            setCategory(category1.get(0));
            
            CatInt = new CategoryInterface() {
                @Override
                public void onClickListener(CategoryModel catmod) {
                    setCategory(catmod);
                }
            };
        }
        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < category1.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/inventorysystem.CatProduct/CatPro_Dashboard.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();
                
                  

                Cat_itemsController itemController = fxmlLoader.getController();
                itemController.setData(category1.get(i),CatInt);

                if (column == 3) {
                    column = 0;
                    row++;
                }

                grid.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  

}


    

