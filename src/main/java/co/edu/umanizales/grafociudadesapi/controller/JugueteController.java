package co.edu.umanizales.grafociudadesapi.controller;

import co.edu.umanizales.grafociudadesapi.domain.entities.JugueteEntity;
import co.edu.umanizales.grafociudadesapi.service.JugueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/juguete")
@Validated
public class JugueteController {
    private JugueteService jugueteService;

    @Autowired
    public JugueteController(JugueteService jugueteService)
    {
        this.jugueteService=jugueteService;
    }

    @GetMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET})
    public List<JugueteEntity> obtenerJuguetes()
    {
        return jugueteService.getJugueteList();
    }

    @PostMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.POST})
    public List<JugueteEntity> adicionarJuguete(@RequestBody JugueteEntity juguete)
    {
        return jugueteService.adicionarjuguete(juguete);
    }
}
