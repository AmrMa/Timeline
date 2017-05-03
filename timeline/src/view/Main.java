package view;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import Model.Timeline;
import controller.ControlledScreen;
import controller.Sessionhandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class Main implements Initializable,ControlledScreen{
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
    Random rng = new Random();
    @FXML
    private Button add;

    @FXML
    private VBox timelineContent;
    @FXML
    private AnchorPane Main_AnchorPane;

    @FXML
    private AnchorPane timelinesanchorpane;
    @FXML
    void amr(ActionEvent event) {

        	AnchorPane anchorPane = new AnchorPane();
            String style = String.format("-fx-background: rgb(%d, %d, %d);"+
                            "-fx-background-color: -fx-background;",
                    rng.nextInt(256),
                    rng.nextInt(256),
                    rng.nextInt(256));
            anchorPane.setStyle(style);
            Label label = new Label("Timeline "+(timelineContent.getChildren().size()+1));
            AnchorPane.setLeftAnchor(label, 5.0);
            AnchorPane.setTopAnchor(label, 5.0);
            Button button = new Button("Remove");
            button.setOnAction(evt -> timelineContent.getChildren().remove(anchorPane));
            AnchorPane.setRightAnchor(button, 5.0);
            AnchorPane.setTopAnchor(button, 5.0);
            AnchorPane.setBottomAnchor(button, 5.0);
            anchorPane.getChildren().addAll(label, button);
            timelineContent.getChildren().add(anchorPane);
         //   timelinesanchorpane.getChildren().add(timelineContent);
    }
    
    
    
    
    
}