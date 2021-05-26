package co.edu.umanizales.grafociudadesapi.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "arista", schema = "public", catalog = "grafo_ciudades")
@IdClass(AristaEntityPK.class)
public class AristaEntity {
    private int origen;
    private int destino;
    private double peso;

    @Id
    @Column(name = "origen")
    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    @Id
    @Column(name = "destino")
    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    @Id
    @Column(name = "peso")
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AristaEntity that = (AristaEntity) o;
        return origen == that.origen && destino == that.destino && Double.compare(that.peso, peso) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(origen, destino, peso);
    }
}
