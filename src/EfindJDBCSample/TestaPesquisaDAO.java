package EfindJDBCSample;

import DdaoSample.Contato;
import DdaoSample.ContatoDAO;

import java.util.List;

/*
*  Teste 02
*  Utilizando a classe DAO, devolve a pesquisa e percorre uma List<Contato> utilizando o foreach
* */
public class TestaPesquisaDAO {
    public static void main(String[] args) {
        ContatoDAO dao = new ContatoDAO();
        List<Contato> contatos = dao.getLista();
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Endereço: " + contato.getEndereco());
            System.out.println("Data de Nascimento: " +
                    contato.getDataNascimento().getTime() + "\n");
        }
    }
}
