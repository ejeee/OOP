package M6B;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.TableView;
import javafx.util.Callback;

//field nama dosen, mata kuliah, GKB, waktu, dan ruangan
//CRUD data tiap matkul
//data ditampung di table, input tidak boleh kosong, nim berupa angka

public class Tampilan extends Application {

    private final ObservableList<B> data = FXCollections.observableArrayList();
    final HBox hBox = new HBox();
    private final TableView<B> table = new TableView<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new Group(), 900, 500);
        scene.setFill(Color.CORAL);
        stage.setTitle("MODUL 6 B");
        
       
        
        table.setEditable(true);

        TableColumn Namadosenkuliah = new TableColumn("Nama Dosen");
            
            Namadosenkuliah.setMinWidth(200);
            Namadosenkuliah.setCellValueFactory(new Callback <TableColumn.CellDataFeatures <B, String>, ObservableValue>() {
            
        @Override
        public ObservableValue call(TableColumn.CellDataFeatures<B, String> p) {
                return p.getValue().nameDosenProperty();
            }
        }
            );

        TableColumn Namamatkulkuliah = new TableColumn("Matkul");
        Namamatkulkuliah.setCellValueFactory(new PropertyValueFactory <B, String> ("Matkul"));
        Namamatkulkuliah.setCellValueFactory(new Callback <TableColumn.CellDataFeatures <B, String>, ObservableValue>() {
            
        @Override
        public ObservableValue call (TableColumn.CellDataFeatures<B, String> p) {
                return p.getValue().nameMatkulProperty();
            }
        }
            );

        TableColumn Waktukuliah = new TableColumn("Waktu");
        Waktukuliah.setCellValueFactory(new PropertyValueFactory<B, String>("Waktu"));
        Waktukuliah.setCellValueFactory(new Callback <TableColumn.CellDataFeatures <B, String>, ObservableValue>() {
            
        @Override
        public ObservableValue call(TableColumn.CellDataFeatures<B, String> p) {
                return p.getValue().timeProperty();
            }
        }
            );

        TableColumn Gkbkuliah = new TableColumn("GKB");
        Gkbkuliah.setCellValueFactory(new PropertyValueFactory<B, String>("GKB"));
        Gkbkuliah.setCellValueFactory(new Callback<TableColumn.CellDataFeatures <B, String>, ObservableValue>() {
           
        @Override
        public ObservableValue call(TableColumn.CellDataFeatures<B, String> p) {
                return p.getValue().gkbProperty();
            }
        }
            );

        TableColumn Ruangkuliah = new TableColumn("Ruangan");
        Ruangkuliah.setCellValueFactory(new PropertyValueFactory<B, String>("Ruangan"));
        Ruangkuliah.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<B, String>, ObservableValue>() {
                    
        @Override
        public ObservableValue call(TableColumn.CellDataFeatures<B, String> p) {
                        return p.getValue().ruanganProperty();
                    }
         }
            );

        table.getColumns().add(Namadosenkuliah);
        table.getColumns().add(Namamatkulkuliah);
        table.getColumns().add(Waktukuliah);
        table.getColumns().add(Gkbkuliah);
        table.getColumns().add(Ruangkuliah);
        table.setItems(data);

        final TextField addName = new TextField();
        addName.setPromptText("Nama Dosen");

        final TextField addMatkul = new TextField();
        addMatkul.setPromptText("Nama Matkul");

        final TextField addWaktu = new TextField();
        addWaktu.setPromptText("Waktu");

        final TextField addGKB = new TextField();
        addGKB.setPromptText("GKB");
        addGKB.textProperty().addListener(new ChangeListener<String>() {
            
        @Override
        public void changed(ObservableValue <? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    addGKB.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });

        final TextField addRuangan = new TextField();
        addRuangan.setPromptText("Ruangan");

        final Button addButton = new Button("Add");
        addButton.setOnAction((ActionEvent e) -> {
            String Dosen = addName.getText();
            String Matkul = addMatkul.getText();
            String Waktu = addWaktu.getText();
            String Gkb = addGKB.getText();
            String Ruangan = addRuangan.getText();

            if (Dosen.isEmpty() || Matkul.isEmpty() || Waktu.isEmpty() || Gkb.isEmpty() || Ruangan.isEmpty()) {
                Alert a = new Alert(Alert.AlertType.INFORMATION,
                        "Data Yang Di Input Harus Tidak Ada Yang Boleh Kosong");
                a.setTitle("Alert");
                a.showAndWait();
            } else {
                Alert a = new Alert(Alert.AlertType.INFORMATION, "Data Telah Di Tambahkan");
                a.setTitle("Success");
                a.showAndWait();
                data.add(new B(
                        addName.getText(),
                        addMatkul.getText(),
                        addWaktu.getText(),
                        addGKB.getText(),
                        addRuangan.getText()));
                addName.clear();
                addMatkul.clear();
                addWaktu.clear();
                addGKB.clear();
                addRuangan.clear();
            }

        });

        Button updateButton = new Button("Update");
        updateButton.setBackground(new Background (new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        updateButton.setOnAction((ActionEvent e) -> {
            Dialog d = new Alert(Alert.AlertType.INFORMATION, "Update Sucess!!!");
            d.show();
            table.getItems().remove(table.getSelectionModel().getSelectedIndex());
            data.add(new B(addName.getText(), addMatkul.getText(), addWaktu.getText(), addGKB.getText(),
                    addRuangan.getText()));
            addName.clear();
            addMatkul.clear();
            addWaktu.clear();
            addGKB.clear();
            addRuangan.clear();

        });

        final Button deleteButton = new Button("Delete");
        deleteButton.setBackground(new Background (new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        deleteButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Dialog d = new Alert(Alert.AlertType.INFORMATION, "Delete Success!!!");
                d.show();
                table.getItems().removeAll(table.getSelectionModel().getSelectedItem());
            }
        });
        //final buat set font, warna
        final Label label2 = new Label("Nama Dosen");
        label2.setFont(Font.font("Calibri", 14));
        label2.setAlignment(Pos.BASELINE_CENTER);
        label2.setTextFill(Color.BLACK);

        final Label label3 = new Label("Mata Kuliah");
        label3.setFont(Font.font("Calibri", 14));
        label3.setAlignment(Pos.BASELINE_CENTER);
        label3.setTextFill(Color.BLACK);

        final Label label4 = new Label("GKB");
        label4.setFont(Font.font("Calibri", 14));
        label4.setAlignment(Pos.BASELINE_CENTER);
        label4.setTextFill(Color.BLACK);

        final Label label5 = new Label("Waktu");
        label5.setFont(Font.font("Calibri", 14));
        label5.setAlignment(Pos.BASELINE_CENTER);
        label5.setTextFill(Color.BLACK);

        final Label label6 = new Label("Ruangan");
        label6.setFont(Font.font("Calibri", 14));
        label6.setAlignment(Pos.BASELINE_CENTER);
        label6.setTextFill(Color.BLACK);

        //vertical box untuk kotak tabel
        VBox vbox2 = new VBox();
        vbox2.setPrefWidth(100);
        vbox2.setPrefHeight(185);
        vbox2.setSpacing(20);
        vbox2.setPadding(new Insets(10, 10, 10, 10));
        vbox2.getChildren().addAll(label2, label3, label4, label5, label6);

        VBox vbox3 = new VBox();
        vbox3.setPrefWidth(185);
        vbox3.setPrefHeight(185);
        vbox3.setLayoutX(49);
        vbox3.setLayoutY(25);
        vbox3.setSpacing(12);
        vbox3.getChildren().addAll(addName, addMatkul, addGKB,
                addWaktu, addRuangan);

        //anchor untuk seting tata letak koordinat set top set left
        AnchorPane anchorPane = new AnchorPane(vbox2, vbox3, table, addButton, deleteButton, updateButton);
        // setting vbox2
        anchorPane.setTopAnchor(vbox2, 10.0);
        anchorPane.setLeftAnchor(vbox2, 10.0);
        // seting vbox3
        anchorPane.setTopAnchor(vbox3, 20.0);
        anchorPane.setLeftAnchor(vbox3, 115.0);
        // setting table
        anchorPane.setTopAnchor(table, 20.0);
        anchorPane.setLeftAnchor(table, 320.0);

        // setting btn tambah
        anchorPane.setTopAnchor(addButton, 250.0);
        anchorPane.setLeftAnchor(addButton, 20.0);

        // setting btn hapus
        anchorPane.setTopAnchor(deleteButton, 250.0);
        anchorPane.setLeftAnchor(deleteButton, 195.0);

        // setting btn ubah
        anchorPane.setTopAnchor(updateButton, 250.0);
        anchorPane.setLeftAnchor(updateButton, 250.0);

        ((Group) scene.getRoot()).getChildren().addAll(anchorPane);

        stage.setScene(scene);
        stage.show();
    }
}