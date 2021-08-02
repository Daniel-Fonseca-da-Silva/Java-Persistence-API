package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// Name(nome),lentgh(tamanho caracteres), nullable(nulo)
	@Column(name = "prod_nome", length = 200, nullable = false)
	private String nome;
	
	// precision (tamanho varchar) scale(casa decimais)
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
	private Double preco;

	public Produto() {
		super();
		this.nome = nome;
		this.preco = preco;
		this.id = id;	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
