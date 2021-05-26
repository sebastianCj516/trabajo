package co.edu.umanizales.grafociudadesapi.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = " gato", schema = "public", catalog = "grafo_ciudades")
public class GatoEntity {
    private String codigo;
    private String nombre;
    private String raza;

    public GatoEntity(String codigo, String nombre, String raza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
    }

    public GatoEntity() {

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
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "raza")
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GatoEntity that = (GatoEntity) o;
        return codigo == that.codigo && Objects.equals(nombre, that.nombre) && Objects.equals(raza, that.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, raza);
    }
}
