package aula05_Visitor;

public class Programa {
	public static void main(String[] args) {

		//Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda, direita);

		int resultado = soma.avalia();
		System.out.println(resultado);
		
		Visitor impressora = new ImpressoraVisitor();
		soma.aceita(impressora);
		
		
		
		

	}
}
