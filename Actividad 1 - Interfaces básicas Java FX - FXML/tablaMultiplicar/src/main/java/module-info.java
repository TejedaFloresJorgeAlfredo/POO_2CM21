module com.tejeda.tablamultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tejeda.tablamultiplicar to javafx.fxml;
    exports com.tejeda.tablamultiplicar;
}
