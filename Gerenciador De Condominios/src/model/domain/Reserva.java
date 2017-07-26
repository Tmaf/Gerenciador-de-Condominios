/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import model.domain.pessoas.Usuario;
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
    private Usuario usuario;
    
    @Column (name="horarioInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioInicio;
    
    @Column (name="horarioFim")
    @Temporal(TemporalType.TIME)
    private Date horarioFim;
    
    @Column (name="diaTodo")
    private boolean diaTodo;

    public boolean isDiaTodo() {
        return diaTodo;
    }

    public void setDiaTodo(boolean diaTodo) {
        this.diaTodo = diaTodo;
    }
    
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
