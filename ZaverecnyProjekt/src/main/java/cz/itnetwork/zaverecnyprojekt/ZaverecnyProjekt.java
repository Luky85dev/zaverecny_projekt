/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.zaverecnyprojekt;

import java.util.Scanner;

/**
 * Třída ZaverecnyProjekt obsahuje hlavní cyklus programu s konstrukcí switch
 * @autor Lukáš Válek
 */
public class ZaverecnyProjekt {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    
    EvidencePojistenych pojisteni = new EvidencePojistenych();
    String volba = "";
    
    while (!volba.equals("4")) {
        pojisteni.vypisMenu();
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
        volba = sc.nextLine();
        System.out.println();
    
    switch (volba) {
        case "1":
            pojisteni.pridejPojisteneho();
            break;
        case "2":
            pojisteni.vypisPojistene();
            break;  
        case "3":
            pojisteni.vyhledejPojisteneho();
            break;
        case "4":
            System.out.println("Děkujeme za použití evidence");
            break;
        default:
            System.out.println("Neplatná volba, libovolnou klavesou opakujte volbu");
        }
    }
    
    }
}
