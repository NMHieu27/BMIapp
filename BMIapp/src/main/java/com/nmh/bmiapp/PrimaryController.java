package com.nmh.bmiapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PrimaryController {

    @FXML private TextField txtHeight;
    @FXML private TextField txtWeight;
    @FXML private Label lblResult;
    
    public void bmiHandler(ActionEvent envent){
        double h = Double.parseDouble(txtHeight.getText());
        double w = Double.parseDouble(txtWeight.getText());
        double bmi = w / Math.pow(h, 2);
        
        this.lblResult.setTextFill(Color.BLUE);
        if (bmi < 18.5)
            lblResult.setText("Gay");
        else if (bmi < 25.5)
            lblResult.setText("Binh thuong");
        else
        {
            this.lblResult.setTextFill(Color.RED);
            lblResult.setText("Thua can");
        }  
    }
}
