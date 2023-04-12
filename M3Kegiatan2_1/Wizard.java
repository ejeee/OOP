package M3Kegiatan2_1;
import M3Kegiatan2.Troops;
//sub class
public class Wizard extends Troops {
    //attribute
    //private String weapons;
    
    //overloading constructor1
    public Wizard (String name, String attack, int hp){
        super(name, attack, hp);//memanggil konstruktor super class
        super.weapons = "Fire Ball";
    }
    @Override
    public void display(){
        //System.out.println(" " +this.name);
        //System.out.println("Attack\t: " +this.attack);
        //System.out.println("HP\t: " +this.hp);
        super.display();
        System.out.println("Weapons\t: " +super.weapons);
    }

    //overloading constructor2
    public Wizard(double timeAttack, double speed){
        super(timeAttack, speed);
    }
    
    public void display2(){
        System.out.println("Time Attack: " +this.timeAttack+ " Second");
        System.out.println("Speed\t: " +this.speed);
        System.out.println(" ");
    }
}
