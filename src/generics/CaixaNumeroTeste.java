package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guarda(12.5);
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guarda(5);
		System.out.println(caixaB.abrir());
		
	}

}
