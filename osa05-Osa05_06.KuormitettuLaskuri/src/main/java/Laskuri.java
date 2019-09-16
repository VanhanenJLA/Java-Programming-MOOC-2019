/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class Laskuri {

    private int arvo;

    public int getArvo() {
        return arvo;
    }

    public Laskuri(int alkuarvo) {
        this.arvo = alkuarvo;
    }

    public Laskuri() {
        arvo = 0;
    }

    public int arvo() {
        return getArvo();
    }

    public void lisaa(int i) {
        if (i < 0) {
            return;
        }
        arvo += i;
    }

    public void lisaa() {
        arvo++;
    }

    public void vahenna(int i) {
        if (i < 0) {
            return;
        }

        arvo -= i;
    }

    public void vahenna() {
        arvo--;
    }

}
