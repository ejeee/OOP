package M3Kegiatan2;

import M3Kegiatan2_1.Wizard;

class Main {
    public static void main(String[] args) {
        //object Troops
        Troops troops = new Troops("\n~~~ Troops ~~~", "Enemy", 100);
        troops.display();
        troops = new Troops(0, 0);
        troops.display2();

        //object Wizard
        Wizard wizard = new Wizard("\n~~~ Wizard ~~~", "Enemy", 100);
        wizard.display();
        wizard = new Wizard(90, 90);
        wizard.display2();
    }
}
