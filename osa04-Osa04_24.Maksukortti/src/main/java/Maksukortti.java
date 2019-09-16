/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class Maksukortti {

    private double saldo;

    public Maksukortti(double saldo) {
        this.saldo = saldo;
    }

    public void syoEdullisesti() {
        double edullinen = 2.60;
        if (canAfford(edullinen)) {
            saldo -= edullinen;
        }
    }

    public void syoMaukkaasti() {
        double maukas = 4.60;
        if (canAfford(maukas)) {
            saldo -= maukas;
        }
    }

    public void lataaRahaa(double rahamaara) {
        if (rahamaara < 1) {
            return;
        }

        saldo += rahamaara;
        if (saldo > 150) {
            saldo = 150;
        }
    }

    @Override
    public String toString() {
        return "Kortilla on rahaa " + saldo + " euroa";
    }

    private boolean canAfford(double hinta) {
        if (saldo < hinta) {
            return false;
        }
        return true;
    }
}
