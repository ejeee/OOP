package M2Kegiatan2;

import java.util.Scanner;

public class LuasBelahKetupatOOP {
    private int diagonal1, diagonal2, sisi, menu;
    private double luas, keliling;

    public void setDiagonal1(int diagonal1) {
        this.diagonal1 = diagonal1;
    }
    public int getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal2(int diagonal2) {
        this.diagonal2 = diagonal2;
    }
    public int getDiagonal2() {
        return diagonal2;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    public int getSisi() {
        return sisi;
    }

    public double getKeliling() {
        return keliling = 4 * sisi;
    }

    public double getLuas() {
        return luas = diagonal1 * diagonal2 * 0.5;
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~ Operasi Belah Ketupat ~~~");
        System.out.println("1. Keliling");
        System.out.println("2. Luas");

        boolean check = false;
        do{
        System.out.print("Operasi apa yang akan anda jalankan? ");
        menu = scanner.nextInt();

            if(menu == 1){
                check = true;
                System.out.print("\nInput Sisi : ");
                sisi = scanner.nextInt();
                System.out.print("Keliling = " + getKeliling());
            } else if(menu == 2){
                check = true;
                System.out.print("Input Diagonal 1 : ");
                diagonal1 = scanner.nextInt();
                System.out.print("Input Diagonal 2 : ");
                diagonal2 = scanner.nextInt();
                System.out.print("Luas = " + getLuas());
            } else {
            System.out.println("Menu Tidak Ada, Silahkan Pilih Kembali");
            }
        } while(!check);
        scanner.close();
    }
}