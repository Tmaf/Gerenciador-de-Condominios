package model.domain.pessoas;

import java.rmi.RemoteException;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "visitante")
@PrimaryKeyJoinColumn(name = "cpf")
public class Visitante extends Pessoa {

    public Visitante() throws RemoteException {
    }

    private static final long serialVersionUID = 1L;

    @Column(name = "prestadorDeServico")
    private boolean prestadorDeServico;
    @Column(name = "horario_entrada")
    private Date horaDeEntrada;
    @Column(name = "horario_saida")
    private Date horaDeSaida;

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
