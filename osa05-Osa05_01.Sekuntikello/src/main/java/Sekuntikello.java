/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class Sekuntikello {

    private Viisari sekunnit;
    private Viisari sadasosasekunnit;

    public Sekuntikello() {
        this.sekunnit = new Viisari(60);
        this.sadasosasekunnit = new Viisari(100);
    }

    @Override
    public String toString() {
        return sekunnit.toString()+ ":" + sadasosasekunnit.toString();
    }

    public void etene() {
        sadasosasekunnit.etene();

        if (sadasosasekunnit.arvo() == 0) {
            sekunnit.etene();
        }
    }

}
