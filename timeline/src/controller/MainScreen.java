package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainScreen  implements Initializable,ControlledScreen{
    Sessionhandler handel;
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
    public void setScreenParent(Sessionhandler screenPage) {
		// TODO Auto-generated method stub
		handel=screenPage;
	}
    @FXML
    private Button CreateBtn;

    @FXML
    private Button LoadBtn;
    @FXML
    private AnchorPane anchorpane;
    @FXML
    void CreateBtn(ActionEvent event) {
     handel.setScreen(Main.screen2ID);
    }

    @FXML
    void LoadBtn(ActionEvent event) {
    
    }


}
