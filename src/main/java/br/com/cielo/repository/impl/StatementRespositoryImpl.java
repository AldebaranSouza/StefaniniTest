package br.com.cielo.repository.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import br.com.cielo.adapter.LocalDateAdapter;
import br.com.cielo.repository.StatementRepository;
import br.com.cielo.resource.dto.ControleLancamento;

@Repository
public class StatementRespositoryImpl implements StatementRepository {

	@Value("${cielo.path.legacy.database}")
	private String pathLegacyDatabase;
	
	@Autowired
    private ApplicationContext appContext;

	@Override
	public List<ControleLancamento> findStatementByBankCodeAndAgencyAndAccountAndDate(Integer bankCode, Integer agency,
			Long account, LocalDate startDate, LocalDate endDate) {
		try {
			JsonParser jsonParser = new JsonParser();
			
			Resource resource = appContext.getResource("classpath:" + pathLegacyDatabase);
			JsonElement element = jsonParser.parse(new FileReader(resource.getFile().getPath()));
			Gson g = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).create();
			ControleLancamento[] array = g.fromJson(element.getAsJsonObject().get("listaControleLancamento").toString(),
					ControleLancamento[].class);

			List<ControleLancamento> list = new ArrayList<>();
			for (ControleLancamento controleLancamento : array) {
				list.add(controleLancamento);
			}
			return list.stream().filter(stm -> stm.getDataEfetivaLancamento().isAfter(startDate)
					&& stm.getDataEfetivaLancamento().isBefore(endDate)).collect(Collectors.toList());
		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
