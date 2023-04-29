package br.inatel.labs.labjpa.entity;
import java.math.BigDecimal;

/*
 * @autor dimitri.leone
 * @since 25.03.2023
 */

public class NotaCompraItem {

	private Long id;
	private NotaCompra notaCompra;
	private Produto produto;
	private BigDecimal valorCompraProduto;
	private Integer quantidade = 1;
	
	public BigDecimal getCalculoTotalItem() {
		return valorCompraProduto.multiply(BigDecimal.valueOf(quantidade));
	}
}
