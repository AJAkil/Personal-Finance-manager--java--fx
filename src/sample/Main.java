package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    Stage Window = new Stage();
    Stage backdoor;
    Scene exitscene;
    MaintainUser UserHash = new MaintainUser();

    @Override
    public void start(Stage primaryStage) throws Exception{
        ShowLogin();
        Window = primaryStage;
    }

    public void ShowLogin() throws IOException{
        ///Parent root = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("loginScreen.fxml"));
        Parent root = loader.load();


        Window.setTitle("FINANCE");
        Window.setScene(new Scene(root, 900, 600));
        Window.show();

        Controller control=loader.getController();
        control.getManager(UserHash);
        control.setMain(this);
    }


    public void ShowSignUp() throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("SignUP.fxml"));
        Parent root = loader.load();


        Window.setTitle("Sign UP");
        Window.setScene(new Scene(root, 1366, 768));
        Window.show();

        Controller control=loader.getController();
        control.getManager(UserHash);
        control.setMain(this);
    }

    public void ShowDashBoard() throws IOException{
        ///Parent root = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("DashBoard.fxml"));
        Parent root = loader.load();


        Window.setTitle("FINANCE");
        Window.setScene(new Scene(root, 1366, 768));
        Window.show();

        Controller control=loader.getController();
        control.getManager(UserHash);
        control.setMain(this);

    }

    public void ShowProfile() throws IOException{

        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("Profiledisplay.fxml"));
        Parent root = loader.load();


        Window.setTitle("Profile");
        Window.setScene(new Scene(root, 1366, 768));
        Window.show();

        Controller control=loader.getController();
        control.getManager(UserHash);
        control.setMain(this);
    }

    public void exit() throws IOException{
        ///Parent root = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("Alert.fxml"));
        Parent root = loader.load();

        Controller control=loader.getController();
        control.getManager(UserHash);
        control.setMain(this);
        exitscene = new Scene(root,600,400);

        backdoor=new Stage();
        backdoor.initModality(Modality.APPLICATION_MODAL);
        backdoor.setTitle("Quit");
        backdoor.setScene(exitscene);
        backdoor.showAndWait();
    }

    public void ShowMonthSetter() throws IOException{

        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("MonthSelector.fxml"));
        Parent root = loader.load();


        Window.setTitle("Month Picker");
        Window.setScene(new Scene(root, 1366, 768));
        Window.show();

        Controller control=loader.getController();
        control.getManager(UserHash);
        control.setMain(this);
    }


    public void ShowSettings() throws IOException{

        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("Settings.fxml"));
        Parent root = loader.load();


        Window.setTitle("Settings");
        Window.setScene(new Scene(root, 1366, 768));
        Window.show();

        Controller control=loader.getController();
        control.getManager(UserHash);
        control.setMain(this);
    }

    public void ShowFinances() throws IOException{

        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("FinancialData.fxml"));
        Parent root = loader.load();


        Window.setTitle("Data");
        Window.setScene(new Scene(root, 1366, 768));
        Window.show();

        MainFinanceController control=loader.getController();
        control.setMain(this);

        Controller actualControler = loader.getController();
        actualControler.setMain(this);
        actualControler.getManager(UserHash);
    }




    public static void main(String[] args) {
        launch(args);
    }
}
