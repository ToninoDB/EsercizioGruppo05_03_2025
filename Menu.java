import java.util.Scanner;

public class Menu {

    // Metodo per il menu principale
    public void mostraMenuPrincipale(Scanner scanner) {
        int scelta;
        boolean exitMainMenu = false;

        while (!exitMainMenu) {
            stampaMenuPrincipale();
            scelta = getInt(scanner, null);

            switch (scelta) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("ARRIVEDERCI CARO CIUCCIO E SEMPRE FORZA NAPOLI!!!");
                    exitMainMenu = true;
                    break;
                default:
                    System.out.println("Opzione non valida! Riprova.");
            }
        }
    }

    // Metodo di stampa del menu principale
    public void stampaMenuPrincipale() {
        System.out.println("\n================================");
        System.out.println("         BENVENUTO NELLA BIBLIOTECA DEL NAPOLI        ");
        System.out.println("================================");
        System.out.println(" 1. Mostra libri disponibili");
        System.out.println(" 2. Aggiungi un nuovo libro");
        System.out.println(" 3. Rimuovi un libro");
        System.out.println(" 4. Effettua un prestito");
        System.out.println(" 5. Effettua una restituzione");
        System.out.println(" 0. Esci");
        System.out.println("================================");
        System.out.print("Scegli un'opzione (0-5): ");
    }

    // Metodo per il controllo di un int
    public int getInt(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Errore: inserire un numero intero valido.");
            }
        }
    }
}
