package M5Kegiatan1;

import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Diper d =  new Diper();
        Scanner s = new Scanner(System.in);

            boolean repeat = true;
            do{
                try(FileWriter f = new  FileWriter("Modul5.txt")){
                    System.out.println("\n\t=== Dinas Pertanahan Hatimu ===");
                    System.out.print("Alamatnya Kakak\t: ");
                    d.setAlamat(s.nextLine());
                    System.out.print("Panjang Tanah\t:  ");
                    d.setPanjangTanah(s.nextInt());
                    System.out.print("Luas Tanah\t:  ");
                    d.setLuasTanah(s.nextInt());

                    f.write(d.getAlamat()+" ");
                    f.write(d.getPanjangTanah()+" ");
                    f.write(d.getLuasTanah()+" ");
                    repeat = false;
                    
                } catch(Exception e){
                    s.nextLine();
                    System.out.println("\nException : " +e);
                } finally{
                    System.out.println("\nSystem Running Sob . . .");
                }
            } while(repeat);
                System.out.println("\n\t=== Result ===");
                System.out.println("Alamatnyaaa : " +d.getAlamat());
                System.out.println("Panjang Tanah : " +d.getPanjangTanah());
                System.out.println("Luas Tanah : " +d.getLuasTanah());
                System.out.println("\n"); 
    }
}