/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import model.domain.pessoas.Morador;

/**
 *
 * @author aline.lima
 */
@Entity
@Table(name="reclamacao")
public class Reclamacao implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    private String assunto;
    private String texto;
    private String respostaSindico;
    
    @ManyToOne(optional=false)
    @JoinColumn(name="cpf")
    private Morador morador;

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }
     
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getRespostaSindico() {
        return respostaSindico;
    }

    public void setRespostaSindico(String respostaSindico) {
        this.respostaSindico = respostaSindico;
    }
}
