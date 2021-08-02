package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {

		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guarda(2.3); // Double -> Double
		
		Double coisaA = (Double)caixaA.abrir();
		System.out.println(coisaA);	
	}

}
