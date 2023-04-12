package M3Kegiatan1;
//sub class
class Hunter extends CharIdentityV{
    String ability;

    public void display(){
        System.out.println("\n~~~ Hunter ~~~");
        System.out.println("Name\t: " +name);
        System.out.println("Skill\t: " +skill);
        System.out.println("HP\t: " +hp);
        System.out.println("Movement: " +movement);
        System.out.println("Ability\t: " +ability);
    }
}
