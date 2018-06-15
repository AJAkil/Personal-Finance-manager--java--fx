package sample;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainFinanceController implements Initializable{

    Main main = new Main();

    public void setMain(Main main){
        this.main = main;
    }

    @FXML
    private TableView<TablwContents> FinanceTable;

    @FXML
    private TableColumn<TablwContents, String> ColSerialNo;

    @FXML
    private TableColumn<TablwContents, String> ColName;

    @FXML
    private TableColumn<TablwContents, String> ColType;

    @FXML
    private TableColumn<TablwContents, Double> ColAmount;

    @FXML
    private TableColumn<TablwContents, String> ColDate;

    @FXML
    private JFXButton Return;

    @FXML
    void ToMainMenu(ActionEvent event) throws IOException {
        main.ShowDashBoard();
    }

    @FXML
    private TextField Serial;

    @FXML
    private TextField Name;

    @FXML
    private TextField Type;

    @FXML
    private TextField Amount;

    @FXML
    private DatePicker Date;

    @FXML
    private JFXButton Update;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ColSerialNo.setCellValueFactory(new PropertyValueFactory<>("Serial"));
        ColName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        ColType.setCellValueFactory(new PropertyValueFactory<>("Type"));
        ColAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        ColDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        FinanceTable.setItems(tabledataList);

    }

    ObservableList<TablwContents>tabledataList = FXCollections.observableArrayList(
            new TablwContents("01","Bike","Expense","10000","12/12/12")
    );

    @FXML
    void UpdateTable(ActionEvent event) {
    TablwContents product = new TablwContents(Serial.getText(),Name.getText(),Type.getText(),Amount.getText(),Date.getValue().toString());
    FinanceTable.getItems().add(product);
    }
}
