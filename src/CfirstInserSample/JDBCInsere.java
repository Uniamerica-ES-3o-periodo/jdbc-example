package CfirstInserSample;

import BfactoryExample.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class JDBCInsere {
    public static void main(String[] args) {
        Connection connection = new ConnectionFactory().getConnection();
        try {

            String sql = "insert into contatos" +
                    " (nome,email,endereco,dataNascimento)" +
                    " values (?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, "Frederick");
            stmt.setString(2, "frederick.moschkowich@uniamerica.br");
            stmt.setString(3, "Av. das Cataratas");
            stmt.setDate(4, new java.sql.Date(
                    Calendar.getInstance().getTimeInMillis()));

            stmt.execute();
            stmt.close();

            System.out.println("Gravado!");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
