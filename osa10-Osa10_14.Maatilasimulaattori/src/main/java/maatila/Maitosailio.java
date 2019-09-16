/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author Jouni
 */
public class Maitosailio {
 
    private double tilavuus;
    private double saldo;
 
    public Maitosailio() {
        this(2000);
    }
 
    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
    }
 
    public double getTilavuus() {
        return tilavuus;
    }
 
    public double getSaldo() {
        return saldo;
    }
 
    public double paljonkoTilaaJaljella() {
        return tilavuus - saldo;
    }
 
    public void lisaaSailioon(double maara) {
        double uusiSaldo = saldo + maara;
        if (uusiSaldo > tilavuus) {
            uusiSaldo = tilavuus;
        }
        saldo = uusiSaldo;
    }
 
    public double otaSailiosta(double maara) {
        double otettuMaara = maara;
        if (otettuMaara > saldo) {
            otettuMaara = saldo;
        }
        saldo -= otettuMaara;
        return otettuMaara;
    }
 
    @Override
    public String toString() {
        return Math.ceil(saldo) + "/" + Math.ceil(tilavuus);
    }
}
