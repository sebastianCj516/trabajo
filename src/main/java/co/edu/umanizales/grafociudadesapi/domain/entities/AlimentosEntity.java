package co.edu.umanizales.grafociudadesapi.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "alimentos", schema = "public", catalog = "grafo_ciudades")
public class AlimentosEntity {
    private int codigo;
    private Integer nombre;
    private Integer tipo;




    public AlimentosEntity(String s, String equilibrio, String cachorro) {

    }

    public AlimentosEntity(int codigo, Integer nombre, Integer tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public AlimentosEntity() {

    }

    @Id
    @Column(name = "codigo")
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "nombre")
    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "tipo")
    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlimentosEntity that = (AlimentosEntity) o;
        return codigo == that.codigo && Objects.equals(nombre, that.nombre) && Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, tipo);
    }
}
