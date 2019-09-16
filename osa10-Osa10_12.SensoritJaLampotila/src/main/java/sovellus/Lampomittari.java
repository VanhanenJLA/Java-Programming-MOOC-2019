/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.Random;

/**
 *
 * @author Jouni
 */
public class Lampomittari implements Sensori {

    private boolean paalla;

    public Lampomittari() {
        this.paalla = false;
    }

    @Override
    public int mittaa() {
        if (onPaalla()) {
            int luku = new Random().nextInt(61);
            return 30 - luku;
        } else {
            throw new IllegalStateException("Sensori ei päällä.");
        }

    }

    @Override
    public boolean onPaalla() {
        return paalla;
    }

    @Override
    public void paalle() {
        this.paalla = true;
    }

    @Override
    public void poisPaalta() {
        this.paalla = false;
    }

}
