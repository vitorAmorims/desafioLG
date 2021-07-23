package teste;

import java.util.*;

import classes.Cliente;
import classes.Contato;
import classes.TipoRelacionamentoCliente;
/*
Agradeço a oportunidade!!
 */

public class App {
    public static void main(String[] args) {
        Contato[] contatos = new Contato[4];
        Contato c1 = new Contato("Vitor", "23232432", TipoRelacionamentoCliente.PAI);
        Contato c2 = new Contato("Higor", "23232432", TipoRelacionamentoCliente.AMIGO);
        Contato c3 = new Contato("Lucas", "23232432", TipoRelacionamentoCliente.IRMAO);
        Contato c4 = new Contato("Lucas", "23232432", TipoRelacionamentoCliente.IRMAO);
        contatos[0] = c1;
        contatos[1] = c2;
        contatos[2] = c3;
        contatos[3] = c4;

        List<Contato> lista = Arrays.asList(contatos);

        Collections.sort(lista);

        Cliente cliente = new Cliente("Lucas", "232032", "lucas@teste.com");

        cliente.setContatos(lista);

        System.out.println(cliente);
    }
}
