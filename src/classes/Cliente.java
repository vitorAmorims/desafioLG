package classes;
import java.util.Arrays;
import java.util.List;

public final class Cliente extends Pessoa{
    private String email;
    private List<Contato> contatos;

    public Cliente(String nome, String numeroTelefone, String email) {
        super(nome, numeroTelefone);
        this.email = email;
    }
    public Cliente(){};

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() +
                "email='" + email + '\'' +
                ", contatos=" + contatos +
                '}';
    }

    //        return "Cliente{" +
//                "email='" + email + '\'' +
//
//                ", contatos=" + Arrays.toString(contatos) +
//                '}';

//        contatos.forEach(c -> System.out.println(c));

}
