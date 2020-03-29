package AsimpleConnection;/*
* Teste simples de conexao com BD
* */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExemplo {
    public static void main(String[] args) throws SQLException {
//        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testeconexao", "postgres", "postgres"); PSQL
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/testeconexao", "root", "root"); // MYSQL/MariaDB
        System.out.println("Conectado!");
        conexao.close();
    }
}
