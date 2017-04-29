package controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Timeline;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CreateTimeline implements Initializable,ControlledScreen{
    Sessionhandler handel;
    Timeline t = new Timeline();
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
    public void setScreenParent(Sessionhandler screenPage) {
		// TODO Auto-generated method stub
		handel=screenPage;
	}
    @FXML
    private Button cancelBtn;
    @FXML
    private AnchorPane createtimelineanchorpane;
    @FXML
    private Button saveBtn;
    @FXML
    private DatePicker EndTime;
    @FXML
    private DatePicker StartTime;
    @FXML
    private TextArea description;
    @FXML
    private TextField title;
    @FXML
    void saveBtn(ActionEvent event) {
        handel.setScreen(Main.screen3ID);
        String et= EndTime.getValue()+"";
      	String st=StartTime.getValue()+"";
   	    t.setTitle(title.getText().toString());
      	t.setDescription(description.getText().toString());
      	t.setEndTime(et);
      	t.setStartTime(st);
      	Save_Timeline_ifo();
    }

    @FXML
    void cancelBtn(ActionEvent event) {
        handel.setScreen(Main.screen1ID);
    }
    public void Save_Timeline_ifo()
    {
    	System.out.println(t.toString());
    }
}
