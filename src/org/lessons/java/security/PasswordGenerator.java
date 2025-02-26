package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        //  config
        Scanner input = new Scanner(System.in);

        System.out.println("Ciao, sono un generatore di password, qual'è il tuo nome?");
        String nome = input.nextLine();
        nome = Character.toUpperCase(nome.charAt(0)) + nome.substring(1);

        System.out.println("Bene, " + nome + ", qual'è il tuo cognome?");
        String cognome = input.nextLine();
        cognome = Character.toUpperCase(cognome.charAt(0)) + cognome.substring(1);

        System.out.println("Bene, " + nome + " " + cognome + ", qual'è il tuo colore preferito?");
        String colore = input.nextLine();
        colore = Character.toUpperCase(colore.charAt(0)) + colore.substring(1);

        System.out.println("Bene, ora inserisci la tua data di nascita, partiamo dal giorno");
        int giorno = input.nextInt();
        System.out.println("Bene, ora inserisci la tua data di nascita, procediamo con il mese");
        int mese = input.nextInt();
        System.out.println("Bene, ora inserisci la tua data di nascita, procediamo con l'anno");
        int anno = input.nextInt();
        int sommaDataNacita = giorno + mese + anno;

        String password = nome + "-" + cognome +"-"+ colore +"-"+ sommaDataNacita;

        System.out.println("La password generata è : "+ password);
    }
    
}
