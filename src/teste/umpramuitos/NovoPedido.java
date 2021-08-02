package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {

		DAO<Object> dao = new DAO<>();
		
		Produto produto = new Produto();
		Pedido pedido = new Pedido();
		produto.setNome("Geladeira a vapor moderna slim");
		produto.setPreco(5899.99);
		
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		dao
		.abrirTrans()
		.incluirTrans(produto)
		.incluirTrans(pedido)
		.incluirTrans(item)
		.fecharTrans()
		.fecharDAO();
	}

}
