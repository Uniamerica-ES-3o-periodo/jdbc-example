package BfactoryExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
//            return DriverManager.getConnection(
//                    "jdbc:postgresql://localhost:5432/testeconexao", "postgres", "postgres"); // PSQL
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/testeconexao", "root", "root"); // MySQL/MariaDB

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
