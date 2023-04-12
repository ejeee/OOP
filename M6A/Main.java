package M6A;

import javafx.beans.property.SimpleStringProperty;

public class Main {
    private SimpleStringProperty nama;
    private SimpleStringProperty nim;
    private SimpleStringProperty email;
    private SimpleStringProperty fak;
    private SimpleStringProperty jur;
    private SimpleStringProperty alamat;
    private SimpleStringProperty kota;
    
    public Main (String nama, String nim, String email, String fak, String jur, String alamat, String kota) {
        this.nama = new SimpleStringProperty(nama);
        this.nim = new SimpleStringProperty(nim);
        this.email = new SimpleStringProperty(email);
        this.fak = new SimpleStringProperty(fak);
        this.jur = new SimpleStringProperty(jur);
        this.alamat = new SimpleStringProperty(alamat);
        this.kota = new SimpleStringProperty(kota);
        
    }

    public String getMdNama() {
        return nama.get();
    }
    public String getMdNim() {
        return nim.get();
    }
    public String getMdEmail() {
        return email.get();
    }
    public String getMdFak() {
        return fak.get();
    }
    public String getMdJur() {
        return jur.get();
    }
    public String getMdAlamat() {
        return alamat.get();
    }
    public String getMdKota() {
        return kota.get();
    }

    public void setMdNama(String nama) {
        this.nama.set(nama);
    }
    public void setMdNim(String nim) {
        this.nim.set(nim);
    }
    public void setMdEmail(String email) {
        this.email.set(email);
    }
    public void setMdFak(String fak) {
        this.fak.set(fak);
    }
    public void setMdJur(String jur) {
        this.jur.set(jur);
    }
    public void setMdAlamat(String alamat) {
        this.alamat.set(alamat);
    }
    public void setMdKota(String kota) {
        this.kota.set(kota);
    }
}



