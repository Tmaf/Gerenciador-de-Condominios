package model.domain;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Financeiro.class)
public abstract class Financeiro_ {

	public static volatile SingularAttribute<Financeiro, Date> baixa;
	public static volatile SingularAttribute<Financeiro, String> tipoLancamento;
	public static volatile SingularAttribute<Financeiro, String> cpf;
	public static volatile SingularAttribute<Financeiro, String> nome;
	public static volatile SingularAttribute<Financeiro, String> tipoFinanceiro;
	public static volatile SingularAttribute<Financeiro, String> tipoPagamento;
	public static volatile SingularAttribute<Financeiro, Date> emissao;
	public static volatile SingularAttribute<Financeiro, Date> vencimento;
	public static volatile SingularAttribute<Financeiro, String> nroDocumento;

}

