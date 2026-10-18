module com.tejeda.numanalisis {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tejeda.numanalisis to javafx.fxml;
    exports com.tejeda.numanalisis;
}
