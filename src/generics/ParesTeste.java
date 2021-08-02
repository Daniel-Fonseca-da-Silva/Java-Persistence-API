package generics;

public class ParesTeste {

	public static void main(String[] args) {

		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Fernanda");
		resultadoConcurso.adicionar(2, "Joaquim");
		resultadoConcurso.adicionar(3, "Pedro");
		resultadoConcurso.adicionar(4, "Daniel");
		resultadoConcurso.adicionar(5, "Luiz");
		resultadoConcurso.adicionar(5, "Gustavo");
		resultadoConcurso.adicionar(6, "Carla");
		resultadoConcurso.adicionar(7, "Felipe");
		resultadoConcurso.adicionar(8, "Paulo");
		resultadoConcurso.adicionar(2, "João");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(3));
		System.out.println(resultadoConcurso.getValor(5));
		
	}

}
