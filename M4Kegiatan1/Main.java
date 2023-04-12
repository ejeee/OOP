package M4Kegiatan1;

public class Main {
    public static void main(String[] args){
        BangunRuang kerucut = new Kerucut(3.14, 9, 9, 15);
        System.out.println("\n\t=== Kerucut ===");
        System.out.println("Luas Permukaan Kerucut: " +kerucut.getLuasPermukaan()+ "cm^2");
        System.out.println("Volume Kerucut\t      : " +kerucut.getVolume()+ "cm^2");

        BangunRuang bola = new Bola(3.14, 9);
        System.out.println("\n\t  === Bola ===");
        System.out.println("Luas Permukaan Bola: " +bola.getLuasPermukaan()+ "cm^2");
        System.out.println("Volume Bola\t   : " +bola.getVolume()+ "cm^2");
        System.out.println("\n");
    }
}