import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;// Scanner importieren


public class Konto{

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  // create scanner

        //Name

        System.out.println("Enter Username");

        String userName = scanner.nextLine();    //Read user input
        System.out.println("Username is: " + userName);      // Output user input

        //Money
        
        double myBudget = 0;

        while(myBudget <= 0){
            System.out.println("Whats your starting budget?");

             myBudget = scanner.nextDouble();

        }

        
        if(myBudget > 0){
            System.out.println("Startingbudget is: " + myBudget + " $");

        }else{
            System.out.println("You aint goin in the negatives pal");
        }

        ArrayList <Double> historie = new ArrayList<>();  // ArrayList

        

        //Menu
        int menu = 0;

        while(menu != 4){

             System.out.println("MENU");
        System.out.println();
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. View Bankaccount");
        System.out.println("4. Cancel");
        System.out.println("5. invest");
        System.out.println("6. Transaction historie");

        menu = scanner.nextInt();

        

        // After the Menu

        if(menu == 1){

            System.out.println("Whats the amount you want to deposit?");

            double deposit = scanner.nextDouble();
            if(deposit > 0) {

                System.out.println("depositing....");

                myBudget = myBudget + deposit;
                System.out.println("Bankaccount now: " + myBudget + "$");
                historie.add(deposit);


            }else{
                System.out.println("ERROR; INVALID NUMBER");
            }


        }else if(menu == 2){
            System.out.println("Whats the amount you want to withdraw?");

            double withdraw = scanner.nextDouble();
            if(withdraw > 0 && withdraw<= myBudget){

                System.out.println("Withdrawing....");

                myBudget = myBudget - withdraw;
                System.out.println("Bankaccount now: " + myBudget + "$");
                historie.add(-withdraw);

            }else{
                System.out.println("ERROR; INVALID NUMBER!");
            }

        }else if (menu == 3){
            System.out.println("You currently have " + myBudget + "$ " + "in your bankaccount");

        }else if(menu == 4){
            System.out.println("BYE!");

        }else if(menu == 5){  // Invest

            System.out.println("Whats the amount you want to invest?");
            double investAmount = scanner.nextDouble();

            if(investAmount <= myBudget && investAmount > 0){
                System.out.println("And for how long would you like to invest your " + investAmount + "$?");
                int investTime = scanner.nextInt();
                System.out.println();
                System.out.println("At whitch rate?");
                double rate = scanner.nextDouble();

                if(rate <= 0.05 && rate > 0.00){
                     double result = investAmount * Math.pow(1 + rate, investTime);
                    System.out.println("After " + investTime + " you will have: " + result + "$");

                }else{

                    System.out.println("This rate ist not available");
                }

            }else{
                System.out.print("You cant invest more money than you have");
            }


        }else if(menu == 6){

            System.out.println("Last transactions:");

            if(historie.isEmpty()){

                System.out.println("no transactions");

            }else{
                
                for(double transaktion : historie){

            System.out.println(transaktion + "$");
            }

        }
       
        } else{
            System.out.println("ERROR");
        
        
        }

        
    }

   }
}