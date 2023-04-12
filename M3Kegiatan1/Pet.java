package M3Kegiatan1;
//sub class
class Pet extends CharIdentityV {
    String jenis, suara, warna;

    void display(){
        System.out.println("\n~~~ Pet ~~~");
        System.out.println("Name\t: " +name);
        System.out.println("Skill\t: " +skill);
        System.out.println("HP\t: " +hp);
        System.out.println("Movement: " +movement);
        System.out.println("Jenis\t: " +jenis);
        System.out.println("Suara\t: " +suara);
        System.out.println("Warna\t: " +warna);
    }
}