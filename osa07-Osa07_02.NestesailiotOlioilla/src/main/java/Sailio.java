/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class Sailio {

    private int neste;
    private int kapasiteetti = 100;

    public Sailio() {

    }

    public int sisalto() {
        return neste;
    }

    public void lisaa(int neste) {
        if (neste < 0) {
            return;
        }

        this.neste += neste;

        if (this.neste > kapasiteetti) {
            this.neste = kapasiteetti;
        }
    }

    public void poista(int neste) {
        if (neste < 0) {
            return;
        }

        this.neste -= neste;

        if (this.neste < 0) {
            this.neste = 0;
        }
    }

    @Override
    public String toString() {
        return (neste + "/" + kapasiteetti);
    }
}
