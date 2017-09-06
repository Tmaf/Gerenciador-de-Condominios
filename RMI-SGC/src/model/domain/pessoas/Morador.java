package model.domain.pessoas;

import java.io.Serializable;
import java.rmi.RemoteException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Morador")
public class Morador extends PessoaVinculada implements Serializable {
    
    public Morador () throws RemoteException{}

    private static final long serialVersionUID = 1L;

    @Column(name = "endereco")
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
