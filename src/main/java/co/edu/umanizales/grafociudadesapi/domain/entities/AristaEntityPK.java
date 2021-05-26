package co.edu.umanizales.grafociudadesapi.domain.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AristaEntityPK implements Serializable {
    private int origen;
    private int destino;
    private double peso;

    @Column(name = "origen")
    @Id
    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    @Column(name = "destino")
    @Id
    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    @Column(name = "peso")
    @Id
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
        AristaEntityPK that = (AristaEntityPK) o;
        return origen == that.origen && destino == that.destino && Double.compare(that.peso, peso) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(origen, destino, peso);
    }
}
