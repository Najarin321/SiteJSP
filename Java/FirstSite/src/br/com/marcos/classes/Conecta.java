package br.com.marcos.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;

public class Conecta {
	
	public static void main(String[] args) {
		
		try {
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306","najarin","brasil10");
			
			
			System.out.println("Conectou!");
			
			conexao.close();
		}
		
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
