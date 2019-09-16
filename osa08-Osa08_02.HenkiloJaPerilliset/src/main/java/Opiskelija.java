/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jouni
 */


public class Opiskelija extends Henkilo {

    private int op;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
    }

    public int opintopisteita() {
        return op;
    }

    public void opiskele() {
        op++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + op;
    }

}
