/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.order;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author sanjuv
 */
public class OrderSummaryController implements Initializable {

    @FXML
    private NumberAxis numOfOrders;
    @FXML
    private CategoryAxis category;
    @FXML
    private BarChart<String, Number> barchartt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("order comparision");
        series.getData().add(new XYChart.Data<>("Laptop", 100));
        series.getData().add(new XYChart.Data<>("TV", 75));
        series.getData().add(new XYChart.Data<>("Mobile", 50));
        
        barchartt.getData().add(series);
        
    }    
    
}
