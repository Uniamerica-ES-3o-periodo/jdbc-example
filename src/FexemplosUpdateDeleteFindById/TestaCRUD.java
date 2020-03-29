package FexemplosUpdateDeleteFindById;

import DdaoSample.Contato;
import DdaoSample.ContatoDAO;

import java.sql.SQLException;
import java.util.Calendar;

public class TestaCRUD {
    public static void main(String[] args) {

        ContatoDAO bd = new ContatoDAO();

        /*
         *  INSERE TRES CONTATOS NO BANCO
         *
         * */
        Contato contato = new Contato();
        contato.setNome("Frederick Moschkowich");
        contato.setEmail("frederick.nazario@pti.org.br");
        contato.setEndereco("Av. Tancredo neves");
        contato.setDataNascimento(Calendar.getInstance());
        bd.adiciona(contato);

        System.out.println("Gravado Frederick!");


        Contato contato2 = new Contato();
        contato2.setNome("Fabiano B. Neumann");
        contato2.setEmail("fabiano.neumann@uniamerica.br");
        contato2.setEndereco("Av. das Cataratas");
        contato2.setDataNascimento(Calendar.getInstance());
        bd.adiciona(contato2);

        System.out.println("Gravado Fabiano!");

        Contato contato3 = new Contato();
        contato3.setNome("Marcia David");
        contato3.setEmail("marcia.david@uniamerica.br");
        contato3.setEndereco("Av. das Cataratas");
        contato3.setDataNascimento(Calendar.getInstance());
        bd.adiciona(contato3);

        System.out.println("Gravado Marcia!");

        // Altera o 1o contato
//        contato.setId(15l);
//        contato.setNome("Frederick Moschkowich");
//        contato.setEmail("frederick.moschkowich@uniamerica.br");
//        contato.setEndereco("Av. das Cataratas");
//        contato.setDataNascimento(Calendar.getInstance());
//        bd.altera(contato);
//        System.out.println("Contato " + contato.getId() + " alterado com sucesso");

        // Remove o contato
//        bd.remove(contato);
//        System.out.println("Contato " + contato.getId() + " removido com sucesso");
    }
}
