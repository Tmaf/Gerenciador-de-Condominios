package model.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "financeiro")
public class Financeiro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String nroDocumento;
	private String fornecedor;
	private String tipoFinanceiro; // se é receita ou despesa
	private String tipoPagamento;
	private String tipoLancamento;
	private Date emissao; // data que a fatura foi emitida ou lancada no sistema
	private Date vencimento;
	private Date baixa; // data pagamento

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getTipoFinanceiro() {
		return tipoFinanceiro;
	}

	public void setTipoFinanceiro(String tipoFinanceiro) {
		this.tipoFinanceiro = tipoFinanceiro;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(String tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public Date getEmissao() {
		return emissao;
	}

	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Date getBaixa() {
		return baixa;
	}

	public void setBaixa(Date baixa) {
		this.baixa = baixa;
	}

}
