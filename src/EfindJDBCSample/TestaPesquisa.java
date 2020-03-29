package EfindJDBCSample;

import BfactoryExample.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
*  Teste 01
*  Pesquisa Simples com result list e rs.next
* */
public class TestaPesquisa {
    public static void main(String[] args) {
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("select * from contatos");


            // executa um select
            ResultSet rs = stmt.executeQuery();

            // itera no ResultSet
            while (rs.next()) {
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");

                System.out.println(id + ": " + nome + " _ " + email);
            }

            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
