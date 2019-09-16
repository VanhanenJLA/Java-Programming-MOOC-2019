/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jouni
 */
public final class Keskiarvosensori implements Sensori {

    private List<Sensori> sensorit;
    private List<Integer> mittaukset;

    public Keskiarvosensori() {
        this.mittaukset = new ArrayList<>();
        this.sensorit = new ArrayList<>();

    }

    public void lisaaSensori(Sensori lisattava) {
        this.sensorit.add(lisattava);

    }

    @Override
    public int mittaa() {
        if (onPaalla()) {
            int sum = 0;
            for (Sensori sensori : sensorit) {
                sum += sensori.mittaa();
               
            }
            int ka = (sum / sensorit.size());
            mittaukset.add(ka);
            return ka;
        } else {
            throw new IllegalStateException("Sensori ei päällä.");
        }

    }

    public List<Integer> mittaukset() {

        return mittaukset;
    }

    @Override
    public boolean onPaalla() {
        for (Sensori sensori : sensorit) {
            if (!sensori.onPaalla()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void paalle() {
        if (!onPaalla()) {
            for (Sensori sensori : sensorit) {
                if (!sensori.onPaalla()) {
                    sensori.paalle();
                }
            }
        }

    }

    @Override
    public void poisPaalta() {
        for (Sensori sensori : sensorit) {
            if (sensori.onPaalla()) {
                sensori.poisPaalta();
            }
        }
    }

}
