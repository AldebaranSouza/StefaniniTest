package br.com.cielo.resource.dto;

import java.io.Serializable;

public class DadosDomicilioBancario implements Serializable {
	private static final long serialVersionUID = 568520479635501376L;
	
	private Integer codigoBanco;
	private Integer numeroAgencia;
	private Long numeroContaCorrente;

	/**
	 * @return the codigoBanco
	 */
	public Integer getCodigoBanco() {
		return codigoBanco;
	}

	/**
	 * @param codigoBanco
	 *            the codigoBanco to set
	 */
	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	/**
	 * @return the numeroAgencia
	 */
	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}

	/**
	 * @param numeroAgencia
	 *            the numeroAgencia to set
	 */
	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	/**
	 * @return the numeroContaCorrente
	 */
	public Long getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	/**
	 * @param numeroContaCorrente the numeroContaCorrente to set
	 */
	public void setNumeroContaCorrente(Long numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
}
