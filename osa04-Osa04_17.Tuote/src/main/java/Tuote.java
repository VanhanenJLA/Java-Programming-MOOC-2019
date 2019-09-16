/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class Tuote {

    private final String nimiAlussa;
    private final double hintaAlussa;
    private final int maaraAlussa;

    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.nimiAlussa = nimiAlussa;
        this.hintaAlussa = hintaAlussa;
        this.maaraAlussa = maaraAlussa;

    }

    public void tulostaTuote() {
        System.out.println(nimiAlussa + ", " + hintaAlussa + ", " + maaraAlussa + " kpl");

    }
}
