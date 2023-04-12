package M2Kegiatan2;

import java.util.Scanner;

public class LuasBelahKetupatS {
    public static void main(String[] args){
        int diagonal1, diagonal2, sisi, menu;
        double luas, keliling;
        boolean check = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~ Operasi Belah Ketupat ~~~");
        System.out.println("1. Keliling");
        System.out.println("2. Luas");
        
        do{
        System.out.print("Operasi apa yang akan anda jalankan? ");
        menu = scanner.nextInt();

            if(menu == 1){
            check = true;
            System.out.print("Input Sisi : ");
            sisi = scanner.nextInt();
            keliling = 4 * sisi;
            System.out.println("Keliling = " + keliling);
            } else if (menu == 2) {
            check = true;
            System.out.print("Input Diagonal 1 : ");
            diagonal1 = scanner.nextInt();
            System.out.print("Input Diagonal 2 : ");
            diagonal2 = scanner.nextInt();
            luas = diagonal1 * diagonal2 * 0.5;
            System.out.println("Luas = " + luas);
            } else {
            System.out.println("Menu Tidak Ada, Silahkan Memilih Kembali");
            }
        }
        while(!check);
            scanner.close();
    }
}