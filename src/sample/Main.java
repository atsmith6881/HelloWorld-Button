package sample;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

        @Override
        public void start (Stage primaryStage) {
            primaryStage.setTitle("Hello World!");
            Button btn = new Button();
            btn.setText("Say 'Hello World!'");
            btn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle (ActionEvent event) {
                    System.out.println("Hello World!");
                }
            });

            StackPane root = new StackPane();
            root.getChildren() .add(btn);
            primaryStage.setScene(new Scene(root, 300, 250));
            primaryStage.show();
    }
}

