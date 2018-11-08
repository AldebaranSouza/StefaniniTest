package br.com.cielo.resource.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ControleLancamento implements Serializable{
	private static final long serialVersionUID = -2613460398692915609L;
	
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	private LocalDate dataEfetivaLancamento;
	private LocalDate dataLancamentoContaCorrenteCliente;
	private Long numeroEvento;
	private String descricaoGrupoPagamento;
	private Byte codigoIdentificadorUnico;
	private String nomeBanco;
	private Byte quantidadeLancamentoRemessa;
	private Integer numeroRaizCNPJ;
	private Byte numeroSufixoCNPJ;
	private BigDecimal valorLancamentoRemessa;
	private Long dateLancamentoContaCorrenteCliente;
	private Long dateEfetivaLancamento;

	/**
	 * @return the lancamentoContaCorrenteCliente
	 */
	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	/**
	 * @param lancamentoContaCorrenteCliente the lancamentoContaCorrenteCliente to set
	 */
	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	/**
	 * @return the dataEfetivaLancamento
	 */
	public LocalDate getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	/**
	 * @param dataEfetivaLancamento the dataEfetivaLancamento to set
	 */
	public void setDataEfetivaLancamento(LocalDate dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	/**
	 * @return the dataLancamentoContaCorrenteCliente
	 */
	public LocalDate getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	/**
	 * @param dataLancamentoContaCorrenteCliente the dataLancamentoContaCorrenteCliente to set
	 */
	public void setDataLancamentoContaCorrenteCliente(LocalDate dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	/**
	 * @return the numeroEvento
	 */
	public Long getNumeroEvento() {
		return numeroEvento;
	}

	/**
	 * @param numeroEvento the numeroEvento to set
	 */
	public void setNumeroEvento(Long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	/**
	 * @return the descricaoGrupoPagamento
	 */
	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	/**
	 * @param descricaoGrupoPagamento the descricaoGrupoPagamento to set
	 */
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	/**
	 * @return the codigoIdentificadorUnico
	 */
	public Byte getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	/**
	 * @param codigoIdentificadorUnico the codigoIdentificadorUnico to set
	 */
	public void setCodigoIdentificadorUnico(Byte codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	/**
	 * @return the nomeBanco
	 */
	public String getNomeBanco() {
		return nomeBanco;
	}

	/**
	 * @param nomeBanco the nomeBanco to set
	 */
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	/**
	 * @return the quantidadeLancamentoRemessa
	 */
	public Byte getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	/**
	 * @param quantidadeLancamentoRemessa the quantidadeLancamentoRemessa to set
	 */
	public void setQuantidadeLancamentoRemessa(Byte quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	/**
	 * @return the numeroRaizCNPJ
	 */
	public Integer getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	/**
	 * @param numeroRaizCNPJ the numeroRaizCNPJ to set
	 */
	public void setNumeroRaizCNPJ(Integer numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	/**
	 * @return the numeroSufixoCNPJ
	 */
	public Byte getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	/**
	 * @param numeroSufixoCNPJ the numeroSufixoCNPJ to set
	 */
	public void setNumeroSufixoCNPJ(Byte numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	/**
	 * @return the valorLancamentoRemessa
	 */
	public BigDecimal getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	/**
	 * @param valorLancamentoRemessa the valorLancamentoRemessa to set
	 */
	public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	/**
	 * @return the dateLancamentoContaCorrenteCliente
	 */
	public Long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	/**
	 * @param dateLancamentoContaCorrenteCliente the dateLancamentoContaCorrenteCliente to set
	 */
	public void setDateLancamentoContaCorrenteCliente(Long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	/**
	 * @return the dateEfetivaLancamento
	 */
	public Long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	/**
	 * @param dateEfetivaLancamento the dateEfetivaLancamento to set
	 */
	public void setDateEfetivaLancamento(Long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}
}
