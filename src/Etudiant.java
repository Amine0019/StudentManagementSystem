import java.util.Scanner;

public class Etudiant {
    // Les Attributs de la classe
    String nom ;
    String prenom ;
    float [] tab_notes = new float[10]; // Tableau contenant les 10 notes de l'etudiant initialisées a 0

    // une méthode permettant la saisie d'un étudiant
    void saisir(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir le nom de l'etudiant");
        nom = sc.nextLine();

        System.out.println("Veuillez saisir le nom de prenom de l'etudiant");
        prenom = sc.nextLine();

        System.out.println("Veuillez saisir les 10 notes de l'etudiant");
        for(int i = 0; i < tab_notes.length; i++){
            System.out.println("Note "+(i+1)+" : ");
            tab_notes[i] = sc.nextFloat();
        }
    }



}
