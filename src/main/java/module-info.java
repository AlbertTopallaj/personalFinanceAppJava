module se.alberttopallaj.personalfinanceappjava.personalfinanceappjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens se.alberttopallaj.personalfinanceappjava.personalfinanceappjava to javafx.fxml;
    exports se.alberttopallaj.personalfinanceappjava.personalfinanceappjava;
}