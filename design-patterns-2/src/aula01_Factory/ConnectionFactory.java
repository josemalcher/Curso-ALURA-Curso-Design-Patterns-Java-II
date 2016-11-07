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
	 * Quando precisamos isolar o processo de criação de um objeto, para
	 * facilitar a troca dele no futuro, levamos o processo de instanciação
	 * dessa classe para uma Factory.
	 * 
	 * No primeiro curso, tínhamos também um exemplo de um objeto que é difícil
	 * de ser criado. Demos o exemplo da classe NotaFiscal. Lá, uma nota fiscal
	 * era composta por nome da pessoa, ítens da nota, valor do imposto, e etc.
	 * Tudo isso tornava o objeto difícil de ser criado, e portanto fizemos uso
	 * de um Builder.
	 * 
	 * Factories e Builders são classes cuja responsabilidade é lidar com o
	 * processo de criação de objetos complexos. Faça uso de Factories sempre
	 * que a criação de um objeto possa mudar em algum momento.
	 */

}
