/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class CDLevy implements Talletettava {

    private String artisti;
    private String nimi;
    private int vuosiluku;

    public CDLevy(String artisti, String nimi, int vuosiluku) {
        this.artisti = artisti;
        this.nimi = nimi;
        this.vuosiluku = vuosiluku;
    }

    @Override
    public double paino() {
        return 0.1;
    }

    @Override
    public String toString() {
        return this.artisti + ": " + this.nimi + " (" + this.vuosiluku + ")";
    }

}
