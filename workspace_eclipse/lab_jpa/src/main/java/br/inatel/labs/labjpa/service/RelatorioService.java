package br.inatel.labs.labjpa.service;
import java.util.List;
import br.inatel.labs.labjpa.dto.TotalCompradoPorFonecedorDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/*
 * @autor dimitri.leone
 * @since 15.04.2023
 */

@Service
@Transactional
public class RelatorioService {

	@PersistenceContext
	private EntityManager em;
	
	
	public List<TotalCompradoPorFonecedorDTO> pesquisarTotalCompradoPorFornecedor(){
		String query = """
				select new br.inatel.labs.labjpa.dto.TotalCompradoPorFornecedorDTO
					(f.razaoSocial
				,sum(i.quantidade * i.valorCompraProduto)
				)
				from NotaCompraItem i
					join i.notaCompra n
					oin n.fornecedor f
				group by f.razaoSocial			
				""";
		return em.createQuery(query, TotalCompradoPorFonecedorDTO.class)
				.getResultList();
	}
}
