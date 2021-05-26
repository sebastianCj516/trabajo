package co.edu.umanizales.grafociudadesapi.controller;

import co.edu.umanizales.grafociudadesapi.domain.entities.GatoEntity;
import co.edu.umanizales.grafociudadesapi.domain.entities.GatoEntity;
import co.edu.umanizales.grafociudadesapi.service.GatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/gato")
@Validated
public class GatoController {
    private GatoService gatoService;

    @Autowired
    public GatoController(GatoService gatoService)
    {
        this.gatoService = gatoService;
    }

    @GetMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET})
    public List<GatoEntity> obtenerGatos()
    {
        return gatoService.getGatoList();
    }

    @PostMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.POST})
    public List<GatoEntity> adicionarGato(@RequestBody GatoEntity gato)
    {
        return gatoService.adicionarGato(gato);
    }

}
