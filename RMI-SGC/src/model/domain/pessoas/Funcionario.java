package model.domain.pessoas;

import java.rmi.RemoteException;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")

public class Funcionario extends PessoaVinculada {

    public Funcionario() throws RemoteException {
    }

    private static final long serialVersionUID = 1L;

    @Column(name = "setor_de_servico")
    private String setorDeServico;

    @Column(name = "horario_entrada")
    // @Temporal(value=TemporalType.TIME)
    private Date horarioEntrada;

    @Column(name = "horario_saida")
    // @Temporal(value=TemporalType.TIME)
    private Date horarioSaida;

    // Geters and Seters
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
