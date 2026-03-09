
public class NeuronalesNetz {
    public static void main(String[] args) {
        
        // Eingaben - ist Käse/Schinken im Sandwich?
        double eingabe1 = 1.0; // Käse: ja
        double eingabe2 = 1.0; // Schinken: ja
        
        // Gewichte - wie wichtig ist die Zutat?
        double gewicht1 = 0.6;
        double gewicht2 = 0.8;
        
        // Neuron rechnet
        double summe = eingabe1 * gewicht1 + eingabe2 * gewicht2;
        
        // Schwellenwert - ab wann ist es lecker?
        double schwellenwert = 0.5;
        
        if(summe >= schwellenwert) {
            System.out.println("Das Sandwich ist lecker! Summe: " + summe);
        } else {
            System.out.println("Nicht lecker. Summe: " + summe);
        }
    }
}