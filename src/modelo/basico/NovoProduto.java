package modelo.basico;

import infra.DAO;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setNome("Monitor Toshiba 23");
		produto.setPreco(659.99);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluirAtomico(produto).fecharDAO();
		
		System.out.println("Id do produto cadastrado: " + produto.getId() + "\n"
		+ "nome: " + produto.getNome() 
		+ "\n" + "preço: " + produto.getPreco());
	}

}
