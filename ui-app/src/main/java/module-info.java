module at.technikum.uiapp {
    requires java.net.http;
    requires javafx.controls;
    requires javafx.fxml;

    opens at.technikum.uiapp to javafx.fxml;
    exports at.technikum.uiapp;
}
