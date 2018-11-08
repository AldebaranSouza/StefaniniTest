package br.com.cielo.resource;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.resource.response.ControlesLancamentosResponse;
import br.com.cielo.service.StatementService;

@RestController
@RequestMapping("/cielo/statement")
public class StatementResource {
	
	@Autowired
	private StatementService statementFacade;
	
	@GetMapping("/bank/{bank-code}/agency/{agency}/account/{account}/start-date/{start-date}/end-date/{end-date}")
	public ResponseEntity<ControlesLancamentosResponse> findStatement(@PathVariable("bank-code")final Integer bankCode, 
														@PathVariable("agency") final Integer agency,
														@PathVariable("account") final Long account,
														@PathVariable("start-date") @DateTimeFormat(pattern="dd-MM-yyyy") final LocalDate startDate,
														@PathVariable("end-date") @DateTimeFormat(pattern="dd-MM-yyyy") final LocalDate endDate) {
		ControlesLancamentosResponse response = this.statementFacade.findStatements(bankCode, agency, account, startDate, endDate);
		if(response.getLancamentos().isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(response);
	}

}
