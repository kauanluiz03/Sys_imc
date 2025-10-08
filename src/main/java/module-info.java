module org.sys_imc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.sys_imc to javafx.fxml;
    exports org.sys_imc;
    exports org.sys_imc.controller;
    opens org.sys_imc.controller to javafx.fxml;
}