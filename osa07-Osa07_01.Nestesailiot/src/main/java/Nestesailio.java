/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class Nestesailio {

    private String nimi;
    public int neste;
    private int kapasiteetti;

    public Nestesailio(String nimi) {
        this.nimi = nimi;
        kapasiteetti = 100;
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

    public void vahenna(int neste) {
        if (neste < 0) {
            return;
        }

        this.neste -= neste;

        if (this.neste < 0) {
            this.neste = 0;
        }
    }

    public void tulosta() {
        System.out.println(neste + "/" + kapasiteetti);
    }
}
