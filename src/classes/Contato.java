package classes;

import java.util.Objects;

public final class Contato extends Pessoa implements Comparable<Contato>{
    public TipoRelacionamentoCliente tipoRelacionamentoCliente;

    public Contato(String nome, String numeroTelefone, TipoRelacionamentoCliente tipoRelacionamentoCliente) {
        super(nome, numeroTelefone);
        this.tipoRelacionamentoCliente = tipoRelacionamentoCliente;
    }

    public TipoRelacionamentoCliente getTipoRelacionamentoCliente() {
        return tipoRelacionamentoCliente;
    }

    public void setTipoRelacionamentoCliente(TipoRelacionamentoCliente tipoRelacionamentoCliente) {
        this.tipoRelacionamentoCliente = tipoRelacionamentoCliente;
    }

    @Override
    public String toString() {
        return "{" + super.toString() +
                ", tipoRelacionamentoCliente=" + tipoRelacionamentoCliente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this.getNumeroTelefone() == o && this.tipoRelacionamentoCliente != o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return getTipoRelacionamentoCliente() == contato.getTipoRelacionamentoCliente();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTipoRelacionamentoCliente());
    }

    @Override
    public int compareTo(Contato outroContato) {
        if (this.getCodigo() < outroContato.getCodigo()) {
            return -1;
        } if (this.getCodigo() > outroContato.getCodigo()) {
            return 1;
        }
        return 0;
    }
}
