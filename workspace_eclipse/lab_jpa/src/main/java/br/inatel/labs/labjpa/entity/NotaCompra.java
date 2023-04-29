package br.inatel.labs.labjpa.entity;
import java.util.List;
import java.time.LocalDate;
import java.math.BigDecimal;

/*
 * @autor dimitri.leone
 * @since 25.03.2023
 */

public class NotaCompra {

	private Long id;
	private List<NotaCompraItem> listaNotaCompraItem;
	private Fornecedor fornecedor;
	private LocalDate dataEmissao;
	
	public BigDecimal getCalculoTotalNota() {
		BigDecimal total = this.listaNotaCompraItem.stream()
				.map(i -> i.getCalculoTotalItem())
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		return total;
	}
}
