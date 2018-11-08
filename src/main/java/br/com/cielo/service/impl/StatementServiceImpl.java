package br.com.cielo.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.repository.StatementRepository;
import br.com.cielo.resource.dto.ControleLancamento;
import br.com.cielo.resource.response.ControlesLancamentosResponse;
import br.com.cielo.service.StatementService;

@Service
public class StatementServiceImpl implements StatementService{

	@Autowired
	private StatementRepository repository;
	
	@Override
	public ControlesLancamentosResponse findStatements(Integer bankCode, Integer agency, Long account, LocalDate startDate,
			LocalDate endDate) {
		List<ControleLancamento> stms = this.repository.findStatementByBankCodeAndAgencyAndAccountAndDate(bankCode, agency, account, startDate, endDate);	
		return new ControlesLancamentosResponse(stms);
	}

}
