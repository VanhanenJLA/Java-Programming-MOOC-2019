/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.Random;

/**
 *
 * @author Jouni
 */
public class Lehma implements Lypsava, Eleleva {

    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Joni", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
    };

    private Random random = new Random();
    private String nimi;
    private double tilavuus;
    private double maara;

    public Lehma() {
        this(NIMIA[new Random().nextInt(NIMIA.length)]);
    }

    public Lehma(String nimi) {
        this.nimi = nimi;
        this.tilavuus = 15 + random.nextInt(26);
        this.maara = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getMaara() {
        return maara;
    }

    @Override
    public double lypsa() {
        double lypsettyMaara = maara;
        maara = 0;
        return lypsettyMaara;
    }

    @Override
    public void eleleTunti() {
        double kehitettyMaara = 0.7 + random.nextDouble() * 1.3;
        if (maara + kehitettyMaara > tilavuus) {
            maara = tilavuus;
        } else {
            maara += kehitettyMaara;
        }
    }

    @Override
    public String toString() {
        return nimi + " " + Math.ceil(maara) + "/" + Math.ceil(tilavuus);
    }
}
