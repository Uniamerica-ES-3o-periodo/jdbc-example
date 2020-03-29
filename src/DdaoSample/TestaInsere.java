package DdaoSample;

import java.util.Calendar;

public class TestaInsere {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Frederick");
        contato.setEmail("frederick.moschkowich@uniamerica.br");
        contato.setEndereco("Av. das Cataratas");
        contato.setDataNascimento(Calendar.getInstance());

        // grave nessa conexão!!!
        ContatoDAO bd = new ContatoDAO();

        // método elegante
        bd.adiciona(contato);

        System.out.println("Gravado!");
    }
}
