package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.
		createEntityManagerFactory("JavaPersistenceAPI");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "SELECT U FROM Usuario U";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);
		
		List<Usuario> usuarios = query.getResultList();		
		for(Usuario usuario: usuarios)
		{
			System.out.println("Id: " + usuario.getId() +
					"\n" + "nome: " + usuario.getNome() +
					"\n" + "Email: " + usuario.getEmail() +
					"\n" + "-------------------------------"
					);
		}
		
		em.clear();
		emf.close();
		
	}

}
