package Gioco;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Gioco {

    public static void main(String argomenti[]){
        
        // Creo il nemico
        Personaggio l_nemico; 
        l_nemico = new Personaggio("Callos", false, 69955, 3000, 100, Professione.GUERRIERO );

        // Mostro il nemico all'utente
        System.out.println("ECCOLO!!! É ARRIVATO!!!");
        System.out.println(l_nemico.toString());
        
        // Creo la lista degli amici
        ArrayList<Personaggio> l_lista_amici;
        l_lista_amici = new ArrayList<>();

        // Aggiungo uno ad uno gli amici
        l_lista_amici.add( new Personaggio("Vash", true, 5000, 9999, 999, Professione.GUERRIERO )  );
        l_lista_amici.add( new Personaggio("Franco", true, 700, 7781, 700, Professione.LADRO )  );
        l_lista_amici.add( new Personaggio("Pippo", true, 500, 1000, 450, Professione.BARDO )  );
        l_lista_amici.add( new Personaggio("Arturo", true, 950, 600, 800, Professione.MAGO )  );

        // Ciclo sulla lista amici
        for (Personaggio l_amico : l_lista_amici){
            // Stampo la descrizione di ogni amico
            System.out.println("__________");
            System.out.println(l_amico.toString());
        }

        // Inizializzo la lettura da tastiera
        Scanner keyboard = new Scanner(System.in);
        
        // Chiedo all'utente quale personaggio vuole usare
        System.out.println("Scrivimi il nome del personaggio che vuoi usare");


        // Creo una variabile in cui metteró il personaggio selezionato
        Personaggio l_selezionato = null;
        String l_linea;

        // Finché non ho selezionato un personaggio valido
        while(l_selezionato == null){
            
            // Leggo una linea da tastiera
            l_linea = keyboard.nextLine();

            // Controllo quale personaggio ho selezionato.
            // Ciclo sulla lista di amici
            for (Personaggio l_amico : l_lista_amici){

                // Se la linea scritta dall'utente é uguale al nome dell'amico corrente
//              if (l_linea.equals(l_amico.nome)){
                if (l_linea.equalsIgnoreCase(l_amico.nome)){

                    // Mostra all'utente che hai capito quale amico ha selezionato
                    System.out.println("");
                    System.out.println("E' stato selezionato: " + l_amico.nome);
                    // Salva in memoria l'amico selezionato
                    l_selezionato = l_amico;

                }
            }
                        
            // Se non ho selezionato nulla
            if (l_selezionato == null){
                System.out.println("Selezione non valida. Riprova.");
            }

        }
        
        System.out.println("");
        System.out.println("Inizio combattimento!");
        System.out.println("_____________________");
        System.out.println("");
        System.out.println("Nemico:");
        System.out.println(l_nemico.toString());
        System.out.println("Amico:");
        System.out.println(l_selezionato.toString());
        
        // Cercando "Java a caso" su Google é uscito
        // http://www.simplesoft.it/java/tips/numeri-casuali-in-java.html
        Random l_random = new Random();
        boolean l_inizia_amico = l_random.nextBoolean();

//      while (amico é vivo e nemico é vivo){
            if (l_inizia_amico){
                System.out.println("Inizia " + l_selezionato.nome);
                // menu di azioni
                // seleziona azione
            } else {
                System.out.println("Inizia " + l_nemico.nome);
                // v1: Il nemico attacca
                // v2: Il nemico fa una azione a caso
                // v3: Il nemico fa l'azione migliore che gli viene in mente
            }
                // esegui azione
                // visualizza risultato
            l_inizia_amico = ! l_inizia_amico;
//      }

//      if (amico é vivo){
//          ha vinto amico
//      } else {
//          ha vinto nemico
//      }
        
    }









}