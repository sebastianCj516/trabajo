package co.edu.umanizales.grafociudadesapi.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "localidad", schema = "public", catalog = "grafo_ciudades")
public class LocalidadEntity {
    private String codigo;
    private String nombre;

    @Id
    @Column(name = "codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalidadEntity that = (LocalidadEntity) o;
        return Objects.equals(codigo, that.codigo) && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre);
    }
}
