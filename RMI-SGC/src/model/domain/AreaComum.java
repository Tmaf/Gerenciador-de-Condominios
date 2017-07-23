package model.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.domain.pessoas.Pessoa;

@Entity
@Table(name = "area_comum")
public class AreaComum implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nome")
	private String nomeArea;
	@Column(name = "valor")
	private double valor;
	@Column(name = "data")
	private Date dataReserva;
	@Column(name = "horaInicio")
	private Date horaInicio;
	@Column(name = "horaFim")
	private Date horaFim;
	@Column(name = "diaTodo")
	private boolean diaTodo;

	@ManyToOne(optional = false)
	@JoinColumn(name = "cpf")
	private Pessoa pessoa;

	public String getNomeArea() {
		return nomeArea;
	}

	public void setNomeArea(String nomeArea) {
		this.nomeArea = nomeArea;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getNome() {
		return nomeArea;
	}

	public void setNome(String nomeArea) {
		this.nomeArea = nomeArea;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Date horaFim) {
		this.horaFim = horaFim;
	}

	public boolean isDiaTodo() {
		return diaTodo;
	}

	public void setDiaTodo(boolean diaTodo) {
		this.diaTodo = diaTodo;
	}

}
