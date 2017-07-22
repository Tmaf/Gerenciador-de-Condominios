package model.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.domain.pessoas.Pessoa;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Veiculo.class)
public abstract class Veiculo_ {

	public static volatile SingularAttribute<Veiculo, Pessoa> pessoa;
	public static volatile SingularAttribute<Veiculo, String> modelo;
	public static volatile SingularAttribute<Veiculo, String> placa;

}

