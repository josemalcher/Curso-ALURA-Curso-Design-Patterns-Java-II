package aula05_Visitor;

public class Numero implements Expressao{
	private int numero;
	
	public Numero(int numero){
		this.numero = numero;
	}

	@Override
	public int avalia() {
		
		return numero;
	}

	public int getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}

	public void aceita(Visitor impressora){
		impressora.visitaNumero(this);
	}
	
}
