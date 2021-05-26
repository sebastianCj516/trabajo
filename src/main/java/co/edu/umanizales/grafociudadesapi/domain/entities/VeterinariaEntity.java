package co.edu.umanizales.grafociudadesapi.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "veterinaria", schema = "public", catalog = "grafo_ciudades")
public class VeterinariaEntity {
    private String codigo;
    private String nombre;
    private String ubicacion;

    public VeterinariaEntity(String codigo, String nombre, String ubicacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public VeterinariaEntity() {

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
    @Column(name = "ubicacion")
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VeterinariaEntity that = (VeterinariaEntity) o;
        return codigo == that.codigo && Objects.equals(nombre, that.nombre) && Objects.equals(ubicacion, that.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, ubicacion);
    }
}
