package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Main main = new Main();
    boolean flag = false;
    MaintainUser UserHash = new MaintainUser();
    String test,line,line2,saveUsername;
    String[] out=null;

    public static final String INPUT_FILE_NAME="in.txt";
    public static final String OUTPUT_FILE_NAME="in.txt";


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try{
            BufferedReader br=new BufferedReader(new FileReader(INPUT_FILE_NAME));
            while(true){
                line=br.readLine();
                if(line==null) break;
                out=line.split(",");
                USER userobj = new USER();
                userobj.setuser(out[0],out[1],out[2],out[3],out[4],out[5]);
                UserHash.getentry(userobj);
            }

            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


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
    public JFXTextField testfield;

    @FXML
    private JFXButton yesquit;

    @FXML
    private JFXButton noquit;

    @FXML
    private Label profile;

    @FXML
    private Tab MyProfiletab;

    @FXML
    private JFXTextField testextfield;

    @FXML
    private Label Label;

    @FXML
    private JFXButton change;

    @FXML
    private JFXButton MyPro;

    @FXML
    private JFXButton exit;


    @FXML
    private JFXButton BackFromMonthSelector;

    @FXML
    private JFXButton Proceed;

    @FXML
    private JFXButton Settings;

    @FXML
    private JFXButton MyFinances;

    @FXML
    private JFXButton editInfo;

    @FXML
    private JFXButton GOBack;

    @FXML
    void ProceedTOFinance(ActionEvent event) throws IOException {
        main.ShowFinances();
    }

    @FXML
    void getUSERNAME(ActionEvent event) {

    }

    @FXML
    void getpassword(ActionEvent event) {

    }

    @FXML
    void ShowSettings(ActionEvent event) throws IOException {
        main.ShowSettings();
    }

    @FXML
    void ShowFinances(ActionEvent event) throws IOException {
            main.ShowMonthSetter();
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
    void GOback(ActionEvent event) throws IOException {
            main.ShowDashBoard();
    }

    @FXML
    void change(ActionEvent event) {

    }

    @FXML
    void signup(ActionEvent event) throws IOException {
        UserHash.PrintEverything();
        main.ShowSignUp();
    }

    public void getName(ActionEvent actionEvent) {
    }

    @FXML
    void createacc(ActionEvent event) {

        USER userobj = new USER();
        userobj.setuser(UserNameSU.getText(),PassWordSU.getText(),ageSU.getText(),dateSU.getText(),mailSU.getText(),occupation.getText());
        UserHash.getentry(userobj);
    }

    void checkEntry() {
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

        /*UserHash.PrintEverything();*/

        main.ShowDashBoard();

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

        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME));
            System.out.println(UserHash.GiveNameofUser());
                line2 = new String(UserHash.usertable.get(UserHash.GiveNameofUser()).getName()+","+UserHash.usertable.get(UserHash.GiveNameofUser()).getLoginpass()+","+UserHash.usertable.get(UserHash.GiveNameofUser()).getAge()+","+UserHash.usertable.get(UserHash.GiveNameofUser()).getDateOfCeation()+","+UserHash.usertable.get(UserHash.GiveNameofUser()).getEmail()+","+UserHash.usertable.get(UserHash.GiveNameofUser()).getOccupation());
                bw.write(line2+"\n");
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        main.backdoor.close();
        main.Window.close();
    }

    @FXML
    void exit(ActionEvent event) throws IOException {
        try {
            main.exit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showProfile(ActionEvent event) throws IOException {
        main.ShowProfile();
    }

}
