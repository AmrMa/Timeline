package controller;

import java.net.URL;
import java.util.ResourceBundle;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

public class ViewTimelines  implements Initializable,ControlledScreen{

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
    private Button deleteBtn;
    @FXML
    private MenuItem ModifyMnu;
    @FXML
    private AnchorPane viewtimelinesanchorpane;
    @FXML
    private MenuItem CreateMnu;

    @FXML
    private MenuItem DeleteMnu;
    @FXML
    private MenuItem homepageBtn;
   
    @FXML
    void CreateMnu(ActionEvent event) {// menuitems inside the menubar
    	 handel.setScreen(Main.screen2ID);
    }

    @FXML
    void DeleteMnu(ActionEvent event) {// menuitems inside the menubar

    }

    @FXML
    void ModifyMnu(ActionEvent event) {// menuitems inside the menubar

    }
    @FXML
    void homepageBtn(ActionEvent event) {
        handel.setScreen(Main.screen1ID);
    }
 
    @FXML
   void deleteBtn()  // this button should remove the timeline object "-"
    {   
    	
    }  
   
    
}
