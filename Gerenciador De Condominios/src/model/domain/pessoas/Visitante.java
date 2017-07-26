package model.domain.pessoas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author aline.lima
 */
@Entity
@Table(name="visitante")
//@PrimaryKeyJoinColumn(name="cpf")
public class Visitante extends Pessoa{
    
    @Column (name="prestadorDeServico")
    private boolean prestadorDeServico;
    @Column (name="horario_entrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaDeEntrada;
    @Column (name="horario_saida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaDeSaida;
    
    @ManyToOne(optional=false)
    @JoinColumn(name="morador")
    private Morador morador;

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    
    
    public boolean isPrestadorDeServico() {
        return prestadorDeServico;
    }

    public void setPrestadorDeServico(boolean prestadorDeServico) {
        this.prestadorDeServico = prestadorDeServico;
    }

    public Date getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(Date horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public Date getHoraDeSaida() {
        return horaDeSaida;
    }

    public void setHoraDeSaida(Date horaDeSaida) {
        this.horaDeSaida = horaDeSaida;
    }
    
    
}

