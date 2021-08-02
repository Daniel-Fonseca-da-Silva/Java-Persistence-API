package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
		.createEntityManagerFactory("JavaPersistenceAPI");
		EntityManager em = emf.createEntityManager();
		
		// Consulta por usuário
		Usuario usuario = em.find(Usuario.class, 7L);
		System.out.println("Nome: " + usuario.getNome() + "\n" + "email: " + usuario.getEmail());
		
		em.close();
		emf.close();
		
	}

}
