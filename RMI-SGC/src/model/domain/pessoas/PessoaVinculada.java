package model.domain.pessoas;

import java.rmi.RemoteException;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "pessoavinculada")
@PrimaryKeyJoinColumn(name = "cpf")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PessoaVinculada extends Pessoa {
    
    public PessoaVinculada () throws RemoteException{}

	private static final long serialVersionUID = 1L;
	@Column(name = "email")
	private String email;

	// Gets and Sets
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}