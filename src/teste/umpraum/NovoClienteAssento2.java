package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento();
		assento.setNome("4D");
		Cliente cliente = new Cliente();
		cliente.setNome("Felipe");
		cliente.setAssento(assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
		
		
	}
	
}
