package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {

		CaixaInt caixaA = new CaixaInt();
		
		caixaA.guarda(127);
		
		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}

}
