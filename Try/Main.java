package Try;

public class Main {
	  public static void main(String[] args){

	        System.out.println("\n\t=== Bangun Datar ===");

	        System.out.println("\n=== Persegi ===");
	        Persegi p = new Persegi(21);
	        System.out.println("Luas persegi\t\t: " +p.Luas()+ " cm^2");
	        System.out.println("Keliling persegi\t: " +p.Keliling()+ " cm^2");

	        System.out.println("\n=== Limas ===");
	        Limas i = new Limas(21, 15);
	        System.out.println("Volume limas\t\t: " +i.getVolume()+ " cm^3");

	        System.out.println("\n=== Lingkaran ===");
	        Lingkaran l = new Lingkaran(7);
	        System.out.println("Luas lingkaran\t\t: " +l.Luas()+ " cm^2");
	        System.out.println("Keliling lingkaran\t: " +l.Keliling()+ " cm^2");

	        System.out.println("\n=== Tabung ===");
	        Tabung t = new Tabung(7, 15);
	        System.out.println("Volume tabung\t\t: " +t.getVolume()+ " cm^3");
	        System.out.println("\n");
	    }
}
