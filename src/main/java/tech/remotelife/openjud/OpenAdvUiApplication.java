package tech.remotelife.openjud;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class OpenAdvUiApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/tech/remotelife/openjud/workspace/Workspace.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 760);

        stage.setTitle("OpenJud - Seu Jurídico Gratuito");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        OpenAdvUiApplication.launch();
    }
}