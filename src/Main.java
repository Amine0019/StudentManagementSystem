
public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant();
        Etudiant etudiant2 = new Etudiant();

        System.out.println("Saisir les informations du premier etudiant :");
        etudiant1.saisir();

        System.out.println("Saisir les informations du deuxieme etudiant :");
        etudiant2.saisir();

        System.out.println("afficher  les informations du premier  etudiant :");
        etudiant1.afficher();

        System.out.println("afficher  les informations du deuxieme  etudiant :");
        etudiant2.afficher();

        etudiant1.admis();
        etudiant2.admis();

        System.out.println("comparaison des deux etudiants :");
        int comparaison = etudiant1.exaeQuo(etudiant2);
        if(comparaison == -1){
            System.out.println("etudiant1 est meilleur que  etudiant2");
        }else if(comparaison == 0){
            System.out.println("etudiant 1 a la meme moyenne que etudiant2");
        }else{
            System.out.println("etudiant 2 est meilleur que etudiant 1");
        }


    }
}