package M2Kegiatan1;

import java.util.Scanner;//library

public class Nilai {
        private int NilaiProgdas, NilaiKalkulus, NilaiOrkom;
        private double hasil;
        //agar tidak dapat diacces class lain

        public void setNilaiProgdas(int NilaiProgdas) {
            this.NilaiProgdas = NilaiProgdas;
        }
        public int getNilaiProgdas() {
            return NilaiProgdas;
        }

        public void setNilaiKalkulus(int NilaiKalkulus) {
            this.NilaiKalkulus = NilaiKalkulus;
        }
        public int getNilaiKalkulus() {
            return NilaiKalkulus;
        }

        public void setNilaiOrkom(int NilaiOrkom) {
            this.NilaiOrkom = NilaiOrkom;
        }
        public int getNilaiOrkom() {
            return NilaiOrkom;
        }

        public void rataRata(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nilai Progdas\t: ");
            setNilaiProgdas(scanner.nextInt());
            System.out.print("Nilai Kalkulus\t: ");
            setNilaiKalkulus(scanner.nextInt());
            System.out.print("Nilai Orkom\t: ");
            setNilaiOrkom(scanner.nextInt());

            System.out.println("\nNilai Anda : ");
            System.out.println("Nilai Progdas\t: " + getNilaiProgdas());
            System.out.println("Nilai Kalkulus\t: " + getNilaiKalkulus());
            System.out.println("Nilai Orkom\t: " + getNilaiOrkom());

            this.hasil = (this.NilaiProgdas + this.NilaiKalkulus + this.NilaiOrkom) / 3;
            System.out.println("\nRata Rata Nilai : " + this.hasil);

            scanner.close();
        }
        
        public void cekNilai(){
            System.out.print("Status : ");
            if(this.hasil >= 70 && this.hasil <=100){
                System.out.print("Lulus");
                System.out.println("\nSelamat Anda Lulus! Yeayy!\n");
            } else if (this.hasil >= 0 && this.hasil <70)
                System.out.print("Tidak Lulus\nSabar Ya, Semangat!\n\n");
        }
}
