 package Gioco;

public class Gioco {

    public static void main(String argomenti[]){

    /*    
        Personaggio davide;
        davide = new Personaggio("Davide");
        Personaggio gabri;
        gabri = new Personaggio("Nelly");
        System.out.println(davide.nome);
    */

        Personaggio nemico; 
        nemico = new Personaggio("Callos") ;
        nemico.amico = false;
        nemico.esperienza = 69955;
        nemico.vita = 3000;
        nemico.mana = 100;

        System.out.println("ECCOLO!!! É ARRIVATO " + nemico.nome);
        System.out.println("Livello: " + nemico.getlivello() );   
        System.out.println("HP: " + nemico.vita);
        System.out.println("MP: " + nemico.mana);

        Personaggio amico; 
        amico = new Personaggio("Vash") ;
        amico.amico = true;
        amico.esperienza = 5000;
        amico.vita = 9999;
        amico.mana = 999;
        amico.professione = Professione.GUERRIERO;
        
        System.out.println("Seleziona:\n" + amico.nome);
        System.out.println(amico.professione);   
        System.out.println("Livello: " + amico.getlivello() );   
        System.out.println("HP: " + amico.vita);
        System.out.println("MP: " + amico.mana);
       
        Personaggio amico2; 
        amico2 = new Personaggio("Franco", true, 700, 7781, 700);
        amico2.professione = Professione.LADRO;

        System.out.println(amico2.nome);
        System.out.println("Livello: " + amico2.getlivello() );   
        System.out.println(amico2.professione);   
        System.out.println("HP: " + amico2.vita);
        System.out.println("MP: " + amico2.mana);
    }









}