module com.tejeda.edadpersona {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tejeda.edadpersona to javafx.fxml;
    exports com.tejeda.edadpersona;
}
