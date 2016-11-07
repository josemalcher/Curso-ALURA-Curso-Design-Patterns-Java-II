package aula01_Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MeuAplicativo {

	public static void main(String[] args) {
		
		//DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");
		Connection conexao = new ConnectionFactory().getConnection();

		//PreparedStatement ps = conexao.prepareStatement("select * from ...");
		// codigo continua aqui

	}

}
