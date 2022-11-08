module de.lubowiecki.client {
    requires javafx.controls;
    requires javafx.fxml;

    opens de.lubowiecki.client to javafx.fxml;
    exports de.lubowiecki.client;
}
