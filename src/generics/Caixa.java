package generics;

public class Caixa<T> {
	
	private T coisa;
	
	public void guarda(T coisa)
	{
		this.coisa = coisa;
	}
	
	public T abrir()
	{
		return coisa;
	}
	
}
