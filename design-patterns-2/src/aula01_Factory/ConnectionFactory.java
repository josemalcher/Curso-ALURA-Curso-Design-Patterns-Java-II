package aula01_Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");

			return conexao;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/*
	 * Quando precisamos isolar o processo de cria��o de um objeto, para
	 * facilitar a troca dele no futuro, levamos o processo de instancia��o
	 * dessa classe para uma Factory.
	 * 
	 * No primeiro curso, t�nhamos tamb�m um exemplo de um objeto que � dif�cil
	 * de ser criado. Demos o exemplo da classe NotaFiscal. L�, uma nota fiscal
	 * era composta por nome da pessoa, �tens da nota, valor do imposto, e etc.
	 * Tudo isso tornava o objeto dif�cil de ser criado, e portanto fizemos uso
	 * de um Builder.
	 * 
	 * Factories e Builders s�o classes cuja responsabilidade � lidar com o
	 * processo de cria��o de objetos complexos. Fa�a uso de Factories sempre
	 * que a cria��o de um objeto possa mudar em algum momento.
	 */

}
