package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento();
		assento.setNome("20A");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Marcos");
		cliente.setAssento(assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTrans()
		.incluirTrans(assento)
		.incluirTrans(cliente)
		.fecharTrans()
		.fecharDAO();
		
	}
}
