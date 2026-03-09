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

        //Enemy(Grunt)
        static int gruntHealth = 30;
        static boolean hasShield = false;
        static int gruntDamage = 20;
        static String gruntWeapon = "needler";

    public static void main(String[] args) {
        
        
        showIntro();

        showProfile();

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
                System.out.println("You land a few shots and it now has" + gruntHealth + " hp left");
            }
        }
        
        }
    
    
}