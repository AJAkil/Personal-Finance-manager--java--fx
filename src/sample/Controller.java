package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.IOException;

public class Controller  {

    Main main = new Main();
    boolean flag = false;
    MaintainUser UserHash = new MaintainUser();


    public void getManager(MaintainUser obj){
        this.UserHash = obj;
    }



    @FXML
    private JFXTextField USERNAME;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton loginbutton;

    @FXML
    private JFXButton signupbutton;


    @FXML
    private JFXTextField UserNameSU;

    @FXML
    private JFXTextField PassWordSU;

    @FXML
    private JFXTextField mailSU;

    @FXML
    private JFXTextField ageSU;

    @FXML
    private JFXTextField occupation;

    @FXML
    private JFXTextField dateSU;

    @FXML
    private JFXButton CREATEACCOUNT;

    @FXML
    private JFXButton goback;

    @FXML
    private Label displayname ;

    @FXML
    private JFXTextField testfield;

    @FXML
    private JFXButton yesquit;

    @FXML
    private JFXButton noquit;

    @FXML
    private Label exit;

    @FXML
    private Label profile;



    @FXML
    private JFXListView<String> jfxlist= new JFXListView<>();

    @FXML
    public void initilize(){
        displayname.setText(testfield.getText());
    }

    public void listhandler(){

        ObservableList<String>list = FXCollections.observableArrayList("My Info","My Finances","Exit");
        jfxlist.setItems(list);
        /*jfxlist.depthProperty().setValue(1);
        jfxlist.setExpanded(true);*/
    }

    @FXML
    void backtologin(ActionEvent event) throws IOException {
        main.ShowLogin();
    }


    @FXML
    void getAGESU(ActionEvent event) {

    }

    @FXML
    void getSUNAme(ActionEvent event) {

    }

    @FXML
    void getdateSU(ActionEvent event) {

    }

    @FXML
    void getmailSU(ActionEvent event) {

    }

    @FXML
    void getoccupationSU(ActionEvent event) {

    }

    @FXML
    void getpassSU(ActionEvent event) {

    }


    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    void signup(ActionEvent event) throws IOException {
        main.ShowSignUp();
    }

    public void getName(ActionEvent actionEvent) {
    }

    @FXML
    void createacc(ActionEvent event) {

        USER userobj = new USER();
        userobj.setuser(UserNameSU.getText(),PassWordSU.getText(),ageSU.getText(),dateSU.getText(),mailSU.getText(),occupation.getText());
        UserHash.getentry(userobj);

        UserHash.PrintEverything();

        ///the problem  is behind this scope the hash-map is null
    }


    @FXML
    void getUSERNAME(ActionEvent event) {
    }

    @FXML
    void getpassword(ActionEvent event) {
    }


    void checkEntry() {

        System.out.println();
        if(UserHash.GiveUserName(USERNAME.getText()).equals(USERNAME.getText())){
            if(password.getText().equals(UserHash.GiveUserpassword(USERNAME.getText()))){
                flag = true;
            }else{

            }
        }else{

        }
    }

    @FXML
    void login(ActionEvent event) throws IOException {

        main.ShowDashBoard();
        listhandler();

        /*checkEntry();

        if(flag == true) main.ShowDashBoard();
        else{
            System.out.println("NOPE");
        }*/
    }

    @FXML
    void DONTQUIT(ActionEvent event) {
        main.backdoor.close();
    }

    @FXML
    void QUIT(ActionEvent event) {
        main.backdoor.close();
        main.Window.close();
    }

    @FXML
    void exit(MouseEvent event) throws IOException {
        try {
            main.exit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }








}
