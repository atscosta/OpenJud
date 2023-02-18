package tech.remotelife.openjud.workspace;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class WorkspaceController implements Initializable {

    @FXML
    TabPane appTabPane;

    @FXML
    Tab areaTrabalhoTab;

    @FXML
    Tab processosTab;

    @FXML
    WebView novidadesWebView;

    public WorkspaceController() {
    }

    public void init() {

    }
    @FXML
    public void onSelectionTabChange() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.novidadesWebView.getEngine().load("https://pje.tjpb.jus.br/pje/login.seam");
    }
}
