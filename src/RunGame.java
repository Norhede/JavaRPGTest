import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Henrik on 24-09-2016.
 */
public class RunGame extends Application {

    private int applicationWidth = 1600;
    private int applicationHeight = 900;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("BorderPane Test");
        BorderPane borderpane = new BorderPane();

            // Header

        HBox header = new HBox(12);
        header.getStyleClass().add("header");
        header.setPrefSize(applicationWidth, applicationHeight*0.2);
        borderpane.setTop(header);

            // Items in the header

        Text playerNameText = new Text("Name: " + Player.testPlayer.getPlayerName());
        Text playerLevelText = new Text("Level: " + Player.testPlayer.getPlayerLevel());
        Text playerExpText = new Text("Exp: " + Player.testPlayer.getCurrentExperiencePoints() + "/" + Player.expTable[Player.testPlayer.getPlayerLevel()-1]);
        header.getChildren().addAll(playerNameText, playerLevelText, playerExpText);

        VBox leftSide = new VBox(12);
        leftSide.getStyleClass().add("leftSide");
        leftSide.setPrefSize(applicationWidth * 0.15, applicationHeight * 0.7);
        borderpane.setLeft(leftSide);

        GridPane center = new GridPane();
        center.getStyleClass().add("center");
        center.setPrefSize(applicationWidth * 0.7, applicationHeight * 0.7);
        borderpane.setCenter(center);

        VBox rightSide = new VBox(12);
        rightSide.getStyleClass().add("rightSide");
        rightSide.setPrefSize(applicationWidth*0.15, applicationHeight*0.7);
        borderpane.setRight(rightSide);

        HBox footer = new HBox();
        footer.getStyleClass().add("footer");
        footer.setPrefSize(applicationWidth, applicationHeight*0.1);
        borderpane.setBottom(footer);

        Scene scene = new Scene(borderpane, applicationWidth, applicationHeight);
        scene.getStylesheets().add("/stylesheet.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
