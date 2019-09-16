package borderpane;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneSovellus extends Application {

    @Override
    public void start(Stage stage) {

        TextField tf = new TextField();
        BorderPane bp = new BorderPane();
        Scene scene = new Scene(bp);

        bp.setTop(new Label("NORTH"));
        bp.setBottom(new Label("SOUTH"));
        bp.setLeft(new Label("WEST"));
        bp.setRight(new Label("EAST"));

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(BorderPaneSovellus.class);
    }

}
