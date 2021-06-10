import java.util.Scanner;

public class Player {

    private String name,ChaName;
    private String monsters,townspeople;
    public String hero;
    private String clothes,weapons;
    private int HitPoints;
    Scanner scan = new Scanner(System.in);


    public Player(String name){
        this.name = name;
    }

    public void countHitPoints(int HitPoints){
        System.out.println("Your character has 7 points...");
        System.out.println("Your character's Hit Points:");
        HitPoints = scan.nextInt();
        if(HitPoints < 1 || HitPoints > 7){
            System.out.println("Your character has just died.");
        }
    }
    public String getClothes(){
        return clothes;
    }
    public void setClothes(String clothes){
        this.clothes = clothes;
    }
    public String setWeapons(){
        return weapons;
    }
    public void setWeapons(String weapons){
        this.weapons = weapons;
    }
    public int getHitPoints(){
        return HitPoints;
    }
    public void setHitPoints(int hitPoints){
        this.HitPoints = HitPoints;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getChaName(){
        return ChaName;
    }
    public void setChaName(String chaName){
        this.ChaName = chaName;
    }
    public String getHero(){
        return hero;
    }
    public void setHero(String hero){
        this.hero = hero;
    }
    public String getMonsters(){
        return monsters;
    }
    public void setMonsters(String monsters){
        this.monsters = monsters;
    }
    public String getTownspeople(){
        return townspeople;
    }
    public void setTownspeople(){
        this.townspeople = townspeople;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String ChaName = scanner.nextLine();
        String Clothes = scanner.nextLine();
        String Weapons = scanner.nextLine();
        int Monsters = scanner.nextInt();
        int TownsPeople = scanner.nextInt();

        System.out.println("Please enter your character:" + ChaName);
        System.out.println("Please choose your outfit:" +Clothes);
        System.out.println("Please choose your weapon:" +Weapons);

        if(Monsters < 0 ||  Monsters > 4){
            System.out.println("You can take monster's clothes and weapons...");
            TownsPeople++;
        }

        }

    }












