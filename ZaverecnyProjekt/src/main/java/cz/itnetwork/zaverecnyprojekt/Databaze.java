/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

import java.util.ArrayList;
import java.util.Collections;



/**
 * Třída Databaze obsahující ArrayList pro ukládání pojištěných a metodami pro procházení kolekcí.
 * @autor Lukáš Válek
 */
public class Databaze {
    
    private ArrayList<Zaznam> zaznamy;
    
    public Databaze() {
        zaznamy = new ArrayList<>();
        }
    
    public void pridejZaznam(String jmeno, String prijmeni, int telefonniCislo, int vek) {
        zaznamy.add(new Zaznam(jmeno, prijmeni, telefonniCislo, vek));
        Collections.sort(zaznamy, new EvidencePojistenych());
    }
    
    public ArrayList<Zaznam> najdiZaznamy(String jmenoHledaneho, String prijmeniHledaneho) {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam zaznam : zaznamy) {
            if ((jmenoHledaneho.equals(zaznam.getJmeno()) && (prijmeniHledaneho.equals(zaznam.getPrijmeni())))) {
                nalezene.add(zaznam);
            }
        }
        return nalezene;
       
    }
    
    public ArrayList<Zaznam> vypisZaznamy() {
        ArrayList<Zaznam> nalezeno = new ArrayList<>();
        for (Zaznam z : zaznamy) {
            nalezeno.add(z);
            
        }
        return nalezeno;
    }
}
