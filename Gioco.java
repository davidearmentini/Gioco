package Gioco;

import java.util.ArrayList;
import java.util.Scanner;

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
                    System.out.println("E' stato selezionato:");
                    // Salva in memoria l'amico selezionato
                    l_selezionato = l_amico;

                }
            }
                        
            // Se non ho selezionato nulla
            if (l_selezionato == null){
                System.out.println("Selezione non valida. Riprova.");
            }

        }
        
        System.out.println(l_selezionato.toString());

        
    }









}