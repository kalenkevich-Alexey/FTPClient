package ftp.client.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;
import ftp.client.controller.Controller;
import javafx.util.Pair;

import java.io.IOException;

/**
 * Created by alex on 1/30/2017.
 */
public class RouterService {
    private static RouterService ourInstance = new RouterService();

    public static RouterService getInstance() {
        return ourInstance;
    }

    private RouterService() {

    }

    private Stage stage;

    public void setPrimaryStage(Stage stage) {
        this.stage = stage;
    }

    public Stage getPrimaryStage() {
        return stage;
    }

    private FXMLLoader loader;

    public Controller getController() {
        return loader.getController();
    }

    public Node getView(String path) {
        loader = new FXMLLoader(getClass().getClassLoader().getResource(path));
        Parent view = null;
        try {
            view = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return view;
    }
}
