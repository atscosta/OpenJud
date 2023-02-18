module com.remotelife.openadv {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens tech.remotelife.openjud to javafx.fxml;
    exports tech.remotelife.openjud;

    opens tech.remotelife.openjud.workspace to javafx.fxml;
    exports tech.remotelife.openjud.workspace;
}