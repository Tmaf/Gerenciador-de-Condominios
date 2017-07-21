package model.domain;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.domain.pessoas.Pessoa;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AreaComum.class)
public abstract class AreaComum_ {

	public static volatile SingularAttribute<AreaComum, Date> horaFim;
	public static volatile SingularAttribute<AreaComum, Pessoa> pessoa;
	public static volatile SingularAttribute<AreaComum, Date> dataReserva;
	public static volatile SingularAttribute<AreaComum, String> nomeArea;
	public static volatile SingularAttribute<AreaComum, Double> valor;
	public static volatile SingularAttribute<AreaComum, Boolean> diaTodo;
	public static volatile SingularAttribute<AreaComum, Date> horaInicio;

}

