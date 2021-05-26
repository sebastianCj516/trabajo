package co.edu.umanizales.grafociudadesapi.controller;

import co.edu.umanizales.grafociudadesapi.domain.entities.TipoUsuarioEntity;
import co.edu.umanizales.grafociudadesapi.service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="grafociudades/tipousuario")
@Validated
public class TipoUsuarioController {
    private TipoUsuarioService tipoUsuarioService;

    @Autowired
    public TipoUsuarioController(TipoUsuarioService tipoUsuarioService) {
        this.tipoUsuarioService = tipoUsuarioService;
    }

    @GetMapping
    public Iterable<TipoUsuarioEntity> getAllTipoUsuarios()
    {
        return tipoUsuarioService.getAllTipoUsuarios();
    }

    @GetMapping("/{id}")
    public TipoUsuarioEntity getTipoUsuarioById(@PathVariable("id") int id)
    {
        return tipoUsuarioService.getTipoUsuarioById(id);
    }

    @PostMapping
    public TipoUsuarioEntity saveTipoUsuario(@RequestBody TipoUsuarioEntity tipoUsuario)
    {
        return tipoUsuarioService.saveTipoUsuario(tipoUsuario);
    }
}
