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
	 * instanciados, uma boa solu��o � fazer cache dessas inst�ncias e
	 * reutiliz�-la. Para isso, a implementa��o � geralmenta fazer uso de uma
	 * f�brica, que controla as inst�ncias. Esse padr�o � conhecido por
	 * flyweight.
	 */

}
