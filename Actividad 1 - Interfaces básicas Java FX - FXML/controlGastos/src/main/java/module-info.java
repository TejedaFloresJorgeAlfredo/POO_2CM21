module com.tejeda.controlgastos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tejeda.controlgastos to javafx.fxml;
    exports com.tejeda.controlgastos;
}
