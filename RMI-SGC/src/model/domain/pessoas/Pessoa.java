package model.domain.pessoas;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import model.domain.DomainInterface;

/**
 *
 * @author Tarcísio M. Almeida
 */
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa extends UnicastRemoteObject implements Serializable, DomainInterface {

    public Pessoa() throws RemoteException {
    }

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;
    @Column(name = "nome", nullable = false)
    private String nome;
    private String telefone;

    // Gets and Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
