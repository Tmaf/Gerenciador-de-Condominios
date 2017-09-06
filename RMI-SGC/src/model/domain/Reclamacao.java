package model.domain;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reclamacao")
public class Reclamacao extends UnicastRemoteObject implements Serializable, DomainInterface {

	public Reclamacao() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int codigo;
	private String assunto;
	private String texto;
	private String respostaSindico;

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
