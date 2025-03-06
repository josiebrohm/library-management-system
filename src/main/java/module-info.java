module com.mylibrary {
    requires java.sql;
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;

    opens com.mylibrary to javafx.fxml;
    exports com.mylibrary;
}
