package ftp.client.component.popup;

import ftp.client.controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ftp.client.FTPClient.user.User;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by alex on 1/29/2017.
 */
public class AuthorisationPopupController implements Controller {

    @FXML
    private TextField hostField;

    @FXML
    private TextField portField;

    @FXML
    private TextField loginField;

    //todo change to PasswordField
    @FXML
    private TextField passField;

    private Stage dialogStage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void onSubmit() {
        this.dialogStage.close();
    }

    public TextField getLoginField() {
        return loginField;
    }

    public void setLoginField(TextField loginField) {
        this.loginField = loginField;
    }

    public TextField getPassField() {
        return passField;
    }

    public void setPassField(PasswordField passField) {
        this.passField = passField;
    }

    public Stage getDialogStage() {
        return dialogStage;
    }

    public String getLogin() {
        return this.getLoginField().getText();
    }

    public String getPassword() {
        return this.getPassField().getText();
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public TextField getHostField() {
        return hostField;
    }

    public void setHostField(TextField hostField) {
        this.hostField = hostField;
    }

    public TextField getPortField() {
        return portField;
    }

    public void setPortField(TextField portField) {
        this.portField = portField;
    }

    public User getUser() {
        return new User(this.getHostField().getText(), Integer.parseInt(this.getPortField().getText()), this.getLogin(), this.getPassword());
    }
}