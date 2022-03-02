module com.nmh.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nmh.bmiapp to javafx.fxml;
    exports com.nmh.bmiapp;
}
