package co.edu.umanizales.grafociudadesapi.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "juguete", schema = "public", catalog = "grafo_ciudades")
public class JugueteEntity {
    private String codigo;
    private String tipo;

    public JugueteEntity(String codigo, String tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public JugueteEntity() {

    }

    @Id
    @Column(name = "codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "tipo")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JugueteEntity that = (JugueteEntity) o;
        return codigo == that.codigo && Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }
}
