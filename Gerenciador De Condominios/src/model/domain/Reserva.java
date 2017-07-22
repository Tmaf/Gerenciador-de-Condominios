/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import model.domain.pessoas.PessoaVinculada;
import org.hibernate.annotations.Type;

/**
 *
 * @author Aline
 */

@Entity
@Table(name="reserva")
public class Reserva implements Serializable {
    
    @Id
    @GeneratedValue
    private int cod;
    
    @ManyToOne(optional=false)
    @JoinColumn(name="nome")
    private AreaComum area;
    
    @ManyToOne(optional=false)
    @JoinColumn(name="cpf")
    private PessoaVinculada pessoa;
    
    @Column (name="horarioInicio")
    @Type(type="timestamp")
    private Date horarioInicio;
    
    @Column (name="horarioFim")
    @Type(type="timestamp")
    private Date horarioFim;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public AreaComum getArea() {
        return area;
    }

    public void setArea(AreaComum area) {
        this.area = area;
    }

    public PessoaVinculada getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaVinculada pessoa) {
        this.pessoa = pessoa;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(Date horarioFim) {
        this.horarioFim = horarioFim;
    }
    
}
