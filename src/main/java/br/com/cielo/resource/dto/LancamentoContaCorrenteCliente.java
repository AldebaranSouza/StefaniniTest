package br.com.cielo.resource.dto;

import java.io.Serializable;

public class LancamentoContaCorrenteCliente implements Serializable{
	private static final long serialVersionUID = -4398661652702031429L;
	
	private Long numeroRemessaBanco;
	private String nomeSituacaoRemessa;
	private String nomeTipoOperacao;
	private DadosDomicilioBancario dadosDomicilioBancario;

	/**
	 * @return the numeroRemessaBanco
	 */
	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	/**
	 * @param numeroRemessaBanco
	 *            the numeroRemessaBanco to set
	 */
	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	/**
	 * @return the nomeSituacaoRemessa
	 */
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	/**
	 * @param nomeSituacaoRemessa
	 *            the nomeSituacaoRemessa to set
	 */
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	/**
	 * @return the dadosDomicilioBancario
	 */
	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	/**
	 * @param dadosDomicilioBancario
	 *            the dadosDomicilioBancario to set
	 */
	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	/**
	 * @return the nomeTipoOperacao
	 */
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	/**
	 * @param nomeTipoOperacao
	 *            the nomeTipoOperacao to set
	 */
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

}
