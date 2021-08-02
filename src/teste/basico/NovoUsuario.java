package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
		.createEntityManagerFactory("JavaPersistenceAPI");
		
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario();
		
		// Cria Usuario
		
		novoUsuario.setNome("Milton dos Anjos Ciqueira");
		novoUsuario.setEmail("milciojna@email.com");
		
		// Commita no bd
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		// Informa no terminal
		System.out.println("O seu Id gerado é: " + novoUsuario.getId());
		
		em.close();
		emf.close();
		
	}

}
