package co.edu.umanizales.grafociudadesapi.service;

import co.edu.umanizales.grafociudadesapi.domain.entities.VeterinariaEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VeterinariaService implements Serializable
{
    private List<VeterinariaEntity> veterinariaList;

    public VeterinariaService()
    {
        veterinariaList = new ArrayList<>();
        veterinariaList.add(new VeterinariaEntity("145","zoo","ENEA"));
        veterinariaList.add(new VeterinariaEntity("233","la granja","Leonora") );
        veterinariaList.add(new VeterinariaEntity("675","animal life","Vilamaria"));
    }

    public void setVeterinariaList(List<VeterinariaEntity> veterinariaList) {
        this.veterinariaList = veterinariaList;
    }

    public List<VeterinariaEntity> adicionarVeterinaria(VeterinariaEntity veterinaria)
    {
        veterinariaList.add(veterinaria);
        return veterinariaList;
    }

    public List<VeterinariaEntity> getVeterinariaList() { return veterinariaList;
    }
}
