package aula05_Visitor;

public interface Expressao {
	int avalia();
	void aceita(Visitor impressora);
}
