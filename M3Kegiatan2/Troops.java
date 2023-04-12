package M3Kegiatan2;
//super class
public class Troops {
    //attribute
    protected String name, attack, weapons;
    protected int hp;
    protected double timeAttack, speed;

    //overloading constructor 1
    public Troops(String name, String attack, int hp){
        this.name = name;
        this.attack = attack;
        this.hp = hp;
    }
    //Override
    public void display(){
        System.out.println(" " +this.name);
        System.out.println("Attack \t: " +this.attack);
        System.out.println("HP \t: " +this.hp);
    }

    //overloading constructor 2
    public Troops(double timeAttack, double speed){
        this.timeAttack = timeAttack;
        this.speed = speed;
    }
    
    public void display2(){
        System.out.println("Time Attack: " +this.timeAttack+ " Second");
        System.out.println("Speed \t: " +this.speed);
    }
}