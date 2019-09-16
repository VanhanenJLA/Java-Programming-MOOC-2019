package sovellukseni;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Sovellukseni extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(getParameters().getNamed().get("otsikko"));
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä otsikko laitetaan?");
        String otsikko = lukija.nextLine();

        Application.launch(Sovellukseni.class, "--otsikko=" + otsikko);

    }

}
