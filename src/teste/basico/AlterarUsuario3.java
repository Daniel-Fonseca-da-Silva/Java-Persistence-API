package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.
		createEntityManagerFactory("JavaPersistenceAPI");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		
		//Detach retira o objeto do modo gerenciado
		em.detach(usuario);
		
		usuario.setNome("Daniel Fonsec@");
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
