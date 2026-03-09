import java.util.Scanner;
// Ueberwachtes Lernen: KI klassifiziert Insekten anhand von Breite/Laenge
// Schwellenwert wurde aus Trainingsdaten gelernt - Raupe oder Marienkaefer?
public class UeberwachtesLernen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length");
        double length = scanner.nextDouble();
        System.out.println("Enter width");
        double width = scanner.nextDouble();
        
        if(width <= 4){
            System.out.println("RAUPE");

        }else if(width > 4){
            System.out.println("MARIENKAEFER");
        }
    }
}