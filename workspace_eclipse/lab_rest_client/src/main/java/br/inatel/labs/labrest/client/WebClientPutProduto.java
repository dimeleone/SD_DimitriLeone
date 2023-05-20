package br.inatel.labs.labrest.client;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import br.inatel.labs.labrest.client.model.dto.ProdutoDTO;

/*
 * @autor dimitri.leone
 * @since 13.05.2023
 */

public class WebClientPutProduto {

	public static void main(String[] args) {
		
		ProdutoDTO produtoExistente = new ProdutoDTO();
		produtoExistente.setId(1L);
		produtoExistente.setDescricao("Furadeira  bateria");
		
		ResponseEntity<Void> responseEntity = WebClient.create("http://localhost:8080")
				.put()
				.uri("/produto")
				.bodyValue(produtoExistente)
				.retrieve()
				.toBodilessEntity()
				.block();
		
		
		HttpStatusCode statusCode = responseEntity.getStatusCode();
		
		System.out.println("Status da resposta" + statusCode);
		
		
		
	}
}
