import java.util.Scanner; // Scanner importieren


public class Konto{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // create scanner

        //Name

        System.out.println("Enter Username");

        String userName = scanner.nextLine();    //Read user input
        System.out.println("Username is: " + userName);      // Output user input

        //Money

        System.out.println("Whats your starting budget?");

        double myBudget = scanner.nextDouble();
        System.out.println("Startingbudget is: " + myBudget + " $");

        //Menu
        int menu = 0;

        while(menu != 4){

             System.out.println("MENU");
        System.out.println();
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. View Bankaccount");
        System.out.println("4. Cancel");

        menu = scanner.nextInt();

        

        // After the Menu

        if(menu == 1){

            System.out.println("Whats the amount you want to deposit?");

            int deposit = scanner.nextInt();
            if(deposit > 0) {

                System.out.println("depositing....");

                myBudget = myBudget + deposit;
                System.out.println("Bankaccount now: " + myBudget + "$");


            }else{
                System.out.println("ERROR; INVALID NUMBER2");
            }


        }else if(menu == 2){
            System.out.println("Whats the amount you want to withdraw?");

            int withdraw = scanner.nextInt();
            if(withdraw > 0 && withdraw<= myBudget){

                System.out.println("Withdrawing....");

                myBudget = myBudget - withdraw;
                System.out.println("Bankaccount now: " + myBudget + "$");

            }else{
                System.out.println("ERROR; INVALID NUMBER!");
            }

        }else if (menu == 3){
            System.out.println("You currently have " + myBudget + "$ " + "in your bankaccount");

        }else if(menu == 4){
            System.out.println("BYE!");

        }else{
            System.out.println("ERROR");
        }

        menu = scanner.nextInt();

        }

        



        


    }
}