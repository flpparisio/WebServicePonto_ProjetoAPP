package br.com.integra.sistema.ponto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String URL = "jdbc:sqlserver://Felipe-Note:1433;databaseName=senior";
	private static final String USER = "sa";
	private static final String PASSWORD = "teste";

	public static Connection obtemConexao() throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
