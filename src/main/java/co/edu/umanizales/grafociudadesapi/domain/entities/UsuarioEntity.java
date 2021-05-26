package co.edu.umanizales.grafociudadesapi.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuario", schema = "public", catalog = "grafo_ciudades")
public class UsuarioEntity {
    private int id;
    private String correo;
    private String contrasenia;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "correo")
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Basic
    @Column(name = "contrasenia")
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return id == that.id && Objects.equals(correo, that.correo) && Objects.equals(contrasenia, that.contrasenia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, correo, contrasenia);
    }
}
