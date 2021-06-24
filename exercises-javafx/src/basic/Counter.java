package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Counter extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox mainBox = new VBox();
        HBox buttonBox = new HBox();

        Label labelTitle = new Label("Counter");
        Label labelNumber = new Label("0");

        Button buttonDecrease = new Button("-");
        Button buttonIncrease = new Button("+");

        mainBox.getChildren().add(labelTitle);
        mainBox.getChildren().add(labelNumber);

        buttonBox.getChildren().add(buttonDecrease);
        buttonBox.getChildren().add(buttonIncrease);

        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(10);

        mainBox.getChildren().add(buttonBox);
        mainBox.setAlignment(Pos.CENTER);
        mainBox.setSpacing(10);


        Scene mainScene = new Scene(mainBox, 400, 400);

        stage.setScene(mainScene);

        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
