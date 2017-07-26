package model.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.domain.pessoas.Usuario;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Reserva.class)
public abstract class Reserva_ {

	public static volatile SingularAttribute<Reserva, AreaComum> area;
	public static volatile SingularAttribute<Reserva, Date> horarioFim;
	public static volatile SingularAttribute<Reserva, Date> horarioInicio;
	public static volatile SingularAttribute<Reserva, Boolean> diaTodo;
	public static volatile SingularAttribute<Reserva, Integer> cod;
	public static volatile SingularAttribute<Reserva, Usuario> usuario;

}

