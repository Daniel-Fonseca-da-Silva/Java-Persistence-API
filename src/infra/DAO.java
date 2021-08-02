package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try 
		{
			emf = Persistence.
			createEntityManagerFactory("JavaPersistenceAPI");
		}catch (Exception e) 
		{
			// logar -> log4j
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> teste() {
		return this;
	}
	
	public DAO<E> abrirTrans(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharTrans(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluirTrans(E entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade){
		return this.abrirTrans().incluirTrans(entidade).fecharTrans();
	}
	
	public E obterPorID(Object id) 
	{
		return em.find(classe, id);
	}
	
	public List<E> obterTodos() {
		return this.obterTodos(10, 0);
	}
	
	public List<E> obterTodos(int qtd, int deslocamento) {
		if(classe == null)
		{
			throw new UnsupportedOperationException("Classe nula");
		}
		
		String jpql = "SELECT e FROM " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtd);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	public void fecharDAO() {
		em.close();
	}
}
