/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.pessoas;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author aline.lima
 */

@Entity
@Table(name="funcionario")

public class Funcionario extends PessoaVinculada{
    
    @Column (name="setor_de_servico")
    private String setorDeServico;

    @Temporal(TemporalType.TIME)
    @Column (name="horario_entrada")
    private Date horarioEntrada;
   
    @Temporal(TemporalType.TIME)
    @Column (name="horario_saida")
    private Date horarioSaida;
    
   //Geters and Seters
    public String getSetorDeServico() {
        return setorDeServico;
    }
    public void setSetorDeServico(String setorDeServico) {
        this.setorDeServico = setorDeServico;
    }
    public Date getHorarioEntrada() {
        return horarioEntrada;
    }
    public void setHorarioEntrada(Date horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }
    public Date getHorarioSaida() {
        return horarioSaida;
    }
    public void setHorarioSaida(Date horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

   
}
