package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	// Define o campo id como 'AUTO_INCREMENT' com 'IDENTITY'
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Campos da tabela
	private Long id;
	
	private String nome;
	
	private String email;

	// Construtor deve ser vazio
	public Usuario() {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	// Metodos para inserir ou acesar
	public String getNome() 
	{
		return nome;
	}
	public String getEmail() 
	{
		return email;
	}
	public Long getId() {
		return id;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public void setId(Long id) 
	{
		this.id = id;
	}
	
}
