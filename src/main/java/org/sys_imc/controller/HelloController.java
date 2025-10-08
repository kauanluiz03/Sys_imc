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
    @FXML
    public Label lbClassificação;

    Pessoa pessoa = new Pessoa();


    @FXML
    protected void onCalcularimcClick() {

        DecimalFormat df = new DecimalFormat();

       this.pessoa.setNome(this.txtNome.getText());
       this.pessoa.setAltura(Float.parseFloat(this.txtAltura.getText()));
        this.pessoa.setPeso(Float.parseFloat(this.txtPeso.getText()));



        df.applyPattern("#0.00");
        this.lbIMC.setText(df.format(this.pessoa.calcularIMC()));
        this.lbClassificação.setText(this.pessoa.ClassificaçãoIMC());
    }
}