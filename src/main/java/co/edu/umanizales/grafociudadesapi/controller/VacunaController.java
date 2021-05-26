package co.edu.umanizales.grafociudadesapi.controller;

import co.edu.umanizales.grafociudadesapi.domain.entities.VacunaEntity;
import co.edu.umanizales.grafociudadesapi.service.VacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/vacuna")
@Validated
public class VacunaController {
    private VacunaService vacunaService;

    @Autowired
    public VacunaController(VacunaService vacunaService)
    {
        this.vacunaService = vacunaService;
    }

    @GetMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET})
    public List<VacunaEntity> obtenerVacunas()
    {
        return vacunaService.getVacunaList();
    }

    @PostMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.POST})
    public List<VacunaEntity> adicionarVacuna(@RequestBody VacunaEntity vacuna)
    {
        return vacunaService.adicionarVacuna(vacuna);
    }
}
