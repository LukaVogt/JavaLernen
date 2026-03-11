import java.util.Scanner; 
public class Game {
    static Scanner scanner = new Scanner(System.in);

    //Character(Chief)
        static String name = "Chief";
        static String characterClass = "Spartan";
        static int health = 100;
        static int shield = 50;
        static String weapon = "MA5B Assault Rifle";
        static int weaponDamage = 20;
        static int grenade = 5;
        static int grenadeDamage = 50;
        static int meleeDamage = 30;

        //Enemy(Grunt)
        static int gruntHealth = 30;
        static boolean hasShield = false;
        static int gruntDamage = 20;
        static String gruntWeapon = "needler";

    public static void main(String[] args) {
        
        
        showIntro();

        showProfile();
        System.out.println();
        System.out.println("You land on the ring like planet, walk for a while and see a grunt in the distance");
        System.out.println();
        fight();
    }

    public static void showProfile(){
        System.out.println("Name: " + name);
        System.out.println("Characterclass: " + characterClass);
        System.out.println("Health: " + health);
        System.out.println("Shield: " + shield);
        System.out.println("Weapon: " + weapon);
        System.out.println("Damage: " + weaponDamage);
            
        }

    public static void showIntro(){

        System.out.println("2099. Deep space. UNSC Pillar of Autumn.");
        System.out.println();
        System.out.println("The ship is silent. Cryo chambers line the walls.");
        System.out.println("Suddenly - alarms. Red light fills the room.");
        System.out.println("A mechanic rushes to Chief's chamber.");
        System.out.println("'Wake up, Spartan. Captain Keyes needs you. NOW.'");
        System.out.println("The cryo pod hisses open. Chief steps out.");
        System.out.println("'The Covenant. They found us.'");
        System.out.println();
        System.out.println("Chief checks his equipment.");

    }
    public static void fight(){
        while(health > 0 && gruntHealth > 0){
            
            System.out.println("What do you do?");
            System.out.println("1. Shoot");
            System.out.println("2. Grenade (5x)");
            System.out.println("3. Melee");
            System.out.println("4. Take cover");
            

            int decision = scanner.nextInt();
            if(decision == 1){
        
                gruntHealth = gruntHealth - weaponDamage;
                System.out.println("You land a few shots and it now has " + gruntHealth + " hp left");
            }
            if(gruntHealth <= 0){
                    System.out.println("Grunt defeated");
                    break;
            }
                    

            if(decision == 2){
                if(grenade > 0){
                    grenade -= 1;
                    gruntHealth -= grenadeDamage;
                    if(gruntHealth <= 0){
                        System.out.println("You throw the grenade and made " + grenadeDamage + " damage");
                        System.out.println("Grunt defeated");
                        break;
                    
                    }
                    
                }else{
                    System.out.println("Dammit! Im out of grenades!");
                }
            }

            if(decision == 3){
                gruntHealth -= meleeDamage;

                if(gruntHealth <= 0){
                    System.out.println("You decide to go up close for melee and made " + meleeDamage + " damage");
                    System.out.println("Grunt defeated");
                    break;
                }   

            }

            if(decision == 4){
                if(shield < 50){
                    System.out.println("Shield regenerated to max again");
                    shield = 50;

                }else{
                    System.out.println("Shield already full");
                }

            }

            if(gruntHealth > 0 && decision != 4){
                 System.out.println();
                 System.out.println("The grunt shoots back and makes " + gruntDamage + " damage");
                 if(gruntDamage > shield){
                    int rest = gruntDamage - shield;
                    health -= rest;
                    if(health <= 0){
                        System.out.println("You got killed by a grunt");
                        System.out.println("GAME OVER");
                        break;
                    }
                    System.out.println("I got " + health + " hp left");
                    shield = 0;

                 }else{
                    shield -= gruntDamage;
                    System.out.println("I got " + shield + " shield left");
                 }
                 
            }
           
                 
        }
    
    }
}