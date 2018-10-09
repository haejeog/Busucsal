package br.ucsal.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoUtil {

	private static Connection connection;
	static String url = "jdbc:hsqldb:hsql://localhost/banco";
	static String login = "SA";
	static String senha = "";
	static {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection(url, login, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;

	}
}
