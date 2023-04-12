package M3Kegiatan1;

public class Main {
    public static void main(String[] args){
    //object survivor
    Survivor s = new Survivor();
    s.name = "Explorer";
    s.skill = "Rescue";
    s.hp = 2;
    s.movement = 10;
    s.decodeMachine = 35;
    s.ability = "Curiosity";
    s.display();

    //object hunter
    Hunter h = new Hunter();
    h.name = "Nightmare";
    h.skill = "Teleport";
    h.hp = 3;
    h.movement = 10;
    h.ability = "Spy";
    h.display();

    //object pet
    Pet p = new Pet();
    p.name = "Shiba Inu";
    p.skill = "Run";
    p.hp = 5;
    p.movement = 10;
    p.jenis = "Anjing";
    p.suara = "Guk guk guk!";
    p.warna = "Cream\n";
    p.display();
    }
}
