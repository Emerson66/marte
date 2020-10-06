package com.nosreme.marte.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nosreme.marte.domain.enums.EstadoPagamento;
//@Entity
public class PagamentoComBoleto extends Pagamento {

	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataVencimento;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataPagamento;

	public PagamentoComBoleto() {

	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, com.nosreme.marte.domain.Pedido pedido,
			Date dataVencimeto, Date dataPagamento) {
		super(id, estado, pedido);
		
		
		this.dataPagamento = dataPagamento;
		
		this.dataVencimento = dataVencimeto;
		// TODO Auto-generated constructor stub
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
