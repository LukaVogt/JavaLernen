public class DorfTuersteher {
    public static void main(String[] args) {

        // ID
        
        String name = "Luka";
        int age = 20;
        double bloodAlcoholLevel = 1;
        boolean hasParentalPermission = false;
        boolean isLocalYouthMember = false;

        // Encounter

        if(isLocalYouthMember){
            System.out.println("VIP!Welcome in!"); 

        } else if(age < 16){
            System.out.println("Too young, go home!");

        }else if(age >= 16 && age < 18 && !hasParentalPermission){
            System.out.println("Sorry Pal, no can do. You need a permission from your parents");

        }else if(bloodAlcoholLevel > 1.2){
            System.out.println("You gone dutch huh? Sorry, no can do youre too drunk");

        }else if(isLocalYouthMember){
            System.out.println("VIP!Welcome in!"); 

        }else{
            System.out.println("Welcome to the party, " + name + "!");

        }




    }
}