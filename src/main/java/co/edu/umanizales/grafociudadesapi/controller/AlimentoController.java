package co.edu.umanizales.grafociudadesapi.controller;

import co.edu.umanizales.grafociudadesapi.domain.entities.AlimentosEntity;
import co.edu.umanizales.grafociudadesapi.service.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/alimento")
@Validated
public class AlimentoController {
    private AlimentoService alimentoService;

    @Autowired
    public AlimentoController(AlimentoService alimentoService)
    {
        this.alimentoService=alimentoService;
    }

    @GetMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET})
    public List<AlimentosEntity> obtenerAlimentos()
    {
        return alimentoService.getAlimentoList();
    }

    @PostMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.POST})
    public List<AlimentosEntity> adicionarAlimento(@RequestBody AlimentosEntity Alimento)
    {
        return alimentoService.adicionarAlimento(Alimento);
    }
}
