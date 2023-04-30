package br.inatel.labs.labjpa;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;
import br.inatel.labs.labjpa.dto.TotalCompradoPorFonecedorDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import br.inatel.labs.labjpa.service.RelatorioService;

/*
 * @autor dimitri.leone
 * @since 15.04.2023
 */

@SpringBootTest
public class RelatorioServiceTest {

	@Autowired
	private RelatorioService service;
	
	@Test
	public void test() {
		List<TotalCompradoPorFonecedorDTO> listaDTO = service.pesquisarTotalCompradoPorFornecedor();
		
		assertFalse(listaDTO.isEmpty());
		
		listaDTO.forEach(System.out::println);
	}
	
	
	
}
