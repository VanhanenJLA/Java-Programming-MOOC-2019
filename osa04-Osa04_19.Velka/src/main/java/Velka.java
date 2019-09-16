/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jouni
 */
public class Velka {
    
    private double saldo;
    private double korkokerroin;
    
    public Velka(double saldoAlussa, double korkokerroinAlussa) {
        saldo = saldoAlussa;
        korkokerroin = korkokerroinAlussa;
    }
    public void tulostaSaldo() {
        System.out.println(saldo);
    }
    
    public void odotaVuosi() {
        saldo *= korkokerroin;
    }
    
}
