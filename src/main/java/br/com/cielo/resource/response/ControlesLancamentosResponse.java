package br.com.cielo.resource.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.cielo.resource.dto.ControleLancamento;

public class ControlesLancamentosResponse implements Serializable{
	private static final long serialVersionUID = -7914465525956520292L;
	
	List<ControleLancamento> lancamentos;
	
	public ControlesLancamentosResponse() {
		this.lancamentos = new ArrayList<>();
	}

	public ControlesLancamentosResponse(List<ControleLancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}

	/**
	 * @return the lancamentos
	 */
	public List<ControleLancamento> getLancamentos() {
		return lancamentos;
	}

	/**
	 * @param lancamentos the lancamentos to set
	 */
	public void setLancamentos(List<ControleLancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}

}
