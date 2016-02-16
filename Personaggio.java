package Gioco;
import java.util.ArrayList;

public class Personaggio {
    public String nome;
    public int eta;
    public int esperienza;
    public Professione professione;
    public Sesso sesso;
    public Razza razza;
    public boolean amico;
    public int vita;
    public int mana;
    public int soldi;
    private int posizione_x;
    private int posizione_y;
    public ArrayList<Magia> libroMagie;
    public ArrayList<Artefatto> artefatti;

    public Personaggio(String a_nome){
        this.nome = a_nome;
    }
    
    /**
     * Costruttore del personaggio.
     * Serve ad inizializzare le caratteristiche principali
     * 
     * @param a_nome nome del personaggio
     * @param a_amico amico o nemico
     * @param a_esperienza esperienza
     * @param a_vita vita
     * @param a_mana mana
    */
    public Personaggio(String a_nome, boolean a_amico, int a_esperienza, int a_vita, int a_mana){
        this.nome = a_nome;
        this.amico = a_amico;
        this.esperienza = a_esperienza;
        this.vita = a_vita;
        this.mana = a_mana;
    }
    
    public int getlivello (){
        int l_livello;
        if (this.esperienza < 100) {
            l_livello = 1;
        } else if (this.esperienza < 500) {
            l_livello = 2;
        } else if (this.esperienza < 1000) {
            l_livello = 3;
        } else if (this.esperienza < 2000) {
            l_livello = 4;
        } else  {
            l_livello = 5;
        }
        return l_livello;
    }
    
}
