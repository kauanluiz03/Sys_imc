package org.sys_imc.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.sys_imc.model.Pessoa;

import java.text.DecimalFormat;

public class HelloController {
    @FXML
     public TextField txtNome;
    @FXML
    public TextField txtAltura;
    @FXML
    public TextField txtPeso;
    @FXML
    public Label lbIMC;

    Pessoa pessoa = new Pessoa();


    @FXML
    protected void onCalcularimcClick() {

        DecimalFormat df = new DecimalFormat();

        float imc;
        float altura;
        float peso;

        altura = Float.parseFloat(this.txtAltura.getText());
        peso = Float.parseFloat(this.txtPeso.getText());
        imc = peso / (altura * altura);

        df.applyPattern("#0.00");
        this.lbIMC.setText(df.format(imc));
    }
}