package M6A;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class A extends Application {
    
   private TableView tableData = new TableView();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("MODUL 6 A");
        GridPane gPane = new GridPane();
//        gPane.setGridLinesVisible(false);
        gPane.setAlignment(Pos.CENTER);
        gPane.setHgap(10);
        gPane.setVgap(8);
//        gPane.setPadding(new Insets(10,10,10,10));


        Text judul = new Text("Data Mahasiswa");
        judul.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 20));
        gPane.add(judul, 0, 0, 2, 1);

        Text nama = new Text("Nama  ");
        gPane.add(nama, 0, 1);
        TextField fieldNama = new TextField();
        gPane.add(fieldNama, 1, 1);

        Text nim = new Text("NIM  ");
        gPane.add(nim, 0, 2);
        TextField fieldNim = new TextField();
        gPane.add(fieldNim, 1, 2);

        Text email = new Text("Email  ");
        gPane.add(email, 0, 3);
        TextField fieldEmail = new TextField();
        Text webmail = new Text("@webmail.umm.ac.id");
        gPane.add(fieldEmail, 1, 3);
        gPane.add(webmail, 2, 3);

        Text fakultas = new Text("Fakultas  ");
        gPane.add(fakultas, 0, 4);
        TextField fieldFak = new TextField();
        gPane.add(fieldFak, 1, 4);

        Text jurusan = new Text("Jurusan  ");
        gPane.add(jurusan, 0, 5);
        TextField fieldJur = new TextField();
        gPane.add(fieldJur, 1, 5);

        Text alamat = new Text("Alamat ");
        gPane.add(alamat, 0, 6);
        TextArea fieldAlamat = new TextArea();
        fieldAlamat.setMaxSize(500, 80);
        gPane.add(fieldAlamat, 1, 6);

        Text kota = new Text("Kota ");
        gPane.add(kota, 0, 7);
        TextField fieldKota = new TextField();
        gPane.add(fieldKota, 1, 7);

        HBox hbxSub = new HBox(20);
        hbxSub.setAlignment(Pos.BOTTOM_RIGHT);
        Button submit = new Button("CREATE");
        submit.setStyle("-fx-background-color:#6E85B7 ; -fx-text-fill: white");

        hbxSub.getChildren().add(submit);
        gPane.add(hbxSub, 1, 8);
        Scene scn1 = new Scene(gPane, 800, 450);

        //scene2
        TableColumn tNama = new TableColumn("Nama");
        TableColumn tNim = new TableColumn("NIM");
        TableColumn tEmail = new TableColumn("Email");
        TableColumn tFakultas = new TableColumn("Fakultas");
        TableColumn tJurusan = new TableColumn("Jurusan");
        TableColumn tAlamat = new TableColumn("Alamat");
        TableColumn tKota = new TableColumn("Kota");

        tableData.getColumns().addAll(tNama, tNim, tEmail, tFakultas, tJurusan, tAlamat, tKota);

        ObservableList<Main> gsBio = FXCollections.observableArrayList();
        tNama.setCellValueFactory(new PropertyValueFactory<Main, String>("mdNama"));
        tNim.setCellValueFactory(new PropertyValueFactory<Main, String>("mdNim"));
        tEmail.setCellValueFactory(new PropertyValueFactory<Main, String>("mdEmail"));
        tFakultas.setCellValueFactory(new PropertyValueFactory<Main, String>("mdFak"));
        tJurusan.setCellValueFactory(new PropertyValueFactory<Main, String>("mdJur"));
        tAlamat.setCellValueFactory(new PropertyValueFactory<Main, String>("mdAlamat"));
        tKota.setCellValueFactory(new PropertyValueFactory<Main, String>("mdKota"));

        tableData.setItems(gsBio);

        Scene scn2 = new Scene(tableData, 800, 450);

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (fieldNim.getText().isEmpty() || fieldNama.getText().isEmpty()
                        || fieldAlamat.getText().isEmpty() || fieldKota.getText().isEmpty()) {
                    Alert nimAlert = new Alert(Alert.AlertType.WARNING);
                    nimAlert.setTitle("Haaaai!");
                    nimAlert.setHeaderText("Data Diisi Semua Ya!");
                    nimAlert.showAndWait();
                } else if (fieldNim.getText().matches("[0-9]*")) {
                    primaryStage.setScene(scn2);
                    gsBio.add(new Main(null, null, null, null, null, null, null
                    ));
                } else {
                    Alert nimAlert2 = new Alert(Alert.AlertType.WARNING);
                    nimAlert2.setTitle("Oi Broooo!");
                    nimAlert2.setHeaderText("NIM Pake Angka Ya Masze~");
                    nimAlert2.showAndWait();
                }
            }
        });

        primaryStage.setScene(scn1);
        primaryStage.show();
    }
class Main {
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
}