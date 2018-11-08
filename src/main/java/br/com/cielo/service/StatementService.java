package br.com.cielo.service;

import java.time.LocalDate;

import br.com.cielo.resource.response.ControlesLancamentosResponse;

public interface StatementService {
	
	ControlesLancamentosResponse findStatements(Integer bankCode, Integer agency, Long account, LocalDate startDate, LocalDate endDate);

}
