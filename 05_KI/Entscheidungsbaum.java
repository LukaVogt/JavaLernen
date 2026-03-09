import java.util.Scanner;
public class Entscheidungsbaum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // Startknoten: User kommt nach Hause und entdeckt das Problem
        System.out.println("DU kommst nach hause. Die tuer steht offen. Eddi ist weg");
        System.out.println();
        System.out.println("Was machst du?");
        System.out.println();
        System.out.println("1= Nachbar fragen");
        System.out.println("2= Selbst suchen");
        
        // Erste Entscheidung: Verzweigung in zwei Pfade
        int szeneEins = scanner.nextInt();
        
        // Pfad 1: Nachbar fragen
        if(szeneEins == 1){
            System.out.println("Du fragst den Nachbarn, er zeigt Richtung Park");
            System.out.println("Du gehst Richtung Park....");
            System.out.println("Du hörst Bellen hinter dem Busch");
            System.out.println();
            System.out.println("1= Namen rufen");
            System.out.println("2= Nachsehen");
            
            // Zweite Entscheidung: Verzweigung im Park
            int busch = scanner.nextInt();
            
            // Blatt 1: Eddi kommt auf Ruf
            if(busch == 1){
                System.out.println("Du rufst ihn, er springt aus dem Gebüsch und sprintet zu dir");
            // Blatt 2: Eddi schläft im Busch
            }else if(busch == 2){
                System.out.println("Du schaust nach. Es ist Eddi, der im Busch eingeschlafen ist");
            }
                
        // Pfad 2: Selbst suchen
        }else if(szeneEins == 2){
            System.out.println("Du suchst selber in der Gegend, findest aber keine Spur");
            System.out.println("Du siehst ein Auto langsam die Straße entlangfahren");
            System.out.println("Was machst du jetzt?");
            System.out.println("1= Ansprechen");
            System.out.println("2= Nicht ansprechen");
            
            // Zweite Entscheidung: Auto ansprechen oder nicht
            int auto = scanner.nextInt();
            
            // Blatt 3: Fahrer kennt Eddi
            if(auto == 1){
                System.out.println("Er kennt Eddi, weist dir den Weg und du findest Eddi");
            // Blatt 4: Alleine weitersuchen
            }else if(auto == 2){
                System.out.println("Er kennt ihn nicht, du gehst zum Garten und findest Eddi da");
            }
        }
    }
}