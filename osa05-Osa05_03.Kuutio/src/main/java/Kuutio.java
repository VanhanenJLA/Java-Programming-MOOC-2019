/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class Kuutio {

    private final int sarmanPituus;

    public Kuutio(int sarmanPituus) {
        this.sarmanPituus = sarmanPituus;
    }

    public int tilavuus() {
        return sarmanPituus * sarmanPituus * sarmanPituus;
    }

    @Override
    public String toString() {
        return "Kuution särmän pituus on " + sarmanPituus + ", tilavuus on " + tilavuus();
    }

}
