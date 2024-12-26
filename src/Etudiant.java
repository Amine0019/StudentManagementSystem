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

        System.out.println("Entrez les 10 notes de l'étudiant : ");
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Note " + (i + 1) + ": ");
                    String input = sc.nextLine(); // Lire l'entrée comme chaîne
                    tab_notes[i] = Float.parseFloat(input.replace(',', '.')); // Remplacer la virgule par un point si nécessaire
                    break; // Sortir de la boucle si la conversion est réussie
                } catch (NumberFormatException e) {
                    System.out.println("Veuillez entrer un nombre valide (utilisez un point pour les décimales).");
                }
            }
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

    //méthode pour l'affichage d'un étudiant
    void afficher(){
        System.out.println("Nom : "+nom);
        System.out.println("Prenom : "+prenom);
        System.out.println("Notes :");
        for(int i = 0; i < tab_notes.length; i++){
            System.out.println("Note "+(i+1)+" : ");
        }
        System.out.println();
        System.out.println("Moyenne : "+moyenne());
        System.out.println("Admis : "+(admis()?"true":"false"));
    }





}
