module org.sys_imc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.sys_imc to javafx.fxml;
    exports org.sys_imc;
}