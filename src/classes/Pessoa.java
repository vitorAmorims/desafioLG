package classes;

import java.util.Random;

public class Pessoa {
    private int codigo;
    private String nome;
    private String numeroTelefone;

    public Pessoa(String nome, String numeroTelefone) {
        this.codigo = new Random().nextInt(100) + 1;
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }
    public Pessoa(){};

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'';
    }
}
