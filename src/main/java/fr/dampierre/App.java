package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int salaire = 15;
    
        System.out.println("Saisir le nombre d'heure travailler dans la semaine entre 0 et 42 : ");
        int heureTravaillé = clavier.nextInt();

        while (heureTravaillé < 0 || heureTravaillé > 42) {
            System.out.println("Saisir un nombre d'heure entre 0 et 42");
            heureTravaillé = clavier.nextInt();
        }
        clavier.close();
       int salaireFinal = salaire * heureTravaillé;
        System.out.println("Pour " + heureTravaillé + " heures vous avez gagner " +salaireFinal +" $");
    }
    
}
