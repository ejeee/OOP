package M3Kegiatan1;
//sub class
class Survivor extends CharIdentityV{
    int decodeMachine;
    String ability;

    void display(){
        System.out.println("\n~~~ Survivor ~~~");
        System.out.println("Name\t: " +name);
        System.out.println("Skill\t: " +skill);
        System.out.println("HP\t: " +hp);
        System.out.println("Movement: " +movement);
        System.out.println("Decode Machine: " +decodeMachine);
        System.out.println("Ability\t: " +ability);
    }
}
