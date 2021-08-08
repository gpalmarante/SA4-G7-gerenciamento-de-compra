module com.mycompany.sa4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.sa4 to javafx.fxml;
    exports com.mycompany.sa4;
}
