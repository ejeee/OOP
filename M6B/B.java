package M6B;

import javafx.beans.property.SimpleStringProperty;

public class B {

  private SimpleStringProperty nameDosen;
  private SimpleStringProperty nameMatkul;
  private SimpleStringProperty time;
  private SimpleStringProperty gkb;
  private SimpleStringProperty ruangan;

        B(String Dos, String Matkul, String waktu, String gedung, String ruang) {
            
            this.nameDosen = new SimpleStringProperty(Dos);
            this.nameMatkul = new SimpleStringProperty(Matkul);
            this.time = new SimpleStringProperty(waktu);
            this.gkb = new SimpleStringProperty(gedung);
            this.ruangan = new SimpleStringProperty(ruang);
  }

  public String getNameDosen() {
    return nameDosen.get();
  }

  public SimpleStringProperty nameDosenProperty() {
    if (nameDosen == null)
      nameDosen = new SimpleStringProperty(this, "NamaDosen");
    return nameDosen;
  }

  public void setNameDosen(String nameDosen) {
    this.nameDosen.set(nameDosen);
  }

  public String getNameMatkul() {
    return nameMatkul.get();
  }

  public SimpleStringProperty nameMatkulProperty() {
    return nameMatkul;
  }

  public void setNameMatkul(String nameMatkul) {
    this.nameMatkul.set(nameMatkul);
  }

  public String getTime() {
    return time.get();
  }

  public SimpleStringProperty timeProperty() {
    return time;
  }

  public void setTime(String time) {
    this.time.set(time);
  }

  public String getGkb() {
    return gkb.get();
  }

  public SimpleStringProperty gkbProperty() {
    return gkb;
  }

  public void setGkb(String gkb) {
    this.gkb.set(gkb);
  }

  public String getRuangan() {
    return ruangan.get();
  }

  public SimpleStringProperty ruanganProperty() {
    return ruangan;
  }

  public void setRuangan(String ruangan) {
    this.ruangan.set(ruangan);
  }

}