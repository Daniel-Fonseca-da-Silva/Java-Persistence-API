package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.
		createEntityManagerFactory("JavaPersistenceAPI");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Milton dos Anjos Ciqueira"
);
		usuario.setEmail("minjoqueira@email.com");
		
		// Faz a alteração
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
