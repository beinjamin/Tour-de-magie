import java.util.Scanner;

class Papier {
    private int age;
    private int sommeEnPoche;

    public Papier(int age, int sommeEnPoche) {
        this.age = age;
        this.sommeEnPoche = sommeEnPoche;
    }

    public int getAge() {
        return age;
    }

    public int getSommeEnPoche() {
        return sommeEnPoche;
    }
}

class Spectateur {
    private Scanner clavier = new Scanner(System.in);
    private int age;  // Déclaration des variables ici
    private int sommeEnPoche;

    public String getSommeEnPoche() {
        return String.valueOf(sommeEnPoche);
    }

    public String getAge() {
        return String.valueOf(age);
    }

    public Papier faireTourDeMagie() {
        System.out.print("[Spectateur] Quel âge ai-je ? ");
        age = demanderEntier();
        System.out.print("[Spectateur] Combien d'argent ai-je en poche (<100) ? ");
        sommeEnPoche = demanderSommeEnPoche();
        System.out.println("[Spectateur] (j'ai un montant qui convient)");

        return new Papier(age, sommeEnPoche);
    }

    private int demanderEntier() {
        int entier;
        while (true) {
            try {
                entier = clavier.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Veuillez entrer un entier valide.");
                clavier.nextLine();
            }
        }
        return entier;
    }

    private int demanderSommeEnPoche() {
        int somme;
        while (true) {
            somme = demanderEntier();
            if (somme >= 0 && somme < 100) {
                break;
            } else {
                System.out.println("Veuillez entrer une somme entre 0 et 99.");
            }
        }
        return somme;
    }
}

class Assistant {
    public void lirePapier(Papier papier) {
        System.out.println("[Assistant] (je lis le papier)");
        System.out.println("[Assistant] (je calcule mentalement)");

        int resultat = (papier.getAge() * 2 + 5) * 50 + papier.getSommeEnPoche() - 365;

        System.out.println("[Assistant] J'annonce : " + resultat + " !");
    }
}

class Magicien {
    public void revelerSecrets(Spectateur spectateur) {
        System.out.println("[Magicien] - hum... je vois que vous êtes âgé de " + spectateur.getAge() +
                " ans et que vous avez " + spectateur.getSommeEnPoche() + " francs suisses en poche !");
    }
}

public class Main {
    public static void main(String[] args) {
        Spectateur spectateur = new Spectateur();
        Magicien magicien = new Magicien();
        Assistant assistant = new Assistant();

        System.out.println("[Spectateur] (j'entre en scène)");
        Papier papier = spectateur.faireTourDeMagie();

        System.out.println("[Magicien] un petit tour de magie...");
        System.out.println("[Assistant] (je lis le papier et fais le calcul)");
        assistant.lirePapier(papier);

        System.out.println("[Magicien] - Merci ! Voyons voir les résultats...");
        magicien.revelerSecrets(spectateur);
    }
}
