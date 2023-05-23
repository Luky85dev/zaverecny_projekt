/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

/**
 * Třída Záznam s konstruktorem záznamu a přepsanou metodou toString pro výpis pojištěných.
 * @autor Lukáš Válek
 */
public class Zaznam implements Comparable<Zaznam> {
    private String jmeno;
    protected String prijmeni;
    private int telefonniCislo;
    private int vek;

    
public Zaznam(String jmeno, String prijmeni, int telefonniCislo, int vek) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.telefonniCislo = telefonniCislo;
    this.vek = vek;
}

public String getJmeno() {
    return this.jmeno;
}

public String getPrijmeni() {
    return this.prijmeni;
}

@Override
    public String toString() {
        return String.format("%-11s" + "%-11s" + "%-8s" + 
                "%s",jmeno, prijmeni, vek, telefonniCislo); 
                
       }

    @Override
    public int compareTo(Zaznam o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
