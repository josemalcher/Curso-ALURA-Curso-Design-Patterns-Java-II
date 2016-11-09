package aula02_Flyweight;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		NotasMusicais notas = new NotasMusicais();

		List<Nota> doReMiFa = Arrays.asList(notas.pega("do"), notas.pega("re"), notas.pega("mi"), notas.pega("fa"),
				notas.pega("fa"), notas.pega("fa"));

		Piano piano = new Piano();
		piano.toca(doReMiFa);

	}
	/*
	 * Sempre que temos uma quantidade grande de objetos similares a serem
	 * instanciados, uma boa solução é fazer cache dessas instâncias e
	 * reutilizá-la. Para isso, a implementação é geralmenta fazer uso de uma
	 * fábrica, que controla as instâncias. Esse padrão é conhecido por
	 * flyweight.
	 */

}
