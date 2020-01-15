package br.com.virtus.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Dao<T> {

    protected Connection connection;
    protected PreparedStatement stmt;
    protected ResultSet rs;

    String url_conexao = "jdbc:mysql://localhost:3306/usuario";

    protected void openConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url_conexao,"najarin","brasil10");
    }

    protected void closeConnection() throws SQLException{
        if (connection != null && !connection.isClosed()){
            connection.close();
        }
    }

    public abstract T include(T element);

    public abstract T search(T element);

    public abstract int delete(int id);

}
