package Controlador;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Control implements Initializable {
    @FXML
    private BorderPane bdPanel;

    @FXML
    private Button btn1;

    @FXML
    private Button btn02;

    @FXML
    private Button btn03;

    @FXML
    private Button btn04;

    @FXML
    private Button btn05;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        //Creamos 5 botones
        Button btn01=new Button("Boton 01");
        Button btn02=new Button("Boton 02");
        Button btn03=new Button("Boton 03");
        Button btn04=new Button("Boton 04");
        Button btn05=new Button("Boton 05");
        //Creamos burderpanel
        BorderPane raiz=new BorderPane();
        raiz=bdPanel;
        //Setear los botones
        raiz.setCenter(btn01);
        btn01.setMaxWidth(Double.MAX_VALUE);
        btn01.setMaxHeight(Double.MAX_VALUE);
        btn01.setStyle("-fx-background-color: #808080");
        BorderPane.setMargin(btn01, new Insets(5,5,5,5));

        raiz.setTop(btn02);
        btn02.setMaxWidth(Double.MAX_VALUE);
        btn02.setMaxHeight(Double.MAX_VALUE);
        btn02.setStyle("-fx-background-color: #ffc0cb");

        raiz.setBottom(btn03);
        btn03.setMaxWidth(Double.MAX_VALUE);
        btn03.setMaxHeight(Double.MAX_VALUE);
        btn03.setStyle("-fx-background-color: #008000");

        raiz.setLeft(btn04);
        btn04.setMaxWidth(Double.MAX_VALUE);
        btn04.setMaxHeight(Double.MAX_VALUE);
        btn04.setStyle("-fx-background-color: #ffff00");
        BorderPane.setMargin(btn04, new Insets(5,0,5,0));

        raiz.setRight(btn05);
        btn05.setMaxWidth(Double.MAX_VALUE);
        btn05.setMaxHeight(Double.MAX_VALUE);
        btn05.setStyle("-fx-background-color: #0000ff");
        BorderPane.setMargin(btn05, new Insets(5,0,5,0));

    }
}