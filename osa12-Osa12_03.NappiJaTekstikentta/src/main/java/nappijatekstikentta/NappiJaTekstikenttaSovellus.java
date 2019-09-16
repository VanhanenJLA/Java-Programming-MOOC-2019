package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class NappiJaTekstikenttaSovellus extends Application {

    @Override
    public void start(Stage stage) {
        Button nappi = new Button("Tekstiä");
        TextField tf = new TextField();
        FlowPane fp = new FlowPane();
        Scene scene = new Scene(fp);

        fp.getChildren().add(tf);
        fp.getChildren().add(nappi);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
    }

}
