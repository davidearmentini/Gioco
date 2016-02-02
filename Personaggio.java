package Gioco;
import java.util.ArrayList;

public class Personaggio {
    public String nome;
    public int eta;
    public int esperienza;
    public Professione professione;
    public Sesso sesso;
    public Razza razza;
    public int vita;
    public int mana;
    public int soldi;
    public int posizione_x;
    public int posizione_y;
    public ArrayList<Magia> libroMagie;
    public ArrayList<Artefatto> artefatti;

    public Personaggio(String a_nome){
        this.nome = a_nome;
    }
    
}
