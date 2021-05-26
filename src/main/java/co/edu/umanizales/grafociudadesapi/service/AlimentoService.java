package co.edu.umanizales.grafociudadesapi.service;

import co.edu.umanizales.grafociudadesapi.domain.entities.AlimentosEntity;
import co.edu.umanizales.grafociudadesapi.domain.entities.AlimentosEntity;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
public class  AlimentoService implements Serializable {
    private List<AlimentosEntity> alimentoList;

    public AlimentoService()
    {
        alimentoList = new ArrayList<>();
        alimentoList.add(new AlimentosEntity("1","Equilibrio", "cachorro"));
        alimentoList.add(new AlimentosEntity("2","Agility Gold","adulto"));
        alimentoList.add(new AlimentosEntity("3","Chunki","cachorro"));
    }

    public void setLista(List<AlimentosEntity> lista) {
        this.alimentoList = lista;
    }

    public List<AlimentosEntity> adicionarAlimento(AlimentosEntity alimento)
    {
        alimentoList.add(alimento);
        return alimentoList;

    }
    public List<AlimentosEntity> getAlimentoList() {
        return alimentoList;
    }
}
