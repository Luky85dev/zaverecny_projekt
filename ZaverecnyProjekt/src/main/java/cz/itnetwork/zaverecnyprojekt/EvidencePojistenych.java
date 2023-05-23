/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Třída EvidencePojistenych slouží jako uživatelské rozhraní.
 * Obsahuje vstupy od uživatele a metody pro přidání,vyhledání a výpis pojištěných.
 *
 * @autor      Lukáš Válek
 * @verze      1.0
 * @vytvořeno  květen 2023
 */
public class EvidencePojistenych implements Comparator<Zaznam> {
    
    private Databaze databaze;
    private Scanner sc = new Scanner(System.in, "Windows-1250");
    
    public EvidencePojistenych() {
        databaze = new Databaze();
    }
    /**
     * Metoda compare porovnává záznamy v databázi podle přijmení a řadí je dle abecedy
    */
    public int compare(Zaznam zaznam1, Zaznam zaznam2) {
        return zaznam1.prijmeni.compareTo(zaznam2.prijmeni);
    }
    /**
     * Metoda přídá nového pojištěného do databáze, obsahuje kontrolu uživatelského vstupu 
     */ 
    public void pridejPojisteneho() {
        
        boolean pokracovat = false;
        while (pokracovat == false) {
            try {
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine().trim();
        System.out.println("Zadejte přijmení:");
        String prijmeni = sc.nextLine().trim();
        System.out.println("Zadejte telefonní číslo:");
        int telefonniCislo = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Zadejte věk:");
        int vek = Integer.parseInt(sc.nextLine().trim());
        
        databaze.pridejZaznam(jmeno, prijmeni, telefonniCislo, vek);
        System.out.println("\nData byla uložena. Pokračujte libovolnou klavesou...\n");
            }
            catch (Exception ex) {
                System.out.println("Nesprávně zadáno, prosím zadejte znovu");
            }
            pokracovat = true;
        }
    }
    /**
     * Metoda umožní po zadání jména a přijmení najít hledaného pojištěného.
     */
    
    public void vyhledejPojisteneho() {
        
        System.out.println("Zadejte jméno pojištěného:");
        String jmenoHledaneho = sc.nextLine();
        System.out.println("Zadejte přijmení:");
        String prijmeniHledaneho = sc.nextLine();
        
        ArrayList<Zaznam> nalezene = databaze.najdiZaznamy(jmenoHledaneho, prijmeniHledaneho);
        
                System.out.println();
            if (nalezene.size() > 0) {
            for (Zaznam z : nalezene) {
                System.out.println(z);
                }
            }
            else {
                System.out.println("Hledaný pojistník není v databázi\n");
            }
        System.out.println("\nPokračujte libovolnou klavesou...\n");
    }
    
    /**
     * Metoda vypíše všechny pojištěné v databázi, seřazené dle přijmení.
     */
    public void vypisPojistene() {
        
        ArrayList<Zaznam> nalezeno = databaze.vypisZaznamy();
        if (nalezeno.size() > 0) {
            for (Zaznam z : nalezeno) {
                System.out.println(z);
            }
        }
        else {
                System.out.println("Evidence neobsahuje žádné pojistníky\n");
        }
        System.out.println("\nPokračujte libovolnou klávesou...\n");
    }
    
    
    public void vypisMenu() {
        
        System.out.println("------------------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("------------------------------------");
        System.out.printf("\nVyberte si akci:\n");
        
    }  
    
}
