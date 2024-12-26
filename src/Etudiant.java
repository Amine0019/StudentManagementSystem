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

    // une méthode pour calculer la moyenne des notes
    float moyenne(){
        float sum = 0;
        for(int i = 0; i < tab_notes.length; i++){
            sum += tab_notes[i];
        }
        return sum/tab_notes.length;
    }

    // une méthode pour vérifier si un étudiant est admis ou non
    boolean admis(){
        return moyenne()>=10;
    }

    /*
    // une méthode pour comparer deux étudiants
    int exaeQuo(Etudiant E){
        float moyenne1 = this.moyenne();
        float moyenne2 = E.moyenne();

        if(moyenne1>moyenne2){
            return -1;
        }else if(moyenne1==moyenne2){
            return 0;
        }else{
            return 1;
        }
    }
    */




}
