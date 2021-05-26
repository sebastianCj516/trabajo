package co.edu.umanizales.grafociudadesapi.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "vertice", schema = "public", catalog = "grafo_ciudades")
public class VerticeEntity {
    private int codigo;
    private String dato;

    @Id
    @Column(name = "codigo")
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "dato")
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VerticeEntity that = (VerticeEntity) o;
        return codigo == that.codigo && Objects.equals(dato, that.dato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, dato);
    }
}
