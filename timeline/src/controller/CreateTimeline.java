package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
        handel.setScreen(Main.screen4ID);
        String et= EndTime.getValue()+"";
      	String st=StartTime.getValue()+"";
   	    t.setTitle(title.getText().toString());
      	t.setDescription(description.getText().toString());
      	t.setEndTime(et);
      	t.setStartTime(st);
      	try{
      	    PrintWriter writer = new PrintWriter("titles.txt", "UTF-8");
      	  PrintWriter writer1 = new PrintWriter("Description.txt", "UTF-8");
      	    writer.println(t.getTitle());
      	    writer.println(t.getDescription());
      	    writer.close();
      	    writer1.close();
      	} catch (IOException e) {
      	   // do something
      	}
    }

    @FXML
    void cancelBtn(ActionEvent event) {
        handel.setScreen(Main.screen1ID);
    }
 
}
