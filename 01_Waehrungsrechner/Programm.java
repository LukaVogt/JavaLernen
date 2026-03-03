import java.text.DecimalFormat; 
public class Programm {
    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {

        // Daten

        double amountEuro = 10000.00;
        String targetCurrency = "JPY";
        double exchangeRate = 0.0;
        String currencyName = "";

       // Währungen

        if(amountEuro > 0) {
             if(targetCurrency.equals("USD")) {
                exchangeRate = 1.08;
                currencyName = "US Dollars";

            
            } else if(targetCurrency.equals("GBP")) {
                exchangeRate = 0.85;
                currencyName = "British Pounds"; 

            } else if(targetCurrency.equals("JPY")) {
                exchangeRate = 163.50;
                currencyName = "Japanese Yen";

            } else if(targetCurrency.equals("CHF")) {
                exchangeRate = 0.94;
                currencyName = "Swiss Francs";

            } else if(targetCurrency.equals("TRY")) {
                exchangeRate = 36.20;
                currencyName = "Turkish Lira";

            } else if(targetCurrency.equals("AUD")) {
                exchangeRate = 1.65;
                currencyName = "Australian Dollars";

            } else if(targetCurrency.equals("CAD")) {
                exchangeRate = 1.48;
                currencyName = "Canadian Dollars";

            } else if(targetCurrency.equals("CNY")) {
                exchangeRate = 7.85;
                currencyName = "Chinese Yuan";

            } else if(targetCurrency.equals("BTC")) {
                exchangeRate = 0.000010;
                currencyName = "Bitcoin";

            } else if(targetCurrency.equals("MXN")) {
                exchangeRate = 19.25;
                currencyName = "Mexican Pesos";

            } else if(targetCurrency.equals("BRL")) {
                exchangeRate = 5.65;
                currencyName = "Brasilian Real";

            } else if(targetCurrency.equals("ARS")) {
                exchangeRate = 895.00;
                currencyName = "Argentine Peso";

            } else if(targetCurrency.equals("NOK")) {
                exchangeRate = 11.45;
                currencyName = "Norwegian Krone";

            } 



         
        }else {
            System.out.println("Error, invalid number!");
        }

        // Formel für Rechnung

        DecimalFormat df = new DecimalFormat("0.00");

         if(exchangeRate > 0){

             double result = amountEuro * exchangeRate;

        System.out.println(df.format(amountEuro) + " euro are " + df.format(result) + " " + currencyName);

         }else{

            System.out.println("ERROR");
         }

       
        
    }    
}
