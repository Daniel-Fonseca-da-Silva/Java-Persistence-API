package generics;

public class CaixaTipo {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<>();
		caixaA.guarda("Daniel");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guarda(3.14);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
	}

}
