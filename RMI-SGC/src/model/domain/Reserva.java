package model.domain;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import model.domain.pessoas.PessoaVinculada;

@Entity
@Table(name="reserva")
public class Reserva extends UnicastRemoteObject implements Serializable, DomainInterface {
    
	public Reserva() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

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
