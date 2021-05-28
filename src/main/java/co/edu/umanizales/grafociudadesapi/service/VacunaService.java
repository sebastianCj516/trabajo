package co.edu.umanizales.grafociudadesapi.service;

import co.edu.umanizales.grafociudadesapi.domain.entities.VacunaEntity;
import co.edu.umanizales.grafociudadesapi.domain.entities.VeterinariaEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class VacunaService implements Serializable
{
    private List<VacunaEntity> vacunaList;

    public VacunaService()
    {
        vacunaList = new ArrayList<>();
        vacunaList.add(new VacunaEntity("001","tricat trio"));
        vacunaList.add(new VacunaEntity("002","rabia"));
        vacunaList.add(new VacunaEntity("003","leucemia"));
    }

    public void setVacunaList(List<VacunaEntity> vacunaList) {
        this.vacunaList = vacunaList;
    }

    public List<VacunaEntity> adicionarVacuna(VacunaEntity vacuna)
    {
        vacunaList.add(vacuna);
        return vacunaList;
    }

    public List<VacunaEntity> getVacunaList() { return vacunaList; }
}
