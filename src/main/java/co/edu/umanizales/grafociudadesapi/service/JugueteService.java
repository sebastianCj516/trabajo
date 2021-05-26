package co.edu.umanizales.grafociudadesapi.service;

import co.edu.umanizales.grafociudadesapi.domain.entities.JugueteEntity;
import co.edu.umanizales.grafociudadesapi.domain.entities.JugueteEntity;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
public class JugueteService implements Serializable
{
    private List<JugueteEntity> jugueteList;

    public JugueteService()
    {
        jugueteList = new ArrayList<>();
        jugueteList.add(new JugueteEntity("01","rascador"));
        jugueteList.add(new JugueteEntity("02","raton"));
        jugueteList.add(new JugueteEntity("03","lana"));
    }

    public void setLista(List<JugueteEntity> lista) {
        this.jugueteList = lista;
    }

    public List<JugueteEntity> adicionarjuguete(JugueteEntity juguete)
    {
        jugueteList.add(juguete);
        return jugueteList;
    }

    public List<JugueteEntity> getJugueteList() {
        return jugueteList  ;
    }
}
