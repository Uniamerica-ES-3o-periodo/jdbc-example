package BfactoryExample;

import BfactoryExample.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) {
        System.out.println("Conectando ao banco");
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
        try {
            connection.close();
            System.out.println("Conexão fechada!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
