/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aline.lima
 */

@Entity
@Table(name="encomenda")
public class Encomenda implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    private String endereco;
    private String destinatario;
    private boolean entregue;
    private String codCorreio;

    public int getCodigo() {
        return codigo;
    }

    public String getCodCorreio() {
        return codCorreio;
    }

    public void setCodCorreio(String codCorreio) {
        this.codCorreio = codCorreio;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }
    
    

}
