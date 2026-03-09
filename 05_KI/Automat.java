import java.util.Scanner;

public class Automat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // Startzustand: Eddi liegt ruhig
        int zustand = 1;  // 1=Liegend, 2=Unruhig, 3=Bellend

        System.out.println("Eddi liegt auf dem sofa und pennt");
        System.out.println("Der besuch sollte gleich da sein");
        System.out.println("Klingeln? (1=Ja)");
        int bruder = scanner.nextInt();

        // Übergang 1→2: Klingel löst Unruhe aus
        if(bruder == 1 && zustand == 1){
            zustand = 2;
            System.out.println("Eddi wird nervös");

            System.out.println("Tür öffnen? (1=Ja)");
            int öffnen = scanner.nextInt();

            // Übergang 2→3: Besuch kommt rein, Eddi bellt
            if(öffnen == 1 && zustand == 2){
                zustand = 3;
                System.out.println("Eddi rennt zur tür und bellt den bruder an");

                System.out.println("Eddi zurückrufen? (1=Ja)");
                int rufen = scanner.nextInt();

                // Übergang 3→1: Kommando bringt Eddi zurück zum Startzustand
                if(rufen == 1 && zustand == 3){
                    System.out.println("Pfui, aus!");
                    zustand = 1; // Endzustand = Startzustand
                }
            }
        }
    }
}