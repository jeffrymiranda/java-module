module academy.jmiranda.ui {
    requires javafx.fxml;
    requires javafx.controls;
    requires academy.jmiranda.db;

    opens academy.jmiranda.ui;

    exports academy.jmiranda.ui;
}