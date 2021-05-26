package co.edu.umanizales.grafociudadesapi.controller;

import co.edu.umanizales.grafociudadesapi.domain.entities.VeterinariaEntity;
import co.edu.umanizales.grafociudadesapi.service.VeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/vaterinaria")
@Validated
public class VeterniariaController {
    private VeterinariaService veterinariaService;


    @Autowired
    public VeterniariaController(VeterinariaService veterinariaService) {
        this.veterinariaService = veterinariaService;
    }

    @GetMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET})
    public List<VeterinariaEntity> obtenerVeterinarias()
    {
        return veterinariaService.getVeterinariaList();
    }

    @PostMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.POST})
    public List<VeterinariaEntity> adicionarVeterinaria(@RequestBody VeterinariaEntity veterinaria)
    {
        return veterinariaService.adicionarVeterinaria(veterinaria);
    }
}
