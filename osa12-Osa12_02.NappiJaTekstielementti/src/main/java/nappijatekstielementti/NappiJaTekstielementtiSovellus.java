package nappijatekstielementti;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class NappiJaTekstielementtiSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        Button nappikomponentti = new Button("Tämä on nappi");
        Label tekstikomponentti = new Label("Tekstielementti");

        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(nappikomponentti);
        komponenttiryhma.getChildren().add(tekstikomponentti);

        Scene nakyma = new Scene(komponenttiryhma);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
    }

}
