
package erick.br.pdv.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoPostgresql implements Conexao{
    
    private Connection connection;
    private final String URL = "jdbc:postgresql://localhost:5432/teste";
    private final String USER = "postgres";
    private final String PASSWORD = "1991";

    @Override
    public Connection obterConexao() throws SQLException {
        if(connection == null) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }

    @Override
    public void fecharConexao() throws SQLException {
        if(connection != null)
            connection.close();
    }

}
