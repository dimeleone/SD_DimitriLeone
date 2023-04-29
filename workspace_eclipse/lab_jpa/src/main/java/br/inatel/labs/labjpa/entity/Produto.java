package br.inatel.labs.labjpa.entity;
import java.util.List;

/*
 * @autor dimitri.leone
 * @since 25.03.2023
 */

public class Produto {

	private Long id;
	private List<Fornecedor> listaFornecedor;
	private String descricao;
}
