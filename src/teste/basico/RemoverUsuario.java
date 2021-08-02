package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.
		createEntityManagerFactory("JavaPersistenceAPI");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 8L);
		
		if(usuario != null)
		{
			em.getTransaction().begin();
			System.out.println("Usuario removido: " +
			usuario.getNome());
			
			em.remove(usuario);
			em.getTransaction().commit();
		}
		else
		{
			System.out.println("Usuario já deletado!");
		}
		
		em.close();
		emf.close();
	}

}
