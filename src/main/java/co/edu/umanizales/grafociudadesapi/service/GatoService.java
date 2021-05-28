package co.edu.umanizales.grafociudadesapi.service;

import co.edu.umanizales.grafociudadesapi.domain.entities.GatoEntity;
import co.edu.umanizales.grafociudadesapi.domain.entities.GatoEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class GatoService {
    private List<GatoEntity> gatoList;

    public GatoService()
    {
        gatoList = new ArrayList<>();
        gatoList.add(new GatoEntity("123", "cloe", "siames"));
        gatoList.add(new GatoEntity("345", "simon", "angora"));
        gatoList.add(new GatoEntity("678","Don Gato","carey"));
    }


    public void setLista(List<GatoEntity> lista) {
        this.gatoList = lista;
    }

    public List<GatoEntity> adicionarGato(GatoEntity gato)
    {
        gatoList.add(gato);
        return gatoList;
    }

    public List<GatoEntity> getGatoList() {
        return gatoList;
    }
}
