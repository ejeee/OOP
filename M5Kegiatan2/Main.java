package M5Kegiatan2;

import java.io.*; //buat file rider dll
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer; //manipulasi string bentuk kolom tabel

public class Main {
public static DP d = new DP();
    static Scanner s = new Scanner(System.in);
    static boolean input = true;
    static String next;

    public static void main(String[] args) throws IOException {
        //input output yang dilempar untuk mengecek error
        Menu();
    }

    public static void Menu() throws IOException {
        String pilihan;
        Scanner s = new Scanner(System.in);
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println(" |      Pilih ya     | ");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println(" | 1. New Data       | ");
        System.out.println(" | 2. Show Data      | ");
        System.out.println(" | 3. Finish!        | ");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~ \n");
        
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.print  (" Pick One : ");
        pilihan = s.next();
        switch (pilihan) {
            case "1":
                tambahData();
                break;
            case "2":
                lihatData();
                break;
            case "3":
                System.out.println("\nMatur Thankyouuu~");
                System.exit(0);
                break;
            default:
                System.out.println("\nGaada bro, pilih yang laen!");
                Menu();
        }
    }
    
    private static void tambahData() throws IOException {
        input = true;
        try {
            FileWriter fw = new FileWriter("Modul5K2.txt", true); //membaca perchar
            BufferedWriter bw = new BufferedWriter(fw); //membaca perline
            while (input) {

                Scanner s = new Scanner(System.in);
                System.out.print("Alamat Anda: ");
                d.setAlamat(s.nextLine());

                System.out.print("Panjang Tanah: ");
                d.setPanjangTanah(s.nextInt());

                System.out.print("Luas Tanah: ");
                d.setLuasTanah(s.nextInt());

                String Input = String.format("%s,%s,%s\n", d.getAlamat(), d.getPanjangTanah(), d.getLuasTanah());
                bw.write(Input); 

                System.out.print("Apakah Ingin Input Lagi? ");
                next = s.next();
                input = next.equalsIgnoreCase("y");
            }
            bw.close();

        } catch (InputMismatchException a) //khusus untuk salah type data
            {
            System.err.println(a);
            System.out.println();
        } finally {
            Menu();
        }
    }

    private static void lihatData() throws IOException {
        String input = null;
        try {
            FileReader fr = new FileReader("Modul5K2.txt");
            BufferedReader br = new BufferedReader(fr);

            input = br.readLine();
            int i = 1;

            System.out.printf("%-2s %-20s %-15s %-15s\n", "No", "Alamat", "Panjang Tanah", "Luas Tanah");
            // Show Data
            while (input != null) {

                StringTokenizer t = new StringTokenizer(input, ",");

                String Alamat;
                String PanjangTanah, LuasTanah;

                Alamat = t.nextToken();
                PanjangTanah = t.nextToken();
                LuasTanah = t.nextToken();

                // Output
                System.out.printf("%2d %-20s %-15s %-15s\n", i++, Alamat, PanjangTanah, LuasTanah);
                input = br.readLine();
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
            System.out.println();
            Menu();
        } finally {
            Menu();
        }
    }   
}