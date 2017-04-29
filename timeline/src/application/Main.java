package application;

import controller.Sessionhandler;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application {
	public static String screen1ID = "MainScreen";
    public static String screen1File = "/view/MainScreen.fxml";
    public static String screen2ID = "CreateTimeline";
    public static String screen2File = "/view/CreateTimeline.fxml";
    public static String screen3ID = "ViewTimelines";
    public static String screen3File = "/view/ViewTimelines.fxml";
    @Override
    public void start(Stage primaryStage) {
        
        Sessionhandler mainContainer = new Sessionhandler();
        mainContainer.loadScreen(Main.screen1ID, Main.screen1File);
        mainContainer.loadScreen(Main.screen2ID, Main.screen2File); 
        mainContainer.loadScreen(Main.screen3ID, Main.screen3File);
        mainContainer.setScreen(Main.screen1ID);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        scene.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Group 4");
      //  primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}