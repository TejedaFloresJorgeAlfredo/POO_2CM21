module com.tejeda.desglosedinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tejeda.desglosedinero to javafx.fxml;
    exports com.tejeda.desglosedinero;
}
