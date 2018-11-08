package br.com.cielo.repository;

import java.time.LocalDate;
import java.util.List;

import br.com.cielo.resource.dto.ControleLancamento;

public interface StatementRepository {
	List<ControleLancamento> findStatementByBankCodeAndAgencyAndAccountAndDate(Integer bankCode, Integer agency, Long account, LocalDate startDate, LocalDate endDate);
}
